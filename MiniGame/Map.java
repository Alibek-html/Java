import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Map extends Pane {
    private int size;
    private int unit;
    int[][] map;
    private int rowtemp, columntemp;
    private GridPane mapPane = new GridPane();
    private Position start;


    Map(String nameOfTheMap) {
     rowtemp = 0;
     columntemp = 0;
     unit = 42;
     size = 0;
    File textMap = new File(nameOfTheMap);
    Scanner scanner = null;
    try {
        scanner = new Scanner(textMap);
    } catch (FileNotFoundException E) {
        System.err.println("Such file does not exist");
    }

    while (scanner.hasNext()) {
        String next = scanner.nextLine();
        String[] line = next.split(" ");
        for (String i : line) {
            if (!i.equals("0") && !i.equals("1") && !i.equals("2")) {
                size = Integer.parseInt(next);
                map = new int[size][size];
            } else if (i.equals("0")) {
                Rectangle platform = new Rectangle();
                platform.setHeight(Double.valueOf(unit));
                platform.setWidth(Double.valueOf(unit));
                platform.setStroke(Color.BLACK);
                Color color = Color.color (Math.random (), Math.random (), Math.random (), 0.3);
                platform.setFill (color);
                if (columntemp >= size) {
                    columntemp = 0;
                    rowtemp += 1;
                }
                mapPane.add(platform, columntemp, rowtemp);
                map[columntemp][rowtemp] = 0;
                columntemp += 1;
            } else if (i.equals("1")) {
                Rectangle wall = new Rectangle();
                wall.setHeight(Double.valueOf(unit));
                wall.setWidth(Double.valueOf(unit));
                wall.setFill(Color.DARKBLUE);
                wall.setStroke(Color.BLACK);
                if (columntemp > 7) {
                    columntemp = 0;
                    rowtemp += 1;
                }
                mapPane.add(wall, columntemp, rowtemp);
                map[columntemp][rowtemp] = 1;
                columntemp += 1;
            }
            else if(i.equals("2")){
                Rectangle platform = new Rectangle();
                platform.setHeight(Double.valueOf(unit));
                platform.setWidth(Double.valueOf(unit));
                platform.setStroke(Color.BLACK);
                Color color = Color.color (Math.random (), Math.random (), Math.random (), 0.3);
                platform.setFill (color);
                if (columntemp >= size){
                    columntemp = 0;
                    rowtemp += 1;
                }
                start = new Position(rowtemp, columntemp);
                mapPane.add(platform, columntemp, rowtemp);
                map[columntemp][rowtemp] = 0;
                columntemp += 1;
            }
        }
    }
        this.getChildren().add(mapPane);
    }

    public GridPane getMapPane() {
        return mapPane;
    }

    public int getSize() {
        return size;
    }

    public int getUnit() {
        return unit;
    }

    public int getValueAt(int a, int b){
        return map[a][b];
    }

    public Position getStartPosition() {
        return start;
    }
}
