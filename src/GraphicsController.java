import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import java.net.URL;
import java.util.ResourceBundle;


public class GraphicsController
{
    public GraphicsController(){}

    private static double LBpersonWeight;
    private static double RBpersonWeight;

    @FXML private URL location;
    @FXML private ResourceBundle resources;

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

    @FXML protected void weightsCalc(MouseEvent event)
    {
        LogicsLB logicsLB = new LogicsLB();
        LogicsRB logicsRB = new LogicsRB();
        LogicsLR logicsLR = new LogicsLR();

        logicsLB.weightInLbCalc(String.valueOf(LBweight.getText()), String.valueOf(LBpeople.getText()), getLBpersonWeight());
        LBin.setText(String.valueOf(logicsLB.weightInLB));
        logicsLB.totalWeightCalc(String.valueOf(LBweight.getText()), String.valueOf(LBpeople.getText()), getLBpersonWeight());
        LBtotal.setText(String.valueOf(logicsLB.totalWeight));
        logicsLB.davitWeightCalc();
        LBdavit.setText(String.valueOf(logicsLB.davitWeight));

        logicsRB.weightInRbCalc(String.valueOf(RBweight.getText()), String.valueOf(RBpeople.getText()), getRBpersonWeight());
        RBin.setText(String.valueOf(logicsRB.weightInRB));
        logicsRB.totalWeightCalc(String.valueOf(RBweight.getText()), String.valueOf(RBpeople.getText()),getRBpersonWeight());
        RBtotal.setText(String.valueOf(logicsRB.totalWeight));
        logicsRB.davitWeightCalc();
        RBdavit.setText(String.valueOf(logicsRB.davitWeight));

        logicsLR.davitWeightCalc(String.valueOf(SWL.getText()));
        LRdavit.setText(String.valueOf(logicsLR.davitWeight));
    }

    @FXML protected void personWeight(MouseEvent e)
    {
        if (LB75.isSelected())
        {
            LBpersonWeight = 75;
        }

        if (LB825.isSelected())
        {
            LBpersonWeight = 82.5;
        }
        else
        {
            LBpersonWeight = 0;
        }

        if (RB75.isSelected())
        {
            RBpersonWeight = 75;
        }

        if (RB825.isSelected())
        {
            RBpersonWeight = 82.5;
        }
        else
        {
            RBpersonWeight = 0;
        }
    }
    static double getLBpersonWeight()
    {
        return LBpersonWeight;
    }

    static double getRBpersonWeight()
    {
        return RBpersonWeight;
    }

    @FXML private void clearFields()
    {
        LBweight.setPromptText(String.valueOf("Weight of the empty boat with equipment in kg"));
        LBpeople.setPromptText("No. of People");
        RBweight.setPromptText("Weight of the empty boat with equipment in kg");
        RBpeople.setPromptText("No. of People");
        SWL.setPromptText("Davit's SWL");
    }

    @FXML private void printOutput()
    {
        PrintingOutput printing = new PrintingOutput();
        printing.printOutput();
    }

    @FXML private void initialize(){ }
}
