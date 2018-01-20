public class AccessMe {
    static AccessMe am = new AccessMe();
    int i = 987;

    private AccessMe() {
    }

    static AccessMe getObject() {
        return am;
    }

    void samplemethod() {
        System.out.println("VALUE IS : " + i);
    }
}