

class my1 extends Thread{
    
    public void run()
    {
        int i=0;
        while (i<10)
        {
        System.out.println("ok 1");
        i++;
            
        }
    }
}

class my2 extends Thread{
    public void run()
    {
        
       int i=10;
        while (i<20)
        {
        System.out.println("ok 1");
        i++;
            
        }
    }
}


public class p7
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		my1 t1=new my1();
		my2 t2=new my2();
		t1.start();
		t2.start();
		
	}
}
