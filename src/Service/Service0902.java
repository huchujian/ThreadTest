package Service;

public class Service0902 {
    private boolean isContinueRun = false;
    public void runMethod()
    {
        while (isContinueRun == true) {
        }
        System.out.println("停下来了!");
    }

    public void stopMethod()
    {
        isContinueRun = false;
    }
}
