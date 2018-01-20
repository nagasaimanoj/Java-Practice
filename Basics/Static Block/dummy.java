class dummy {
    public static void main(String args[]) {
        data d = new data() {
            {
                System.out.println("duplicate instance block called");
                setA(5);
                setB(6);
            }
        };
        System.out.println(d.a + " " + d.b);
    }
}

class data {
    static int a, b;

    public void setA(int temp) {
        a = temp;
    }

    public void setB(int temp) {
        b = temp;
    }

    static {
        System.out.println("static called");
    }
    {
        System.out.println("original instance block called");
    }
}