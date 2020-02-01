public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        t.setName("Anastasia");
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());//активен не активен
        System.out.println(t.isInterrupted());//прерван не прерван
            Thread.sleep(3000);
        System.out.println(t);
        System.out.println("Main Thread start");

        for(int i=1;i<6;i++) {
            Thread th= new JThread("Fast" + i);
            th.start();
            th.join();
        }
        System.out.printf("main Thread finished");

        Thread myThread=new Thread(new RThread(),"MyRunThread");
        myThread.start();

    }
}
