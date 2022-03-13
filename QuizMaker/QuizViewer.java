
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.*;
import java.lang.String;
import java.io.File;
import java.util.Collections;

public class QuizViewer extends Application {
    public static int count = 0;
    public static String[] options;

    public static Quiz quiz;
    @Override
    public  void start(final Stage primaryStage){
        primaryStage.setTitle("QuizViewer");
        final FileChooser fileChooser = new FileChooser();
        final Button loadButton = new Button("Load File");

        loadButton.setOnAction(
                actionEvent -> {

                    File file = fileChooser.showOpenDialog(primaryStage);
                    if (file.toString().substring(file.toString().length() - 4).equals(".txt")) {
                        testpane testpane = new testpane();
;

                        try {
                            Quiz var1 = Quiz.loadFromFile(file.toString());
                            Collections.shuffle(var1.getQuestions());
                            quiz = var1;


                            String str = "";

                            for(int i = 0; i < quiz.getQuestions().size(); i++){
                                if(!quiz.getQuestions().get(i).getDescription().contains("{blank}")){
                                    str += quiz.getQuestions().get(i).toString() + "\n";
                                }
                            }
                            String temp[] = str.split("\n");

                            for(int i = 0; i < temp.length; i++){
                                if(temp[i].contains(") ")){
                                    count++;
                                }
                            }
                            options = new String[count];

                            for (int i = 0; i < options.length; i++){
                                for(int j = 0; j < temp.length; j++){
                                    if(temp[j].contains(") ")){
                                        options[i] = temp[j];
                                        i++;
                                    }
                                }
                            }

                            testpane.start(primaryStage);

                        } catch (InvalidQuizFormatException e) {
                            e.printStackTrace();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        TextArea exceptionLabel1 = new TextArea("InvalidQuizFormatException");
                        exceptionLabel1.setEditable(false);
                        exceptionLabel1.setPrefWidth(5.0);
                        exceptionLabel1.setPrefHeight(5.0);
                        Text exceptionLabel2 = new Text("The file selected does not fit the requirements for a \n standart Quiz text file format...");
                        AnchorPane forButton = new AnchorPane();
                        Button ok = new Button("OK");
                        forButton.getChildren().add(ok);
                        AnchorPane.setRightAnchor(ok, 10.0);
                        BorderPane rootError = new BorderPane();
                        rootError.setTop(exceptionLabel1);
                        rootError.setCenter(exceptionLabel2);
                        rootError.setBottom(forButton);


                        Scene secondScene = new Scene(rootError, 300, 200);

                        Stage excWindow = new Stage();
                        excWindow.setResizable(false);
                        excWindow.setTitle("Quiz Viewer: Error");
                        excWindow.setScene(secondScene);

                        excWindow.setX(primaryStage.getX() + 200);
                        excWindow.setY(primaryStage.getY() + 100);

                        excWindow.show();

                        ok.setOnAction(e -> {
                            try {
                                excWindow.close();
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        });
                    }

                    if (file != null) {
                        Quiz var1 = null;
                        try {
                            var1 = Quiz.loadFromFile(file.toString());
                        } catch (InvalidQuizFormatException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

        final GridPane pane = new GridPane();
        GridPane.setConstraints(loadButton,1,0);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(loadButton);

        primaryStage.setScene(new Scene(pane, 700, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args){
        Application.launch(args);
    }
}