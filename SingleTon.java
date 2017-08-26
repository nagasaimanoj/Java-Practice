public class SingleTon {
    public static void main(String[] args) {
        SingleTonX.getInstance(1).printThis("This is working");
    }
}

class SingleTonX {
    static int count;
    private SingleTonX() {
    }

    static SingleTonX getInstance(int temp) {
        count = temp;
        return new SingleTonX();
    }

    void printThis(String temp) {
        System.out.println(temp);
    }
}