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
    @FXML private Label LRdavit;

    @FXML protected void weightsCalc(MouseEvent event)
    {
        LogicsLB logicsLB = new LogicsLB();
        LogicsRB logicsRB = new LogicsRB();
        LogicsLR logicsLR = new LogicsLR();

        logicsLB.weightInLbCalc();
        LBin.setText(String.valueOf(logicsLB.weightInLB));
        logicsLB.totalWeightCalc();
        logicsLB.davitWeightCalc();

        logicsRB.weightInRbCalc();
        logicsRB.totalWeightCalc();
        logicsRB.davitWeightCalc();

        logicsLR.davitWeightCalc(String.valueOf(SWL.getText()));
        LRdavit.setText(String.valueOf(logicsLR.davitWeight));
    }

    @FXML protected void personWeight(MouseEvent e)
    {
        if (LB75.isSelected())
        {
            LBpersonWeight = 75;
        }
        else
        {
            LBpersonWeight = 82.5;
        }

        if (RB75.isSelected())
        {
            RBpersonWeight = 75;
        }
        else
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
        LBweight.setPromptText("Weight of the empty boat with equipment in kg");
        LBpeople.setPromptText("No. of People");
        RBweight.setPromptText("Weight of the empty boat with equipment in kg");
        RBpeople.setPromptText("No. of People");
        SWL.setPromptText("Davit's SWL");
    }

    @FXML private void initialize(){ }
}
