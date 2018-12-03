package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogback {
    private final static Logger log = LoggerFactory.getLogger(HelloLogback.class);

    public static void sayHello() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
