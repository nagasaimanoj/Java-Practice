import java.io.*;
import java.util.*;

public class DosCommand {
    public static void main(String a[]) {
        try {
            // Execute command
            String command = "cmd /c md aruna";
            Process child = Runtime.getRuntime().exec(command);

            // Get output stream to write from it
            OutputStream out = child.getOutputStream();

            out.write("cd C:/ /r/n".getBytes());
            out.flush();
            out.write("dir /r/n".getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}