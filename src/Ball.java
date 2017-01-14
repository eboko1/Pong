import java.awt.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Ball {
    private int x=Pong.WINDOWS_WIDTH/2;
    private int y=Pong.WINDOWS_HEIGHT/2;

    private int xVelocity = -4; // move
    private int yVelocity = 4;
    private int size =10;

    public void update(){
        x = x + xVelocity;
        y = y + yVelocity;// - ball down   + ball up

        if (x<0  ){
            xVelocity=4;
        } else if(x>Pong.WINDOWS_WIDTH-size-7){
            xVelocity = -4;
        }
        if (y<0){
            yVelocity=4;
        } else if (y>Pong.WINDOWS_HEIGHT-size-33){
            yVelocity=-4;}
    }
        public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,size,size);
          // g.setColor(Color.RED);
         //  g.fillRect(x+40,y+40,20,20);
         }
        public void reverseDirection(){
            xVelocity = -xVelocity;
         }

        public void chackCollisionWith(Player player){
        if (this.x > player.getX()&& this.x<player.getX()+player.getWidth()){
            if (this.y > player.getY() && this.y < player.getY()+player.getHeight()){
                //ball has collide with player
                //System.out.println("Player Collision");
                reverseDirection();
            }
        }
    }
}
