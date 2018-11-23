import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.IOException;

public class CalculatorMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        String fxmlDocPath = "C:\\Users\\Martin\\IdeaProjects\\LoadsCalculatorFX\\src\\graphics.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
        AnchorPane root = loader.load(fxmlStream);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Loads Calculator");
        stage.show();
    }
}
