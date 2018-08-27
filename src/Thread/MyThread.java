package Thread;
public class MyThread extends Thread {
    public MyThread()
    {
        System.out.println("MyThread start");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("MyThread end");
    }

    public void run()
    {
        System.out.println("run start");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run end");

    }

}
