class my1 implements Runnable{
    public void run()
    {
        System.out.println("my run1 ");
        System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");System.out.println("my run1 ");
    }
}


class my2 implements Runnable{
    public void run()
    {
        System.out.println("my run2 ");
    }
}


public class p8
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		my1 bullet1=new my1();
		Thread t1=new Thread(bullet1);
		my2 bullet2=new my2();
		Thread t2=new Thread(bullet2);
		
		
		t1.start();
		t2.start();
		
	}
}
