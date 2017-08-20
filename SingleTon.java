public class SingleTon {
    public static void main(String[] args) {
        SingleTonX.getInstance(1).printThis("This is working");
    }
}

class SingleTonX {
    static int count;

<<<<<<< HEAD
    private SingleTonX() {
=======
    int count;

    SingleTonX() {
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
    }

    static SingleTonX getInstance(int temp) {
        count = temp;
        return new SingleTonX();
    }

    void printThis(String temp) {
        System.out.println(temp);
    }
}