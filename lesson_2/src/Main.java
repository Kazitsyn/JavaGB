
import java.util.Scanner;
import java.io.File;
import java.util.logging.*;

public class Main {
    public static boolean validate(final String ip) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return ip.matches(PATTERN);
    }
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler ();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование" );
        logger.info("Тестовое логирование" );




    }
}