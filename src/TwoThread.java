public class TwoThread extends Thread
{
    public TwoThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started...\n",
                Thread.currentThread().getName());
        int counter=1;
        while (!isInterrupted())
        {
            System.out.println("Loop "+counter++);
        }
        System.out.printf("%s finish...\n",
                this.currentThread().getName());
    }
}
