import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        MenuController menuController = new MenuController();
        menuController.showStage();
    }
}
