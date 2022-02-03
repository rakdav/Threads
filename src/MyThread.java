public class MyThread implements Runnable
{
    private boolean isActive;

    public MyThread()
    {
        this.isActive = false;
    }
    void disable()
    {
        isActive=true;
    }

    @Override
    public void run() {
        System.out.printf("%s started...\n",
                Thread.currentThread().getName());
        int count=1;
        while (isActive)
        {
            System.out.println("Loop "+count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s finish...\n",
                Thread.currentThread().getName());
    }
}
