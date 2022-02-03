public class MainClass
{
    public static void main(String[] args) {
//        Thread thread=Thread.currentThread();
//        System.out.println(thread.getName());
//        System.out.println(thread.getPriority());
//        System.out.println(thread.isAlive());
//        System.out.println(thread.isInterrupted());
//        System.out.println(thread.getThreadGroup().getName());
//        System.out.println(thread);

//        System.out.println("Main thread started...");
//        for (int i = 1; i < 6; i++) {
//            JThread th=new JThread("JThread "+i);
//            th.start();
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Main thread finished...");

//        System.out.println("Main thread started...");
//        for (int i = 1; i < 6; i++) {
//            Thread th=new Thread(new RunThread(),"RunThread "+i);
//            th.start();
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Main thread finished...");

        //
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();


//        System.out.println("Main thread started...");
//        MyThread myThread=new MyThread();
//        new Thread(myThread,"MyThread").start();
//        try {
//            Thread.sleep(1000);
//            myThread.disable();
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main thread finished...");

//        System.out.println("Main thread started...");
//        TwoThread t=new TwoThread("TwoThread");
//        t.start();
//        try {
//            Thread.sleep(100);
//            t.interrupt();
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main thread finished...");

//        CommonResource commonResource=new CommonResource();
//        for (int i = 1; i <6 ; i++) {
//            Thread t=new Thread(new CountThread(commonResource));
//            t.setName("Thread "+i);
//            t.start();
//        }
        Store store=new Store();
        Producer producer=new Producer(store);
        Consumer consumer=new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
