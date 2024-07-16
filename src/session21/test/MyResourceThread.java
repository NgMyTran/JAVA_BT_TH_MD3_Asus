package session21.test;

public class MyResourceThread extends Thread {
    private final MyThread myThread;
    private final String threadName;

    public MyResourceThread(MyThread myThread, String threadName) {
        this.myThread = myThread;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        myThread.printData(threadName);
    }
}
