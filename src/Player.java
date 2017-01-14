import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Player {
    private int y=Pong.WINDOWS_HEIGHT/2;


    private  int yVelocity=0;
    private int width=15;
    private int height=40;

    public Player(){}{

    }
    public void update(){

        y = y + yVelocity;

    }

    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(75,y,width,height);

    }
    public void setYVelocity(int speed){
        yVelocity = speed;
    }
}//6.4
