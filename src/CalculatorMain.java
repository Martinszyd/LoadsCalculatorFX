import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage Stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("graphics.fxml"));
        Stage.setTitle("Loads Calculator");
        Stage.setScene(new Scene(root, 300, 275));
        Stage.show();
    }



}
