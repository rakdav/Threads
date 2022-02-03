public class JThread extends Thread
{
    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started...\n",
                this.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finish...\n",
                this.currentThread().getName());
    }
}
