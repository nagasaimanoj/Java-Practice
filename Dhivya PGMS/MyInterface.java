<<<<<<< HEAD
interface MyInterface{
   public void method1();
   public void method2();
}

class XYZ implements MyInterface{
  public void method1(){
      System.out.println("implementation of method1");
  }
  public void method2(){
      System.out.println("implementation of method2");
  }
  public static void main(String arg[]){
      MyInterface obj = new XYZ();
      obj.method1();
      obj.method2();
  }
=======
interface MyInterface {
    public void method1();

    public void method2();
}

class XYZ implements MyInterface {
    public static void main(String arg[]) {
        MyInterface obj = new XYZ();
        obj.method1();
        obj.method2();
    }

    public void method1() {
        System.out.println("implementation of method1");
    }

    public void method2() {
        System.out.println("implementation of method2");
    }
>>>>>>> 4d1cccb0929820a779501bd544eb3d506f76c6a3
}