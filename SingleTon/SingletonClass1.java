public class S1 {

    private static Si1 myObj;

    private SingletonClass1() {}

    public static SingletonClass1 getInstance() {
        if (myObj == null) {
            myObj = new SingletonClass1();

        }
        System.out.println(myObj);
        return myObj;

    }

    public static void main(String a[]) {
        SingletonClass1 st = SingletonClass1.getInstance();
        st.getSomeThing();
    }

    SingletonClass1

    public void getSomeThing() {
        System.out.println("I am here....");
    }
}