class anonymous
{
    public anonymous()
    {
         System.out.println("I am Excuting first");
    }
   public  void anonymousM()
   {
       
   }
}
public class OuterClass
{
    private int a =10;

    void OuterM()
    {
        System.out.println("I'm Outer'" + " " + a);
    }


// non-static inner class...

        //member inner class...
        class inner 
        {
            private int b = 20;

                void  InnerM()
                {
                System.out.println("I'm Inner'" + " " + a);OuterM();
                 }
        }

        // Local class...

        void Local()
        {
                class LocalClass
                {
                    int c = 5000;

                    void n()
                    {
                         System.out.println("I'm Local'" + " " + a++);

                    }
                }

                new LocalClass().n();
        }


        // anonymous class begins ....


         anonymous an = new anonymous()
          {
           
              public void anonymousM()
              {
                  System.out.println("Im anonymous");
              }
           };

           void createObj()
           {
             anonymous an = new anonymous();
             an.anonymousM();        //  new anonymous().anonymousM();
           }

// static class begins....

        static class staticClass
        {
           static int s = 200;
             
        }


        public static void main(String args[])
        {
            OuterClass o = new OuterClass();
            inner i = o.new inner();
            o.OuterM(); 
            i.InnerM();
            o.Local();
            o.createObj();
            System.out.println(OuterClass.staticClass.s);
           

        }
}