class Acc {
    protected void msg() {
        System.out.println("Hello java");
    }
}

public class Simple extends Acc {
    public static void main(String args[]) {
        Simple obj = new Simple();
        obj.msg();
    }

    protected void msg() {
        System.out.println("Hello java");
    }//C.T.Error
}

class Simple1 {
    public static void main(String arg[]) {
        Simple ob = new Simple();
        ob.msg();
    }
}