public class Runner{
    public static void main(String args[]){
        PrintInterface ss;
        
        //arrow operator to define functionality
        ss = x -> System.out.print(x);
        ss.printThis("this");

        //double-colon operator to map functionality with existing function
        ss = Runner::printThisToo;
        ss.printThis(" is");

        //define logic while creating object for interface
        ss = new PrintInterface(){
            public void printThis(String z){
                System.out.print(z);
            }        
        };
        ss.printThis(" working");
    }
    static void printThisToo(String y){
        System.out.print(y);
    }
}

interface PrintInterface{
    void printThis(String x);
}