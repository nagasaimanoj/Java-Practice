public class toStringggg {
    public static void main(String[] args) {

        superClass se = new someThingElse();
        System.out.println(se);
        se.runnn();
    }
}

class someThingElse extends superClass {
    void runnn() {
        System.out.println(super.toString());
    }
}

class superClass {
    void runnn() {
        System.out.println("this is in parent");
    }

    public String toString() {
        return "this is from super's toString() method";
    }
}