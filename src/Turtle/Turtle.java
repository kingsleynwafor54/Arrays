package Turtle;

public class Turtle {

    private Pen pen;
    private Direction direction;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

public  void move( int numberOfSteps){

}

    public static void main(String[] args) {
        Turtle turtle=new Turtle();
        Pen pen=new Pen();
        SketchPad sketchPad=new SketchPad();
        turtle.setPen(pen);
        turtle.setDirection(Direction.EAST);
        turtle.getPen().changePosition(PenPosition.DOWN);
        turtle.move(12);
        turtle.getDirection();
       // boolean[] airline=new boolean[10];
    }

    private void move2(int[] commands, SketchPad sketchPad) {

    }
}
