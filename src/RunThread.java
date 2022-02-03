public class RunThread  implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started...\n",
                Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finish...\n",
                Thread.currentThread().getName());
    }
}
