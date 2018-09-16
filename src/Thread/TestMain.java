package Thread;
import Service.Service0902;
import Thread.ThreadA0902;
import Thread.ThreadB0902;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestMain {
    static int i=0;
    static int runCount = 0;
    private static Timer timer = new Timer();
    static public class MyTask extends TimerTask{
        public void run(){
            System.out.println("正常执行了"+i);
        }
    }

    static public class MyTask1 extends TimerTask{
        public void run()
        {
            try {
                System.out.println("1 begin 运行了!时间为："+new Date());
                Thread.sleep(2000);
                System.out.println("1 end 运行了!时间为："+new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void test3()
    {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-09-16 15:07:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间" + new Date().toLocaleString());
            timer.schedule(task1, dateRef, 3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void test2()
    {
        while(true) {
            try{
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateString = "2018-09-16 14:28:00";
                Date dateRef = sdf.parse(dateString);
                timer.schedule(task, dateRef);
                timer.cancel();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
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
