import Thread.MyThread;
public class Main {

    public static void main(String[] args) {
        MyThread a = new MyThread();
        Thread t1 = new Thread(a);
        t1.start();
    }
}
