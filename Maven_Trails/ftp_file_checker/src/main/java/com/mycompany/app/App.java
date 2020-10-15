package Java_Trails.ftp_file_checker.src.main.java.com.mycompany.app;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class App {

    public static void main(String[] args) {
        // requirements for connection
        String hostname = "192.168.1.100";
        int port = 21;
        String username = "usr";
        String password = "pwd";
        String filePath = "abc.mp3";

        try {
            // using commons.net library by apache
            FTPClient ftpClient = new FTPClient();

            // opening a connection
            ftpClient.connect(hostname, port);
            int returnCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(returnCode)) {
                throw new IOException("Could not connect");
            }
            boolean loggedIn = ftpClient.login(username, password);
            if (!loggedIn) {
                throw new IOException("Could not login");
            }
            System.out.println("Connected and logged in.");

            // trying to get the needed file
            InputStream inputStream = ftpClient.retrieveFileStream(filePath);
            returnCode = ftpClient.getReplyCode();
            if (inputStream == null || returnCode == 550) {
                System.out.println("file not found");
            }
            System.out.println("file found");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
