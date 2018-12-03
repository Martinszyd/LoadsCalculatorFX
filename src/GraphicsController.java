import javafx.fxml.FXML;
import javafx.print.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;


public class GraphicsController
{
    public GraphicsController(){}

    private static double LBpersonWeight;
    private static double RBpersonWeight;

    @FXML AnchorPane printScene;
    @FXML TextField LBweight;
    @FXML TextField LBpeople;
    @FXML TextField RBweight;
    @FXML TextField RBpeople;
    @FXML TextField SWL;

    @FXML private RadioButton LB825;
    @FXML private RadioButton LB75;
    @FXML private RadioButton RB75;
    @FXML private RadioButton RB825;

    @FXML private Label LBin;
    @FXML private Label LBtotal;
    @FXML private Label LBdavit;

    @FXML private Label RBin;
    @FXML private Label RBtotal;
    @FXML private Label RBdavit;

    @FXML private Label LRdavit;

    @FXML private Label LBwarningLabel;
    @FXML private Label RBwarningLabel;

    @FXML private void weightsCalc()
    {
        if (!LBweight.getText().equals("") && !LBpeople.getText().equals(""))
        {
            if (!LB75.isSelected() && !LB825.isSelected()) {
                LBpersonWeight = 0;
                LBwarningLabel.setText(String.valueOf("Choose person's weight!"));
            } else {
                LBwarningLabel.setText(String.valueOf(""));
            }
            LogicsLB logicsLB = new LogicsLB();
            logicsLB.weightInLbCalc(String.valueOf(LBweight.getText()), String.valueOf(LBpeople.getText()), getLBpersonWeight());
            LBin.setText(String.valueOf(logicsLB.weightInLB));
            logicsLB.totalWeightCalc(String.valueOf(LBweight.getText()), String.valueOf(LBpeople.getText()));
            LBtotal.setText(String.valueOf(logicsLB.totalWeight));
            logicsLB.davitWeightCalc();
            LBdavit.setText(String.valueOf(logicsLB.davitWeight));
        }

        if (!RBweight.getText().equals("") && !RBpeople.getText().equals(""))
        {
            if (!RB75.isSelected() && !RB825.isSelected())
            {
                RBpersonWeight = 0;
                RBwarningLabel.setText(String.valueOf("Choose person's weight!"));
            }
            else
            {
                RBwarningLabel.setText(String.valueOf(""));
            }
            LogicsRB logicsRB = new LogicsRB();
            logicsRB.weightInRbCalc(String.valueOf(RBweight.getText()), String.valueOf(RBpeople.getText()), getRBpersonWeight());
            RBin.setText(String.valueOf(logicsRB.weightInRB));
            logicsRB.totalWeightCalc(String.valueOf(RBweight.getText()), String.valueOf(RBpeople.getText()));
            RBtotal.setText(String.valueOf(logicsRB.totalWeight));
            logicsRB.davitWeightCalc();
            RBdavit.setText(String.valueOf(logicsRB.davitWeight));
        }

        if (!SWL.getText().equals("")) {
            LogicsLR.davitWeightCalc(String.valueOf(SWL.getText()));
            LRdavit.setText(String.valueOf(LogicsLR.davitWeight));
        }
    }

    @FXML protected void personWeight()
    {
        if (LB75.isSelected())
        {
            LBpersonWeight = 75.0;
        }
        if (LB825.isSelected())
        {
            LBpersonWeight = 82.5;
        }

        if (RB75.isSelected())
        {
            RBpersonWeight = 75;
        }
        if (RB825.isSelected())
        {
            RBpersonWeight = 82.5;
        }
    }
    private static double getLBpersonWeight()
    {
        return LBpersonWeight;
    }

    private static double getRBpersonWeight()
    {
        return RBpersonWeight;
    }

    @FXML private void clearFields()
    {
        LBweight.clear();
        LBpeople.clear();
        RBweight.clear();
        RBpeople.clear();
        SWL.clear();
    }

    @FXML private void printOutput()
    {
        Printer printer = Printer.getDefaultPrinter();
        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.EQUAL);
        PrinterJob job = PrinterJob.createPrinterJob();

        job.showPrintDialog(printScene.getScene().getWindow());// this is very useful it allows you to save the file as a pdf instead using all of your printer's paper. A dialog box pops up, allowing you to change the "name" option from your default printer to Adobe pdf.

            double pagePrintableWidth = pageLayout.getPrintableWidth();


            double scaleX = pagePrintableWidth;
            printScene.scaleXProperty().set(scaleX); // TO DO POPRAWKI

                boolean success = job.printPage(pageLayout, printScene);
                if (success)
                {
                    System.out.println("PRINTING SUCCESSFUL");
                    job.endJob();
                }

    }

    @FXML private void initialize(){ }
}
