package foo;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    public static void main(String... args) throws SecurityException, IOException {
        LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("/logging.properties"));
        Logger log = Logger.getLogger(Main.class.getName());
        log.info("Hello!");
    }
}
