import processing.core.PApplet;

public class ProcessingText extends PApplet{

    public static final int WIDTH = 480;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 15;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;

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
        createBall1();
        createBall2();
        createBall3();
        createBall4();
    }

    private void createBall1() {
        ellipse(x1,HEIGHT / 5,DIAMETER, DIAMETER);
        x1 = x1 + 1;
    }
    private void createBall2() {
        ellipse(x2,(HEIGHT * 2) / 5,DIAMETER, DIAMETER);
        x2 = x2 + 2;
    }
    private void createBall3() {
        ellipse(x3,(HEIGHT * 3) / 5,DIAMETER, DIAMETER);
        x3 = x3 + 3;
    }
    private void createBall4() {
        ellipse(x4,(HEIGHT * 4) / 5,DIAMETER, DIAMETER);
        x4 = x4 + 4;
    }
 }
