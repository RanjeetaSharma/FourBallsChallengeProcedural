import processing.core.PApplet;

public class ProcessingText extends PApplet{

    public static final int WIDTH = 480;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 15;
    public static int ballPosition = 0;

    public static void main(String[] args){
        PApplet.main("ProcessingText", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
         }

    @Override
    public void draw() {
        for (int speed = 1; speed <= 4; speed++ ){
            drawBall(speed * ballPosition, speed * HEIGHT / 5);
        }
        ballPosition++;
    }

    private void drawBall(int position, int height) {
        ellipse(position,height,DIAMETER, DIAMETER);
    }
 }
