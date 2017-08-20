public class superDoubt {
    public static void main(String args[]) {
        new SomeXYZ().run();
    }
}

class SomeXYZ {
    public void run() {
        System.out.println(toString().getClass());
        System.out.println(toString().getMethod());
    }
}