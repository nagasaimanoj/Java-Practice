public class cls2 {
    public static void main(String[] args) {

        Output o = new Output();

<<<<<<< HEAD
		Data d1 = new Data();
=======
        // 1st instance d1
        Data d1 = new Data();
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3

        o.print("static a = " + d1.a);
        o.print("non static b = " + d1.b);

<<<<<<< HEAD
		d1.a++;
		d1.b++;
=======
        // updating the variables in objects
        d1.a++;
        d1.b++;
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3

        o.print("static a = " + d1.a);
        o.print("non static b = " + d1.b);

<<<<<<< HEAD
		Data d2 = new Data();
=======
        // 2nd instance d2
        Data d2 = new Data();
        // Data d2 = d1.clone();
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3

        o.print("static a = " + d2.a);
        o.print("non static b = " + d2.b);

        o.print("static a = " + d1.a);
    }
}

class Data {
    static int a = 1;
    int b = 1;
}

class Output {
    void print(String str) {
        System.out.println(str);
    }
}