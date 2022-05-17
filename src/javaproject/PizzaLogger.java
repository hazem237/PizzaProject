package javaproject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class PizzaLogger {

    private static final LocalDateTime now = LocalDateTime.now();
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

    
    public void log(String msg) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("log.txt", true);
            fileWriter.write("( " + dtf.format(now) + " ) " + msg + "\n\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
