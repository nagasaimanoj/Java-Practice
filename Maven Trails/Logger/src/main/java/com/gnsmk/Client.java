package com.gnsmk;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Client {

    static Logger log = Logger.getLogger("");

    public static void main(String[] args) {
        try {
            log.addAppender(new FileAppender(new SimpleLayout(), "my.txt", false));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            log.fatal("This is the error message..");
            System.out.println("Your logic executed successfully....");
        }
    }
}