import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.stage.Stage;

public class Game extends Application {
    Map map;
    Player player;
    Food food;


    @Override
    public void start(Stage primaryStage){

        music();
        map = new Map("C:\\Programming Projects\\pr\\src\\map1.txt");
        player = new MyPlayer(map);
        food = new Food(map,player);


        Scene scene = new Scene(map,400,400);


        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case RIGHT: player.moveRight(); break;
                case LEFT:  player.moveLeft();break;
                case UP:    player.moveUp(); break;
                case DOWN:  player.moveDown();break;
            }
        });
        primaryStage.setTitle("Eater");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args){Application.launch(args);}

    public void music(){
        String path = MyPlayer.class.getResource("theme.mp3").toString();
        Media media = new Media(path);
        AudioClip mp = new AudioClip(media.getSource());
        mp.setVolume(0.1);
        mp.play();
    }
}


