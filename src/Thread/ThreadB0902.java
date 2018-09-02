package Thread;

import Service.Service0902;
public class ThreadB0902  extends Thread{
    private Service0902 service;
    public ThreadB0902(Service0902 service){
        super();
        this.service = service;
    }

    public void run() {
        service.stopMethod();
    }

}
