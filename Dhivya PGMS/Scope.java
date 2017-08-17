class Scope{
    static int c;

    interface Div{
        public int divison(int a, int b);
    }

    public int divi(int a, int b){
        return c = b/a;
    }

    public static void main(String[] args){
        ((Div)((new Scope())::divi)).divison(10, 20);
        System.out.println("ans : " + c);
    }
}