abstract class Myy {
    public void myMethod() {
        System.out.print("Abstract");
    }
}

class Poly extends Myy {
    public static void main(String a[]) {
        new Myy().myMethod();
    }
}