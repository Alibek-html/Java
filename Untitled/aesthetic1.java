import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class aesthetic1 extends Application {
    @Override
    public void start(Stage primaryStage){

            String path = aesthetic1.class.getResource("thehills.mp3").toString();
            Media media = new Media(path);
            MediaPlayer mp = new MediaPlayer(media);
            mp.play();

        Pane root = new Pane();
        Group group = new Group();
        Rectangle first = new Rectangle(300,500);
        Rectangle second = new Rectangle(300, 500);
        Rectangle third = new Rectangle(300, 500);

        first.setFill(new ImagePattern(new Image("raingif.gif", 1920, 1080, false, true)));
        first.setStroke(Color.WHITE); first.setX(200); first.setY(200);

        second.setFill(new ImagePattern(new Image("nightgif1.gif", 1920, 1080, false, true)));
        second.setStroke(Color.WHITE); second.setX(650); second.setY(200);

        third.setFill(new ImagePattern(new Image("snowgif.gif", 1920, 1080, false, true)));
        third.setStroke(Color.WHITE); third.setX(1100); third.setY(200);

        root.setBackground(new Background(new BackgroundImage(new Image(
        "starsbackground1.jpg", 1920, 1080, false, true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));

        group.getChildren().addAll(first, second, third);
        root.getChildren().addAll(group);
;
        primaryStage.setScene(new Scene(root, 1600, 900));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args){ Application.launch(args); }
}
