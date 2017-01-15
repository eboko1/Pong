import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Computer {
    private GamePanel field;

    private int y=Pong.WINDOWS_HEIGHT/2;


    private  int yVelocity=0;
    private int width=15;
    private int height=40;

    public Computer(GamePanel game){
        this.field=game;
    }

    public void update(){

        y = y + yVelocity;

    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(Pong.WINDOWS_WIDTH-(35-width),y,width,height);

    }

    public int getX() {
        return 35;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
