import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Tooltip;

public class xo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Image imHouseOfBalloons = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/8/8a/The_Weeknd_-_House_of_Balloons.png/220px-The_Weeknd_-_House_of_Balloons.png");
        ImagePattern imPtHouseOfBalloons = new ImagePattern(imHouseOfBalloons);
        Circle cHouseOfBalloons = new Circle(40);
        cHouseOfBalloons.setStroke(Color.BLACK);
        cHouseOfBalloons.setCenterX(150);
        cHouseOfBalloons.setCenterY(80);
        cHouseOfBalloons.setFill(imPtHouseOfBalloons);
        Tooltip tHouseOfBalloons = new Tooltip("House of Balloons \n 2011");
        Tooltip.install(cHouseOfBalloons, tHouseOfBalloons);

        Circle dHouseOfBalloons = new Circle(190, 80, 3);
        dHouseOfBalloons.setFill(Color.GHOSTWHITE);
        dHouseOfBalloons.setStroke(Color.BLACK);
        PathTransition ptHouseOfBalloons = new PathTransition(Duration.millis(8000), cHouseOfBalloons, dHouseOfBalloons);
        ptHouseOfBalloons.setInterpolator(Interpolator.LINEAR);
        ptHouseOfBalloons.setOrientation(PathTransition.OrientationType.NONE);
        ptHouseOfBalloons.setCycleCount(Timeline.INDEFINITE);
        ptHouseOfBalloons.setAutoReverse(false);
        ptHouseOfBalloons.play();


        Image imThursday = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/d/dd/The_Weeknd_-_Thursday.png/220px-The_Weeknd_-_Thursday.png");
        ImagePattern imPtThursday = new ImagePattern(imThursday);
        Circle cThursday = new Circle(40);
        cThursday.setStroke(Color.BLACK);
        cThursday.setCenterX(250);
        cThursday.setCenterY(80);
        cThursday.setFill(imPtThursday);
        Tooltip tThursday = new Tooltip("Thursday \n 2011");
        Tooltip.install(cThursday, tThursday);

        Circle dThursday = new Circle(290, 80, 3);
        dThursday.setFill(Color.GHOSTWHITE);
        dThursday.setStroke(Color.BLACK);
        PathTransition ptThursday = new PathTransition(Duration.millis(8000), cThursday, dThursday);
        ptThursday.setInterpolator(Interpolator.LINEAR);
        ptThursday.setOrientation(PathTransition.OrientationType.NONE);
        ptThursday.setCycleCount(Timeline.INDEFINITE);
        ptThursday.setAutoReverse(false);
        ptThursday.play();

        Image imEchoesOfSilence  = new Image("https://upload.wikimedia.org/wikipedia/en/3/34/The_Weeknd_-_Echoes_of_Silence.png");
        ImagePattern  imPtEchoesOfSilence= new ImagePattern(imEchoesOfSilence);
        Circle cEchoesOfSilence = new Circle(40);
        cEchoesOfSilence.setStroke(Color.BLACK);
        cEchoesOfSilence.setCenterX(350);
        cEchoesOfSilence.setCenterY(80);
        cEchoesOfSilence.setFill(imPtEchoesOfSilence);
        Tooltip tEchoesOfSilence = new Tooltip("Echoes of Silence \n 2011");
        Tooltip.install(cEchoesOfSilence, tEchoesOfSilence);

        Circle dEchoesOfSilence = new Circle(390, 80, 3);
        dEchoesOfSilence.setFill(Color.GHOSTWHITE);
        dEchoesOfSilence.setStroke(Color.BLACK);
        PathTransition ptEchoesOfSilence = new PathTransition(Duration.millis(8000), cEchoesOfSilence, dEchoesOfSilence);
        ptEchoesOfSilence.setInterpolator(Interpolator.LINEAR);
        ptEchoesOfSilence.setOrientation(PathTransition.OrientationType.NONE);
        ptEchoesOfSilence.setCycleCount(Timeline.INDEFINITE);
        ptEchoesOfSilence.setAutoReverse(false);
        ptEchoesOfSilence.play();


        Image imKissLand = new Image("https://upload.wikimedia.org/wikipedia/ru/thumb/1/17/The_Weeknd_Kiss_Land.jpg/274px-The_Weeknd_Kiss_Land.jpg");
        ImagePattern imPtKissLand = new ImagePattern(imKissLand);
        Circle cKissLand = new Circle(40);
        cKissLand.setStroke(Color.BLACK);
        cKissLand.setCenterX(450);
        cKissLand.setCenterY(80);
        cKissLand.setFill(imPtKissLand);
        Tooltip tKissLand = new Tooltip("Kiss Land \n 2013");
        Tooltip.install(cKissLand, tKissLand);

        Circle dKissLand = new Circle(490, 80, 3);
        dKissLand.setFill(Color.LIMEGREEN);
        dKissLand.setStroke(Color.BLACK);
        PathTransition ptKissLand = new PathTransition(Duration.millis(8000), cKissLand, dKissLand);
        ptKissLand.setInterpolator(Interpolator.LINEAR);
        ptKissLand.setOrientation(PathTransition.OrientationType.NONE);
        ptKissLand.setCycleCount(Timeline.INDEFINITE);
        ptKissLand.setAutoReverse(false);
        ptKissLand.play();

        Image imBeautyBehindTheMadness = new Image("https://upload.wikimedia.org/wikipedia/ru/thumb/e/ec/Beautybehindthemadness.jpg/274px-Beautybehindthemadness.jpg");
        ImagePattern imPtBeautyBehindTheMadness = new ImagePattern(imBeautyBehindTheMadness);
        Circle cBeautyBehindTheMadness = new Circle(40);
        cBeautyBehindTheMadness.setStroke(Color.BLACK);
        cBeautyBehindTheMadness.setCenterX(550);
        cBeautyBehindTheMadness.setCenterY(80);
        cBeautyBehindTheMadness.setFill(imPtBeautyBehindTheMadness);
        Tooltip tBeautyBehindTheMadness = new Tooltip("Beauty Behind The Madness \n 2015");
        Tooltip.install(cBeautyBehindTheMadness, tBeautyBehindTheMadness);

        Circle dBeautyBehindTheMadness = new Circle(590, 80, 3);
        dBeautyBehindTheMadness.setFill(Color.GHOSTWHITE);
        dBeautyBehindTheMadness.setStroke(Color.BLACK);
        PathTransition ptBeautyBehindTheMadness = new PathTransition(Duration.millis(8000), cBeautyBehindTheMadness, dBeautyBehindTheMadness);
        ptBeautyBehindTheMadness.setInterpolator(Interpolator.LINEAR);
        ptBeautyBehindTheMadness.setOrientation(PathTransition.OrientationType.NONE);
        ptBeautyBehindTheMadness.setCycleCount(Timeline.INDEFINITE);
        ptBeautyBehindTheMadness.setAutoReverse(false);
        ptBeautyBehindTheMadness.play();


        Image imStarboy = new Image("https://upload.wikimedia.org/wikipedia/ru/thumb/e/e2/Starboysingle.jpg/274px-Starboysingle.jpg");
        ImagePattern imPtStarboy = new ImagePattern(imStarboy);
        Circle cStarboy = new Circle(40);
        cStarboy.setStroke(Color.BLACK);
        cStarboy.setCenterX(650);
        cStarboy.setCenterY(80);
        cStarboy.setFill(imPtStarboy);
        Tooltip tStarboy = new Tooltip("Starboy \n 2016");
        Tooltip.install(cStarboy, tStarboy);

        Circle dStarboy = new Circle(590, 80, 3);
        dStarboy.setFill(Color.DARKBLUE);
        dStarboy.setStroke(Color.BLACK);
        PathTransition ptStarboy = new PathTransition(Duration.millis(8000), cStarboy, dStarboy);
        ptStarboy.setInterpolator(Interpolator.LINEAR);
        ptStarboy.setOrientation(PathTransition.OrientationType.NONE);
        ptStarboy.setCycleCount(Timeline.INDEFINITE);
        ptStarboy.setAutoReverse(false);
        ptStarboy.play();


        Image imMyDearMelancholy = new Image("https://upload.wikimedia.org/wikipedia/ru/f/ff/My_Dear_Melancholy%2C.jpg");
        ImagePattern imPtMyDearMelancholy = new ImagePattern(imMyDearMelancholy);
        Circle cMyDearMelancholy = new Circle(40);
        cMyDearMelancholy.setStroke(Color.BLACK);
        cMyDearMelancholy.setCenterX(750);
        cMyDearMelancholy.setCenterY(80);
        cMyDearMelancholy.setFill(imPtMyDearMelancholy);
        Tooltip tMyDearMelancholy = new Tooltip("My Dear Melancholy \n 2018");
        Tooltip.install(cMyDearMelancholy, tMyDearMelancholy);


        Circle dMyDearMelancholy = new Circle(590, 80, 3);
        dMyDearMelancholy.setFill(Color.DARKORANGE);
        dMyDearMelancholy.setStroke(Color.BLACK);
        PathTransition ptMyDearMelancholy = new PathTransition(Duration.millis(8000), cMyDearMelancholy, dMyDearMelancholy);
        ptMyDearMelancholy.setInterpolator(Interpolator.LINEAR);
        ptMyDearMelancholy.setOrientation(PathTransition.OrientationType.NONE);
        ptMyDearMelancholy.setCycleCount(Timeline.INDEFINITE);
        ptMyDearMelancholy.setAutoReverse(false);
        ptMyDearMelancholy.play();

        Image imAfterHours= new Image("https://upload.wikimedia.org/wikipedia/ru/thumb/c/c1/The_Weeknd_-_After_Hours.png/274px-The_Weeknd_-_After_Hours.png");
        ImagePattern imPtAfterHours = new ImagePattern(imAfterHours);
        Circle cAfterHours = new Circle(40);
        cAfterHours.setStroke(Color.BLACK);
        cAfterHours.setCenterX(850);
        cAfterHours.setCenterY(80);
        cAfterHours.setFill(imPtAfterHours);
        Tooltip tAfterHours = new Tooltip("After Hours \n 2020");
        Tooltip.install(cAfterHours, tAfterHours);

        Circle dAfterHours = new Circle(890, 80, 3);
        dAfterHours.setFill(Color.DARKRED);
        dAfterHours.setStroke(Color.BLACK);
        PathTransition ptAfterHours = new PathTransition(Duration.millis(8000), cAfterHours, dAfterHours);
        ptAfterHours.setInterpolator(Interpolator.LINEAR);
        ptAfterHours.setOrientation(PathTransition.OrientationType.NONE);
        ptAfterHours.setCycleCount(Timeline.INDEFINITE);
        ptAfterHours.setAutoReverse(false);
        ptAfterHours.play();

        Pane root = new Pane();
        root.setPadding(new Insets(100));

        BackgroundImage myBI= new BackgroundImage(new Image("xoBackground.jpg",
                1000,600,
                false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(myBI));

        Group topAlbums = new Group();
        topAlbums.getChildren().addAll(cHouseOfBalloons, cThursday, cEchoesOfSilence, cKissLand,
                cBeautyBehindTheMadness, cStarboy, cMyDearMelancholy, cAfterHours,
                dAfterHours, dHouseOfBalloons, dThursday, dEchoesOfSilence,
                dKissLand, dBeautyBehindTheMadness, dMyDearMelancholy, dStarboy);

        root.getChildren().addAll(topAlbums);

        cKissLand.setOnMouseClicked(e ->{
            Pane kisspane = new Pane();
            BackgroundImage kBI= new BackgroundImage(new Image("kisslandBackground.jpg",
                    1000,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            kisspane.setBackground(new Background(kBI));
            /*TextArea kSongs = new TextArea(" Professional \n The Town \n Adaptation \n Love in the Sky \n Belong to the World " +
                    "\n Live For \n Wanderlust \n Kiss Land \n Pretty \n Tears in the Rain");
            kSongs.setDisable(false);
            kSongs.setPrefWidth(150);
            kSongs.setEditable(false);
            kSongs.setLayoutX(75);
            kSongs.setLayoutY(200);*/
            kisspane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(kisspane, 1000, 600 ));
        });

        //------------------ let me motherfucking love you <3 --------//
        cHouseOfBalloons.setOnMouseClicked(e ->{
            Pane hobpane = new Pane();
            BackgroundImage hobBI= new BackgroundImage(new Image("houseofballoonsBackground.jpg",
                    1440,600,
                        false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            hobpane.setBackground(new Background(hobBI));
            /*TextArea hobSongs = new TextArea(" High for This \n What You Need \n House of Balloons \n Glass Table Girls \n The Morning \n Wicked Games \n" +
                    " The Party & \n The After Party \n Coming Down \n Loft Music \n The Knowing \n Twenty Eight ");
            hobSongs.setDisable(false);
            hobSongs.setPrefWidth(150);
            hobSongs.setPrefHeight(215);
            hobSongs.setEditable(false);
            hobSongs.setLayoutX(75);
            hobSongs.setLayoutY(200);*/
            hobpane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(hobpane, 1000, 600 ));
        });

        cThursday.setOnMouseClicked(e ->{
            Pane thursdaypane = new Pane();
            BackgroundImage hobBI= new BackgroundImage(new Image("thursdayBackground.jpg",
                    1440,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            thursdaypane.setBackground(new Background(hobBI));
            /*TextArea hobSongs = new TextArea(" High for This \n What You Need \n House of Balloons \n Glass Table Girls \n The Morning \n Wicked Games \n" +
                    " The Party & \n The After Party \n Coming Down \n Loft Music \n The Knowing \n Twenty Eight ");
            hobSongs.setDisable(false);
            hobSongs.setPrefWidth(150);
            hobSongs.setPrefHeight(215);
            hobSongs.setEditable(false);
            hobSongs.setLayoutX(75);
            hobSongs.setLayoutY(200);*/
            thursdaypane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(thursdaypane, 1000, 600 ));
        });

        cEchoesOfSilence.setOnMouseClicked(e ->{
            Pane eospane = new Pane();
            BackgroundImage hobBI= new BackgroundImage(new Image("eosBackground.jpg",
                    1440,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            eospane.setBackground(new Background(hobBI));
            /*TextArea hobSongs = new TextArea(" High for This \n What You Need \n House of Balloons \n Glass Table Girls \n The Morning \n Wicked Games \n" +
                    " The Party & \n The After Party \n Coming Down \n Loft Music \n The Knowing \n Twenty Eight ");
            hobSongs.setDisable(false);
            hobSongs.setPrefWidth(150);
            hobSongs.setPrefHeight(215);
            hobSongs.setEditable(false);
            hobSongs.setLayoutX(75);
            hobSongs.setLayoutY(200);*/
            eospane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(eospane, 1000, 600 ));
        });

        cBeautyBehindTheMadness.setOnMouseClicked(e ->{
            Pane bbtmpane = new Pane();
            BackgroundImage hobBI= new BackgroundImage(new Image("bbtmBackground.jpg",
                    1440,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            bbtmpane.setBackground(new Background(hobBI));
            /*TextArea hobSongs = new TextArea(" High for This \n What You Need \n House of Balloons \n Glass Table Girls \n The Morning \n Wicked Games \n" +
                    " The Party & \n The After Party \n Coming Down \n Loft Music \n The Knowing \n Twenty Eight ");
            hobSongs.setDisable(false);
            hobSongs.setPrefWidth(150);
            hobSongs.setPrefHeight(215);
            hobSongs.setEditable(false);
            hobSongs.setLayoutX(75);
            hobSongs.setLayoutY(200);*/
            bbtmpane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(bbtmpane, 1000, 600 ));
        });

        cMyDearMelancholy.setOnMouseClicked(e ->{
            Pane mdmpane = new Pane();
            BackgroundImage hobBI= new BackgroundImage(new Image("mdmBackground.jpg",
                    1440,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            mdmpane.setBackground(new Background(hobBI));
            /*TextArea hobSongs = new TextArea(" High for This \n What You Need \n House of Balloons \n Glass Table Girls \n The Morning \n Wicked Games \n" +
                    " The Party & \n The After Party \n Coming Down \n Loft Music \n The Knowing \n Twenty Eight ");
            hobSongs.setDisable(false);
            hobSongs.setPrefWidth(150);
            hobSongs.setPrefHeight(215);
            hobSongs.setEditable(false);
            hobSongs.setLayoutX(75);
            hobSongs.setLayoutY(200);*/
            mdmpane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(mdmpane, 1000, 600 ));
        });

            //------------------------------
        cAfterHours.setOnMouseClicked(e ->{
            Pane ahpane = new Pane();
            BackgroundImage ahBI= new BackgroundImage(new Image("afterhoursBackground.jpg",
                    1000,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            ahpane.setBackground(new Background(ahBI));
            /*TextArea ahSongs = new TextArea("" +
                    " Alone Again \n Too Late \n Hardest to Love \n Scared to Live \n Snowchild \n Escape from LA \n Heartless \n " +
                    " Faith \n Blinding Lights \n In Your Eyes \n Save Your Tears \n Repeat After Me \n After Hours \n Until I Bleed Out ");
            ahSongs.setDisable(false);
            ahSongs.setPrefWidth(150);
            ahSongs.setPrefHeight(250);
            ahSongs.setEditable(false);
            ahSongs.setLayoutX(75);
            ahSongs.setLayoutY(200);*/
            ahpane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(ahpane, 1000, 600 ));}
            );
        //-------------------
        cStarboy.setOnMouseClicked(e ->{
            Pane spane = new Pane();
            BackgroundImage sBI= new BackgroundImage(new Image("starboyBackground.png",
                    1000,600,
                    false,true),
                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
            spane.setBackground(new Background(sBI));
            /*TextArea sSongs = new TextArea(" Starboy \n Party Monset \n False Alarm \n Reminder \n Rockin' \n " +
                    "Secrets \n True Colors \n Stargirl Interlude \n Sidewalks \n Six Feet Under \n " +
                    "Love to Lay \n A Lonely Night \n Attention \n Ordinary Life \n Nothing Without You \n All I Know \n " +
                    "Die for You \n I Feel It Coming");
            sSongs.setDisable(false);
            sSongs.setPrefWidth(150);
            sSongs.setEditable(false);
            sSongs.setLayoutX(75);
            sSongs.setLayoutY(200);*/
            spane.getChildren().addAll(topAlbums);
            primaryStage.setScene(new Scene(spane, 1000, 600 ));
        });

        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setTitle("The Weeknd");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    };

    public static void main(String[] args){
        Application.launch(args);
    }

}