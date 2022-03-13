import javafx.application.Application;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;


public class testpane extends Application {

    public static int correctAnswers = 0 ;

    private int countDownOfTest;
    private int toggleStartIndex;
    private int numOfQuestion ;
    private int indexOfQuestion ;
    private int indexOfAnswer;

    public testpane() {
        this.countDownOfTest = 0;
        this.numOfQuestion = 1;
        this.indexOfQuestion = 0;
        this.indexOfAnswer = 0;
        this.toggleStartIndex = 0;
    }

    public testpane(int numOfQuestion, int indexOfQuestion, int indexOfAnswer){

        this.indexOfQuestion = indexOfQuestion;
        this.numOfQuestion = numOfQuestion;
        this.indexOfAnswer = indexOfAnswer;
    }

    public testpane(int numOfQuestion, int indexOfQuestion, int indexOfAnswer, int toggleStartIndex, int countDownOfTest){
        this.indexOfQuestion = indexOfQuestion;
        this.numOfQuestion = numOfQuestion;
        this.indexOfAnswer = indexOfAnswer;
        this.toggleStartIndex = toggleStartIndex;
        this.countDownOfTest = countDownOfTest;
    }

    static QuizViewer quizViewer = new QuizViewer();
    static String[] usAnswers = new String[5];
  

