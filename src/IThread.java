public class IThread implements Runnable {
    private boolean isActive;
    void disabled()
    {
        isActive=false;
    }
    @Override
    public void run() {
        System.out.printf("%s started \n",Thread.currentThread().getName());
        int count=1;
        while (isActive)
        {
            System.out.println("Loop "+count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s finished\n",Thread.currentThread().getName());
    }
}
