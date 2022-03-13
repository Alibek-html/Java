
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Tooltip Sample");
        stage.setWidth(300);
        stage.setHeight(150);

        Rectangle rect = new Rectangle(0, 0, 100, 100);
        Tooltip t = new Tooltip("A Square");
        Tooltip.install(rect, t);

        ((Group) scene.getRoot()).getChildren().add(rect);

        stage.setScene(scene);
        stage.show();
    }
}