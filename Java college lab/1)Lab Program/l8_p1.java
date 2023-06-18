//ThreadClass extends by the Thread class 
class ThreadClass extends Thread{
    //perameterized constructor for set thread name and priority
    public ThreadClass(String name,int priority){
        // call Thread constructor to set thread name
        super(name);
        //set the priority of the thread
        setPriority(priority);
    }
    //Override Run method
    public void run(){
        //indicate thread is start to execute
        System.out.println("Running Thread is "+ getName());
        //get limit variable
        int len=0;
        //for diffrent sleep time of thread 
        long sTime;
        len=getName()=="Thread 1"?5:getName()=="Thread 2"?6:getName()=="Thread 3"?7:0;
        sTime=getName()=="Thread 1"?1000:getName()=="Thread 2"?2000:getName()=="Thread 3"?3000:0;
        for(int i=1;i<=len;i++){
            System.out.println("Thread Name:"+getName()+"\n Number:"+i);
            //for check sleep is execute valid or Interrupted
            try {
                //set sleep time for particular thread
                sleep(sTime);
            } catch (InterruptedException e) {//if exception occur
                System.out.println(e);
            }
        } 
        System.out.println("Ended Thread is "+ getName());
    }
}
// Main method class
public class ThreadMain{
    public static void main(String[] args) {
        // create three threads
        ThreadClass t1=new ThreadClass("Thread 1", 3);
        ThreadClass t2=new ThreadClass("Thread 2", 2);
        ThreadClass t3=new ThreadClass("Thread 3", 1);
        //Display Main Thread Properties
        System.out.println("Main Thread Properties:");
        System.out.println("Thread Name:"+Thread.currentThread().getName()+", Priority:"+Thread.currentThread().getPriority()+", Group:"+Thread.currentThread().getThreadGroup().getName());
        //Display 3 Threads Properties
        System.out.println("3 Threads Properties:");
        System.out.println("Thread Name:"+t1.getName()+", Priority:"+t1.getPriority()+", Group:"+t1.getThreadGroup().getName());
        System.out.println("Thread Name:"+t2.getName()+", Priority:"+t2.getPriority()+", Group:"+t2.getThreadGroup().getName());
        System.out.println("Thread Name:"+t3.getName()+", Priority:"+t3.getPriority()+", Group:"+t3.getThreadGroup().getName());
        //it return false if thread is not Alive
        System.out.println("Before Start Method call:");
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
        System.out.println("Thread 3 is alive: " + t3.isAlive());
        //Three thread are start by start method
        t1.start();
        t2.start();
        t3.start();
        //it return true if thread is Alive
        System.out.println("After Start Method call:");
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
        System.out.println("Thread 3 is alive: " + t3.isAlive());

    }
}