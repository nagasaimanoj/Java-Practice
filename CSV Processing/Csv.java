public class Csv {
    static String name, age, phone;

    public static void main(String... a) {
        int c;

        try {
            java.io.FileInputStream fis = new java.io.FileInputStream("users.csv");
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
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}