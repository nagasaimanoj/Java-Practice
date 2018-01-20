public class FilaStart {
    public static void main(String args[]) {
        int c;

        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("inTxt.txt");
            java.io.FileOutputStream fos = new java.io.FileOutputStream("outTxt.txt");
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
                fos.write(c);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}