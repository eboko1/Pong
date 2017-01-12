import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Player {
    private int y;


    private  int yVelocity=0;
    private int width=40;
    private int height=50;

    public Player(){}{

    }
    public void update(){

        y=y+yVelocity;

    }

    public void paint(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(75,y,width,height);

    }
    public void setyVelocity(int speed){
        yVelocity = speed;
    }
}//6.4
