public class JThread extends Thread
{
    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started \n",Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrapted");
        }
        System.out.printf("%s finished \n",Thread.currentThread().getName());
    }
}
