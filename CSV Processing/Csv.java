import java.io.*;

public class Csv {
    static String name = "", age = "", phone = "";

    public static void main(String... a) {
        FileInputStream fis = null;
        int c;

        try {
            fis = new FileInputStream("users.csv");
            while ((c = fis.read()) != -1) {
                while ((char) c != ',') {
                    if ((char) c != ' ')
                        name += (char) c;
                    c = fis.read();
                }
                c = fis.read();
                while ((char) c != ',') {
                    if ((char) c != ' ')
                        age += (char) c;
                    c = fis.read();
                }
                c = fis.read();
                while (!String.valueOf((char) c).matches("\n")) {
                    if ((char) c != ' ')
                        phone += (char) c;
                    c = fis.read();
                }
                System.out.println(name + " is " + age + " year old. his/her phone number is - " + phone);
                name = "";
                age = "";
                phone = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}