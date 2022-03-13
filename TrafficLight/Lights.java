import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class Lights extends Application {
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        BorderPane borderPane = new BorderPane();
        StackPane pane = new StackPane();

        HBox hx = new HBox();
        Label label = new Label("Traffic Lights");
       //label.setPadding(new Insets(20,20,20,120));
        label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20));
        hx.getChildren().addAll(label);
        hx.setAlignment(Pos.CENTER);


        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(60);
        rectangle.setHeight(200);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);
        rectangle.setFill(Color.WHITE);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        Circle circle1 = new Circle(25); circle1.setStrokeWidth(2); circle1.setStroke(Color.BLACK); circle1.setFill(Color.WHITE);
        Circle circle2 = new Circle(25); circle2.setStrokeWidth(2); circle2.setStroke(Color.BLACK); circle2.setFill(Color.WHITE);
        Circle circle3 = new Circle(25); circle3.setStrokeWidth(2); circle3.setStroke(Color.BLACK); circle3.setFill(Color.WHITE);
        vbox.getChildren().addAll(circle1,circle2,circle3);
        pane.getChildren().addAll(rectangle,vbox);
        borderPane.setCenter(pane);
        borderPane.setTop(hx);

        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10,10,10,10));
        RadioButton Red = new RadioButton("Red");
        RadioButton Yellow = new RadioButton("Yellow");
        RadioButton Green = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        Red.setToggleGroup(group);
        Yellow.setToggleGroup(group);
        Green.setToggleGroup(group);

        Red.setOnAction(e -> {
            circle1.setFill(Color.RED);
            circle2.setFill(Color.WHITE);
            circle3.setFill(Color.WHITE);
        });
        Yellow.setOnAction(e -> {
            circle1.setFill(Color.WHITE);
            circle2.setFill(Color.YELLOW);
            circle3.setFill(Color.WHITE);
        });
        Green.setOnAction(e -> {
            circle1.setFill(Color.WHITE);
            circle2.setFill(Color.WHITE);
            circle3.setFill(Color.GREEN);
        });

        CheckBox bold = new CheckBox("BOLD");
        CheckBox italic = new CheckBox("Italic");
        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        EventHandler<ActionEvent> handler = e -> {
            if (bold.isSelected() && italic.isSelected()) {
                label.setFont(fontBoldItalic);
            }
            else if (bold.isSelected()) {
                label.setFont(fontBold);
            }
            else if (italic.isSelected()) {
                label.setFont(fontItalic);            }
            else {
                label.setFont(fontNormal);
            }
        };
        bold.setOnAction(handler);
        italic.setOnAction(handler);

        hbox.getChildren().addAll(Red, Yellow, Green, bold, italic);
        borderPane.setBottom(hbox);


        Scene scene = new Scene(borderPane, 450, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Traffic Lights");
        primaryStage.show();
    }
}