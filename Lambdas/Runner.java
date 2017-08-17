public class Runner{
    public static void main(String args[]){
        
        ((PrintInterface)(x -> System.out.print(x))).printThis("this ");

        ((PrintInterface)(Runner::printThisToo)).printThis("is ");

        new PrintInterface(){
            public void printThis(String temp){
                System.out.print(temp);
            }        
        }.printThis("working");
    }

    static void printThisToo(String temp){
        System.out.print(temp);
    }
}

interface PrintInterface{
    void printThis(String temp);
}