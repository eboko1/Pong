import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Player {
    private int y=250;


    private  int yVelocity=0;
    private int width=30;
    private int height=50;

    public Player(){}{

    }
    public void update(){

        y = y + yVelocity;

    }

    public void paint(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(75,y,width,height);

    }
    public void setYVelocity(int speed){
        yVelocity = speed;
    }
}//6.4
