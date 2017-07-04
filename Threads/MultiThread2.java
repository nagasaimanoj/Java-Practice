import java.util.ArrayList;

public class MultiThread2 {
    public static void main(String[] args) {

        ArrayList<Thread> threadList = new ArrayList<Thread>();
        threadList.add(new Thread(new SampleX(1)));
        threadList.add(new Thread(new SampleX(2)));
        threadList.add(new Thread(new SampleX(3)));
        threadList.add(new Thread(new SampleX(4)));
        threadList.add(new Thread(new SampleX(5)));

        threadList.get(0).setPriority(10);
        threadList.get(1).setPriority(1);
        threadList.get(2).setPriority(1);
        threadList.get(3).setPriority(1);
        threadList.get(4).setPriority(1);

        for (Thread eachItem : threadList) {
            eachItem.start();
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