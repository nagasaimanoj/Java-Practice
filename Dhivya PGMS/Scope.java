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
    }

    public static void main(String[] args){
        ((Div)((new Scope())::divi)).divison(10, 20);
        System.out.println("ans : " + c);
    }
}