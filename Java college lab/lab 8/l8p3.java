import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class l8p3 extends Applet implements Runnable {
    
    static final long serialVersionUID = 1L;
    Thread t;
    boolean stop;

    public void init() {
        setBackground(Color.white);
    }

    public void start() {
        t = new Thread(this);
        stop = false;
        t.start();
    }

    public void run() {
        while (!stop) {
           // repaint();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void stop() {
        stop= true;
        t = null;
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(100, 100, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(100, 160, 50, 50);
        g.setColor(Color.green);
        g.fillOval(100, 220, 50, 50);
    }
}