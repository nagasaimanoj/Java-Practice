interface xyz {
    void printThis(String str);
}

public class Ex {
    public static void main(String[] args) {
        xyz x = Ex::someThing ();
        x.printThis("hi there");
    }

    void someThing(String sss) {
        System.out.println(sss + " this also works");
    }
}