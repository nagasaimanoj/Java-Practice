public class BaseClass extends Extender implements interfaceI {
    public static void main(String[] args) {
        System.out.println("this is from Main \n" + new BaseClass().sum(1, 2));
    }

    public int sum(int x, int y) {
        return x + y;
    }
}