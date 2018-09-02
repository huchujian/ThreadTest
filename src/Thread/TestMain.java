package Thread;
import Service.Service0902;
import Thread.ThreadA0902;
import Thread.ThreadB0902;

public class TestMain {
    public void test1()
    {
        try{
            Service0902 service = new Service0902();
            ThreadA0902 a = new ThreadA0902(service);
            ThreadB0902 b = new ThreadB0902(service);
            a.start();
            Thread.sleep(1000);
            b.start();
            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
