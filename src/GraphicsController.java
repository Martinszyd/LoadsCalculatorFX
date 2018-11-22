import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;


public class GraphicsController
{
    public GraphicsController(){}

    private static double LBpersonWeight;
    private static double RBpersonWeight;

    @FXML private URL location;
    @FXML private ResourceBundle resources;

    @FXML private TextField LBweight;
    private String LBweightStr;
    @FXML private TextField LBpeople;
    private String LBpeopleStr;
    @FXML private TextField RBweight;
    @FXML private TextField RBpeople;
    @FXML private TextField SWL;

    public String getLBweight()
    {
        return LBweightStr;
    }

    public String getLBpeople()
    {
        return LBpeopleStr;
    }

    public TextField getRBweight()
    {
        return RBweight;
    }

    public TextField getRBpeople()
    {
        return RBpeople;
    }

    public TextField getSWL()
    {
        return SWL;
    }

    @FXML private RadioButton LB825;
    @FXML private RadioButton LB75;
    @FXML private ButtonGroup group;
    @FXML private RadioButton RB75;
    @FXML private RadioButton RB825;

    @FXML protected void weightsCalc(MouseEvent event)
    {
        LBweightStr = String.valueOf(LBweight);
        LBpeopleStr = String.valueOf(LBpeople);
        LogicsLB logicsLB = new LogicsLB();
        LogicsRB logicsRB = new LogicsRB();
        LogicsLR logicsLR = new LogicsLR();

        logicsLB.weightInLbCalc();
        logicsLB.totalWeightCalc();
        logicsLB.davitWeightCalc();


        logicsRB.weightInRbCalc();
        logicsRB.totalWeightCalc();
        logicsRB.davitWeightCalc();

        logicsLR.davitWeightCalc(String.valueOf(SWL));
        //this.SWL = SWL;
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

    @FXML private void printOutput()
    {

    }

    @FXML private void initialize(){ }
}
