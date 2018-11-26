import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.web.PromptData;

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

    @FXML private Label LBwarningLabel;
    @FXML private Label RBwarningLabel;

    @FXML private void weightsCalc(MouseEvent event)
    {
        LogicsLB logicsLB = new LogicsLB();
        LogicsRB logicsRB = new LogicsRB();


        if (String.valueOf(LBweight)!="" && String.valueOf(LBpeople)!="")
        {
            if (!LB75.isSelected() && !LB825.isSelected()) {
                LBpersonWeight = 0;
                LBwarningLabel.setText(String.valueOf("Choose person's weight!"));
            } else {
                LBwarningLabel.setText(String.valueOf(""));
            }

            logicsLB.weightInLbCalc(String.valueOf(LBweight.getText()), String.valueOf(LBpeople.getText()), getLBpersonWeight());
            LBin.setText(String.valueOf(logicsLB.weightInLB));
            logicsLB.totalWeightCalc(String.valueOf(LBweight.getText()), String.valueOf(LBpeople.getText()), getLBpersonWeight());
            LBtotal.setText(String.valueOf(logicsLB.totalWeight));
            logicsLB.davitWeightCalc();
            LBdavit.setText(String.valueOf(logicsLB.davitWeight));
        }
            if (!RB75.isSelected() && !RB825.isSelected())
            {
                RBpersonWeight = 0;
                RBwarningLabel.setText(String.valueOf("Choose person's weight!"));
            }
            else
            {
                RBwarningLabel.setText(String.valueOf(""));
            }

        logicsRB.weightInRbCalc(String.valueOf(RBweight.getText()), String.valueOf(RBpeople.getText()), getRBpersonWeight());
        RBin.setText(String.valueOf(logicsRB.weightInRB));
        logicsRB.totalWeightCalc(String.valueOf(RBweight.getText()), String.valueOf(RBpeople.getText()),getRBpersonWeight());
        RBtotal.setText(String.valueOf(logicsRB.totalWeight));
        logicsRB.davitWeightCalc();
        RBdavit.setText(String.valueOf(logicsRB.davitWeight));

        LogicsLR logicsLR = new LogicsLR();
        logicsLR.davitWeightCalc(String.valueOf(SWL.getText()));
        LRdavit.setText(String.valueOf(logicsLR.davitWeight));
    }

    @FXML protected void personWeight(MouseEvent e)
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
        LBweight.setText(String.valueOf("Weight of the empty boat with equipment in kg"));
        LBpeople.setText(String.valueOf("No. of People"));
        RBweight.setText(String.valueOf("Weight of the empty boat with equipment in kg"));
        RBpeople.setText(String.valueOf("No. of People"));
        SWL.setText(String.valueOf("Davit's SWL"));
    }

    @FXML private void printOutput()
    {

    }

    @FXML private void initialize(){ }
}
