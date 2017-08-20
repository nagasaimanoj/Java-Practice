abstract class Test {
    static void display() {
        System.out.println("Hello 1");
    }

    abstract void display2();
}

class Demo2 {
    public static void main(String args[]) {

<<<<<<< HEAD
    new Test() {
      void display2() {
        System.out.println("this is from 2");
      }
    }.display2();
  }
=======
        Test t1 = new Test() {
            void display2() {
                System.out.println("this is from 2");
            }
        };

        t1.display2();
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}