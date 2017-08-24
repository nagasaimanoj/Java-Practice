<<<<<<< HEAD
class Scope {
    public static void main(String args[]) {
        ((III) System.out::println).printThis("Hello World");
=======
<<<<<<< HEAD
class Scope{
    static int c;

    interface Div{
        public int divison(int a, int b);
    }

    public int divi(int a, int b){
        return c = b/a;
=======
class Scope {
    static int c;

    public static void main(String... a) {
        Scope s = new Scope();
        div d = s::divi;
        d.divison(10, 20);
        System.out.println("ans:" + c);
    }

    public int divi(int a, int b) {
        return c = b / a;
    }

    interface div {
        int divison(int a, int b);
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
>>>>>>> 33b134ffcfd6c8fe383a437bb67eba133b4b2029
    }
}

interface III {
    void printThis(String str);
}