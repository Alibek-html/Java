import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyPlayer implements Player {
    Circle ball;
    Map map;
    Position tempPosition;
    Position position;


    MyPlayer(Map map) {

        this.map = map;
        tempPosition = new Position(map.getStartPosition().getX() + map.getUnit()/2, map.getStartPosition().getY() + map.getUnit()/2);
        position = new Position(map.getStartPosition().getX(), map.getStartPosition().getY());
        ball = new Circle(map.getUnit() / 3 );
        ball.setStroke(Color.BLACK);
        ball.setFill(Color.ORANGE);
        ball.setCenterX(getTemp11().getX());
        ball.setCenterY(getTemp11().getY());

        map.getChildren().add(ball);
    }


        public void limitation () {
            if (tempPosition.getX() < map.getUnit()/2) {
                tempPosition.setX(map.getUnit()/2);
                position.setX(0);
                ball.setCenterX(getTemp11().getX());
                System.err.println("Invalid position!");
            }else
            if (tempPosition.getX() > map.getUnit()*map.getSize()) {
                tempPosition.setX(getTemp11().getX() - (map.getUnit()+1));
                position.setX(map.getSize()-1);
                ball.setCenterX(getTemp11().getX());
                System.err.println("Invalid position!");
            }else if(tempPosition.getY() < 0){
                tempPosition.setY(getTemp11().getY() + (map.getUnit()+1));
                position.setY(0);
                ball.setCenterY(getTemp11().getY());
                System.err.println("Invalid position!");
            }else if(tempPosition.getY() > map.getUnit()*map.getSize()){
                tempPosition.setY(getTemp11().getY() - (map.getUnit()+1));
                position.setY(map.getSize()-1);
                ball.setCenterY(getTemp11().getY());
                System.err.println("Invalid position!");
            }


        }

        @Override
        public void moveRight(){
           tempPosition.setX(tempPosition.getX()+map.getUnit() + 1);
           position.setX(position.getX() + 1);
           limitation();
            if(map.map[position.getX()][position.getY()] == 1){
                position.setX(position.getX()-1);
                tempPosition.setX(getTemp11().getX() - (map.getUnit()+1));
                ball.setCenterX(getTemp11().getX());
                System.err.println("Invalid position!");
            }
           ball.setCenterX(getTemp11().getX());

    }
        @Override
        public void moveLeft(){
            tempPosition.setX(tempPosition.getX() - map.getUnit() - 1);
            position.setX(position.getX() - 1);
            limitation();
            if(map.map[position.getX()][position.getY()] == 1){
                position.setX(position.getX()+1);
                tempPosition.setX(getTemp11().getX() + (map.getUnit()+1));
                ball.setCenterX(getTemp11().getX());
                System.err.println("Invalid position!");
            }
            ball.setCenterX(getTemp11().getX());
        }
        @Override
        public void moveUp(){
            tempPosition.setY(tempPosition.getY() - map.getUnit() - 1);
            position.setY(position.getY() - 1);
            limitation();
            if(map.map[position.getX()][position.getY()] == 1){
                position.setY(position.getY()+1);
                tempPosition.setY(getTemp11().getY() + (map.getUnit()+1));
                ball.setCenterY(getTemp11().getY());
                System.err.println("Invalid position!");
            }
            ball.setCenterY(getTemp11().getY());

        }
        @Override
        public void moveDown(){
            tempPosition.setY(tempPosition.getY()+ map.getUnit() + 1);
            position.setY(position.getY() + 1);
            limitation();
            if(map.map[position.getX()][position.getY()] == 1){
                position.setY(position.getY()-1);
                tempPosition.setY(getTemp11().getY() - (map.getUnit()+1));
                ball.setCenterY(getTemp11().getY());
                System.err.println("Invalid position!");
            }
            ball.setCenterY(getTemp11().getY());

        }


        public Position getTemp11(){ return tempPosition; }
    @Override
    public Position getPosition() {
        return position;
    }
}
