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
    }

}