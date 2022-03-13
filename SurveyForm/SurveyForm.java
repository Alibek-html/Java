import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SurveyForm extends Application {
    public static String name = null;
    public static boolean isStudent = true;
    public static String dayoweek = null;
    public static boolean diff = true;
    public static int sl = 0;
    public static int count = 0;


    @Override   
    public void start(Stage primaryStage){
        VBox root = new VBox();

        VBox vxtop = new VBox();
        Text question1 = new Text("What is your name?");
        TextField answer = new TextField();
        answer.setPromptText("your name has been written here");
        Text quiestion2 = new Text("Are you a student?");
        RadioButton r1 = new RadioButton("yes");
        RadioButton r2 = new RadioButton("no");
        ToggleGroup yesno = new ToggleGroup();
        r1.setToggleGroup(yesno);
        r2.setToggleGroup(yesno);
        vxtop.getChildren().addAll(question1,answer,quiestion2,r1,r2);
        vxtop.setSpacing(6.0);


        Pane paneMiddle = new Pane();
        VBox vxmiddle = new VBox();
        Text question3 = new Text("Which day of the week you have programming class?");
        ToggleGroup dayy = new ToggleGroup();
        CheckBox c1 = new CheckBox("Monday");
        CheckBox c2 = new CheckBox("Tuesday");
        CheckBox c3 = new CheckBox("Wednesday");
        CheckBox c4 = new CheckBox("Thursday");
        CheckBox c5 = new CheckBox("Friday");


        Text question4 = new Text("Do you find it difficult to learn JavaFX?");
        RadioButton a1 = new RadioButton("yes");
        RadioButton a2 = new RadioButton("no");
        ToggleGroup yesno2 = new ToggleGroup();
        a1.setToggleGroup(yesno2);
        a2.setToggleGroup(yesno2);
        vxmiddle.getChildren().addAll(question3,c1,c2,c3,c4,c5, question4,a1,a2);
        vxmiddle.setSpacing(6.0);
        paneMiddle.getChildren().add(vxmiddle);

        VBox bootomVb = new VBox();
        Slider slider = new Slider(0, 5, 1);
        slider.setMajorTickUnit(10);
        slider.setMinorTickCount(9);
        slider.setSnapToTicks(true);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setPrefWidth(100);

        Text question5 = new Text("on a scale of 0 to 5 how hard the quiz was for you");
        bootomVb.getChildren().addAll(question5, slider);
        bootomVb.setSpacing(4.0);

        Button submit = new Button("Submit");

        submit.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent actionEvent) {
                        infoPane infoPane = new infoPane();

                        name = answer.getText();

                        if(c1.isSelected()){
                            dayoweek = c1.getText();
                        }else if(c2.isSelected()){

                            dayoweek = c2.getText();
                        }else if(c3.isSelected()){
                            dayoweek = c3.getText();
                        }else if(c4.isSelected()){
                            dayoweek = c4.getText();
                        }else if(c5.isSelected()){
                            dayoweek = c5.getText();
                        }

                        if(a2.isSelected()){count++;
                            diff = !diff;
                        }else  count++;


                        try {
                            infoPane.start(primaryStage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }
        );


        slider.setOnMouseClicked(e -> {
            slider.setValue(slider.getValue());
            sl = (int) slider.getValue();
        });

        root.getChildren().addAll(vxtop, paneMiddle,bootomVb, submit);
        root.setSpacing(40.0);
        EventHandler<ActionEvent> nn = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (r2.isSelected()) {
                    c1.setDisable(true);
                    c2.setDisable(true);
                    c3.setDisable(true);
                    c4.setDisable(true);
                    c5.setDisable(true);
                    isStudent = !isStudent;
                } else if (r1.isSelected()) {

                }
            }
        };


        r2.setOnAction(nn);

        primaryStage.setScene(new Scene(root,700,500));

        primaryStage.setTitle("Survey Form");
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);
    }

}
