abstract class Test {
    public void method() {
        System.out.println("Abstract class is called");
    }
}

class Testing extends Test {
    public static void main(String[] a) {
        Test t = new Test() {
        };
        t.method();
    }
}