import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Vika on 31.12.2016.
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener{
Player player = new Player();
Ball ball = new Ball();
Computer computer = new Computer(this);


public GamePanel(){
    Timer timer=new Timer(50,this);
    timer.start();

    this.addKeyListener(this);
    this.setFocusable(true);
}

    public void update(){
        player.update();
        ball.update();
        computer.update();

        ball.chackCollisionWith(player);
        ball.chackCollisionWith(computer);
  }
    public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,Pong.WINDOWS_WIDTH,Pong.WINDOWS_HEIGHT);


    player.paint(g);
    ball.paint(g);
    computer.paint(g);

    g.setColor(Color.WHITE);
   // g.drawLine(0,30,Pong.WINDOWS_WIDTH,30);
    g.drawLine(Pong.WINDOWS_WIDTH/2,0,Pong.WINDOWS_WIDTH/2,Pong.WINDOWS_HEIGHT);
    g.drawOval(Pong.WINDOWS_WIDTH/2-30,Pong.WINDOWS_HEIGHT/2-30,60,60);
    }
    public Ball getBall(){
        return ball;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()== KeyEvent.VK_UP){
         player.setYVelocity(-5);
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN){
             player.setYVelocity(5);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    int keyCode = e.getKeyCode();
    if (keyCode==KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN){
        player.setYVelocity(0);
    }

    }
}//finish
