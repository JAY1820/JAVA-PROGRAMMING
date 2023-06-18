import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class l8p2 extends Applet implements Runnable
{
	Thread t;
	int a=0;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
			while(true)
			{
				try
				{
					Thread.sleep(1000);
					a++;
					repaint();
					Thread.sleep(1000);
					a++;
					repaint();
					Thread.sleep(1000);
					a++;
					repaint();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
	}
	public void paint(Graphics g)
	{

		g.drawRect(30,30,300,100);
		g.setColor(Color.black);
		g.drawOval(50,50,50,50);
		g.drawOval(150,50,50,50);
		g.drawOval(250,50,50,50);
		if(a==1)
		{
				g.setColor(Color.red);
				g.fillOval(50,50,50,50);
		}
		if(a==2)
		{
				g.setColor(Color.orange);
				g.fillOval(150,50,50,50);
		}
		if(a==3)
		{
				g.setColor(Color.green);
				g.fillOval(250,50,50,50);
		}
	}
}

