import javax.swing.*;

/**
 * Created by Vika on 31.12.2016.
 */
public class Pong extends JFrame{
     final static int WINDOWS_WIDTH=407;
     final static int WINDOWS_HEIGHT=283;


    public static void main (String args[]){
        new Pong();
    }


    public Pong(){
        setSize(WINDOWS_WIDTH,WINDOWS_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new GamePanel());
        setVisible(true);
    }
}
