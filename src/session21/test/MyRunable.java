package session21.test;

public class MyRunable implements Runnable {

    @Override
    public void run() {
        for (int i = -1; i >= -10; i--) {
            System.out.println(i);
            try {
                //setruntime after 1 second
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