    @Override
    public void start(Stage stage) {
        Text status = new Text();
        status.setText("Status: " + numOfQuestion +"/5 questions.");
        if(countDownOfTest < 0) countDownOfTest = 0;

        if(countDownOfTest > 0){
            toggleStartIndex += 4;
        }else if(countDownOfTest == 0){
            toggleStartIndex = 0;
        }

        if(numOfQuestion <= 0){
            numOfQuestion = 1; status.setText("Status: " + numOfQuestion +"/5 questions.\n Start of the quiz!");
        }
        if(indexOfAnswer < 0){indexOfAnswer = 0;}
        if(indexOfQuestion < 0){indexOfQuestion = 0; }
        if(toggleStartIndex <= 0){ toggleStartIndex = 0;}
        if(toggleStartIndex >= quizViewer.options.length){ toggleStartIndex = quizViewer.options.length-4;}

            if(numOfQuestion > quizViewer.quiz.getQuestions().size()) {
            numOfQuestion = quizViewer.quiz.getQuestions().size();

            status.setText("Status: " + numOfQuestion +"/5 questions.\n End of the quiz!");
        }
        if(indexOfAnswer > quizViewer.quiz.getQuestions().size()-1){
            indexOfAnswer = quizViewer.quiz.getQuestions().size()-1;
        }
        if(indexOfQuestion > quizViewer.quiz.getQuestions().size()-1){
            indexOfQuestion = quizViewer.quiz.getQuestions().size()-1;
        }

         String[] trueAnswers = new String[quizViewer.quiz.getQuestions().size()];

        for (int i = 0; i < quizViewer.quiz.getQuestions().size(); i++){
            trueAnswers[i] = quizViewer.quiz.getQuestions().get(i).getAnswer();
        }


        stage.setTitle("QuizViewer");
        VBox topSide = new VBox();
        VBox bottomSide = new VBox();
        TextArea question = new TextArea();
        question.setEditable(false);
        topSide.getChildren().add(question);

        AnchorPane arrows = new AnchorPane();
        Button back = new Button("<<");
        Button next = new Button(">>");
        arrows.getChildren().addAll(back,next);
        AnchorPane.setRightAnchor(next, 0.0);
        AnchorPane.setLeftAnchor(back, 0.0);
        topSide.getChildren().add(arrows);

        VBox selection = new VBox();
        RadioButton radio1, radio2, radio3, radio4;
        radio1= new RadioButton(quizViewer.options[toggleStartIndex].substring(3,quizViewer.options[toggleStartIndex].length()));
        radio2= new RadioButton(quizViewer.options[toggleStartIndex+1].substring(3,quizViewer.options[toggleStartIndex+1].length()));
        radio3= new RadioButton(quizViewer.options[toggleStartIndex+2].substring(3,quizViewer.options[toggleStartIndex+2].length()));
        radio4= new RadioButton(quizViewer.options[toggleStartIndex+3].substring(3,quizViewer.options[toggleStartIndex+3].length()));
        ToggleGroup question1= new ToggleGroup();

        radio1.setToggleGroup(question1);
        radio2.setToggleGroup(question1);
        radio3.setToggleGroup(question1);
        radio4.setToggleGroup(question1);
        selection.getChildren().addAll(radio1,radio2,radio3,radio4);
        selection.setAlignment(Pos. CENTER);

        if(usAnswers[indexOfAnswer] != null && usAnswers[indexOfAnswer].equals(quizViewer.options[toggleStartIndex].substring(3,quizViewer.options[toggleStartIndex].length()))){
            radio1.setSelected(true);
        }else if(usAnswers[indexOfAnswer] != null && usAnswers[indexOfAnswer].equals(quizViewer.options[toggleStartIndex+1].substring(3,quizViewer.options[toggleStartIndex+1].length()))){
            radio2.setSelected(true);
        }else if(usAnswers[indexOfAnswer] != null && usAnswers[indexOfAnswer].equals(quizViewer.options[toggleStartIndex+2].substring(3,quizViewer.options[toggleStartIndex+2].length()))){
            radio3.setSelected(true);
        }else if(usAnswers[indexOfAnswer] != null && usAnswers[indexOfAnswer].equals(quizViewer.options[toggleStartIndex+3].substring(3,quizViewer.options[toggleStartIndex+3].length()))){
            radio4.setSelected(true);
        }



            Pane pane = new Pane();
        HBox hx = new HBox();
        TextField answer;
        if (usAnswers[indexOfAnswer] != null){ answer = new TextField(usAnswers[indexOfAnswer]);}else{
        answer = new TextField();}
        answer.setPromptText("Enter your answer");
        PseudoClass empty = PseudoClass.getPseudoClass("empty");
        answer.pseudoClassStateChanged(empty, answer.getText().isEmpty());

        answer.textProperty().isEmpty().addListener((obs, wasEmpty, isNowEmpty) -> answer.pseudoClassStateChanged(empty, isNowEmpty));
        answer.setAlignment(Pos.CENTER);
        answer.setPrefWidth(120);
        hx.getChildren().add(answer);
        pane.getChildren().add(hx);

        HBox check = new HBox();
        Button scrapeBtn = new Button();
        scrapeBtn.setText("Check Answers");
        check.getChildren().add(scrapeBtn);
        check.setAlignment(Pos.CENTER_RIGHT);

        AnchorPane arrowsB = new AnchorPane();
        arrowsB.getChildren().addAll(status, check);
        AnchorPane.setRightAnchor(check, 0.0);
        AnchorPane.setLeftAnchor(status, 0.0);
        bottomSide.getChildren().add(arrowsB);

        question.setText(quizViewer.quiz.getQuestions().get(indexOfQuestion).getDescription().replaceAll("\\{blank}","______"));

        BorderPane rootPane = new BorderPane();
        rootPane.setPadding(new Insets(30));
        rootPane.setTop(topSide);
        if(quizViewer.quiz.getQuestions().get(indexOfQuestion).getDescription().contains("{blank}")){
            rootPane.setCenter(answer);
        }
        else{rootPane.setCenter(selection);}
        rootPane.setBottom(bottomSide);

        EventHandler<ActionEvent> previousButton = actionEvent -> {

            if(radio1.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex].substring(3,quizViewer.options[toggleStartIndex].length());
            }else if(radio2.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+1].substring(3,quizViewer.options[toggleStartIndex+1].length());
            }else if(radio3.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+2].substring(3,quizViewer.options[toggleStartIndex+2].length());
            }else if(radio4.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+3].substring(3,quizViewer.options[toggleStartIndex+3].length());
            }else {
                usAnswers[indexOfAnswer] = answer.getText();
            }

            testpane testpane;
            if(!quizViewer.quiz.getQuestions().get(indexOfQuestion).getDescription().contains("{blank}")){
                testpane = new testpane(--numOfQuestion, --indexOfQuestion, --indexOfAnswer, 0, countDownOfTest = countDownOfTest - 1);
            }else testpane = new testpane(--numOfQuestion, --indexOfQuestion, --indexOfAnswer, 0, countDownOfTest);

            try {
                testpane.start(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        EventHandler<ActionEvent> nextButton = actionEvent -> {

            if(radio1.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex].substring(3,quizViewer.options[toggleStartIndex].length());
            }else if(radio2.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+1].substring(3,quizViewer.options[toggleStartIndex+1].length());
            }else if(radio3.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+2].substring(3,quizViewer.options[toggleStartIndex+2].length());
            }else if(radio4.isSelected()){
                usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+3].substring(3,quizViewer.options[toggleStartIndex+3].length());
            }else {
                usAnswers[indexOfAnswer] = answer.getText();
            }testpane testpane;

            if(!quizViewer.quiz.getQuestions().get(indexOfQuestion).getDescription().contains("{blank}") && countDownOfTest == 0){
                testpane = new testpane(++numOfQuestion, ++indexOfQuestion, ++indexOfAnswer, 0, ++countDownOfTest);
            }
            else testpane = new testpane(++numOfQuestion, ++indexOfQuestion, ++indexOfAnswer, 0, countDownOfTest);

            try {
                testpane.start(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        back.setOnAction(previousButton);
        next.setOnAction(nextButton);
        scrapeBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Stage newWindows = new Stage();

                if(radio1.isSelected()){
                    usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex].substring(3,quizViewer.options[toggleStartIndex].length());
                }else if(radio2.isSelected()){
                    usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+1].substring(3,quizViewer.options[toggleStartIndex+1].length());
                }else if(radio3.isSelected()){
                    usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+2].substring(3,quizViewer.options[toggleStartIndex+2].length());
                }else if(radio4.isSelected()){
                    usAnswers[indexOfAnswer] = quizViewer.options[toggleStartIndex+3].substring(2,quizViewer.options[toggleStartIndex+3].length());
                }else {
                    usAnswers[indexOfAnswer] = answer.getText();
                }

                for(int i = 0 ;i < usAnswers.length; i++){

                    if(usAnswers[i].toLowerCase().equals(trueAnswers[i].toLowerCase())){
                        correctAnswers++;
                    }

                }
                if(correctAnswers > 5){
                    correctAnswers = correctAnswers - 5;
                }

                BorderPane root = new BorderPane();
                TextArea res = new TextArea("Number of correct answers: " + testpane.correctAnswers + "/" + testpane.quizViewer.quiz.getQuestions().size());
                res.setPrefHeight(5.0);
                res.setPrefWidth(5.0);
                res.setEditable(false);
                Text info = new Text("You may try again.");
                Button ok = new Button("OK");
                ok.setOnAction(new EventHandler<ActionEvent>() {
                                   @Override
                                   public void handle(ActionEvent actionEvent) {
                                       correctAnswers = 0;
                                       newWindows.close();
                                   }
                               }
                );


                AnchorPane bottom = new AnchorPane();
                AnchorPane.setRightAnchor(ok, 4.0);
                AnchorPane.setLeftAnchor(info, 4.0);
                bottom.getChildren().addAll(ok,info);

                root.setTop(res);
                root.setBottom(bottom);

                newWindows.setScene(new Scene(root, 300, 150));
                newWindows.show();
            }
        });

        stage.setScene(new Scene(rootPane, 700, 500));
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }}
