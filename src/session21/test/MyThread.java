package session21.test;

public class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printData(String threadName) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(threadName + ": " + ch);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}