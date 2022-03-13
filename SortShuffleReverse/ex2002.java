import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

public class ex2002 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        VBox overall = new VBox();
        overall.setSpacing(20.0);
        HBox topSide = new HBox();
        Text text = new Text("Enter the number: ");
        TextField yourNum = new TextField();
        Button ent = new Button("enter");
        yourNum.setPromptText("write your numbers");
        yourNum.setPrefWidth(120.0);
        topSide.setSpacing(5.0);
        topSide.getChildren().addAll(text, yourNum, ent);
        topSide.setAlignment(Pos.CENTER);
        TextArea nums = new TextArea();
        nums.setPrefHeight(75);
        nums.setPrefWidth(500);
        nums.setEditable(false);
        HBox bottomSide = new HBox();
        Button sort = new Button("Sort");
        Button shuffle = new Button("Shuffle");
        Button reverse = new Button("Reverse");
        bottomSide.getChildren().addAll(sort,shuffle,reverse);
        bottomSide.setSpacing(20.0);
        bottomSide.setAlignment(Pos.CENTER);
        overall.getChildren().addAll(topSide,nums,bottomSide);
        root.getChildren().addAll(overall);
        BackgroundImage BI= new BackgroundImage(new Image("background3short.jpg",
                500,180,
                false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        root.setBackground(new Background(BI));


        LinkedList<Integer> myList = new LinkedList<>();
        ent.setOnAction(actionEvent -> {
            myList.add((Integer.parseInt(yourNum.getText())));
            nums.setText(myList.toString());
        });

        sort.setOnAction(actionEvent ->  {
            Collections.sort(myList);
            nums.setText(myList.toString());
        });

        shuffle.setOnAction(actionEvent -> {
            Collections.shuffle(myList);
            nums.setText(myList.toString());
        });

        reverse.setOnAction(actionEvent -> {
            Collections.reverse(myList);
            nums.setText(myList.toString());
        });

        stage.setScene(new Scene(root, 500, 180));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
