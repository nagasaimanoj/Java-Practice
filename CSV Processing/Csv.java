import java.io.*;

public class Csv {
    static String name, age, phone;

    public static void main(String... a) {
        FileInputStream fis = null;
        int c;

        try {
            fis = new FileInputStream("users.csv");
            while ((c = fis.read()) != -1) {
                name = age = phone = "";

                while ((char) c != ',') {
                    name += (char) c;
                    c = fis.read();
                }

                c = fis.read();
                while ((char) c != ',') {
                    age += (char) c;
                    c = fis.read();
                }

                c = fis.read();
                while ((char) c != '\n') {
                    phone += (char) c;
                    c = fis.read();
                }

                System.out.println(name + " is " + age + " years old. His/her phone number is " + phone + "\n");
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