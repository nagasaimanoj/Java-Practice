public class MultiThread2 {
    public static void main(String[] args) {
        java.util.ArrayList<Thread> threadList = new java.util.ArrayList<Thread>();

        Thread th = new Thread(new SampleX(1));
        th.setPriority(10);

		threadList.add(th);
        threadList.add(new Thread(new SampleX(2)));
        threadList.add(new Thread(new SampleX(3)));
        threadList.add(new Thread(new SampleX(4)));
        threadList.add(new Thread(new SampleX(5)));

        for (Thread eachItem : threadList) {
            eachItem.start();
            try {
                eachItem.sleep(2000);
            } catch (Exception ex) {
                System.err.println(ex);
            }
        }
    }
}

class SampleX implements Runnable {
    int threadNum;

    SampleX(int a) {
        threadNum = a;
    }

    @Override
    public void run() {
        while (true) {
            for (int counter = 1; counter <= threadNum; counter++)
                System.out.print("\t");
            System.out.println(threadNum);
        }
    }
}