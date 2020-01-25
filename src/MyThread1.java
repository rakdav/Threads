public class MyThread1 extends Thread
{
    private String name;

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Started "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stop "+Thread.currentThread().getName());
    }
}
