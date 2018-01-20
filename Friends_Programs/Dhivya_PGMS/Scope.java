class Scope {
    public static void main(String args[]) {
        ((III)System.out::println).printThis("Hello World");
    }

    interface III {
        void printThis(String str);
    }
}