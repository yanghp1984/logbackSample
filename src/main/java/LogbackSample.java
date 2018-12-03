import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackSample {
    private final static Logger log = LoggerFactory.getLogger(LogbackSample.class);

    public static void main(String[] args) {
        sample.Hello.sayHello();
        sample.HelloLogback.sayHello();

        log.trace("-- trace --");
        log.debug("-- debug --");
        log.info("-- info --");
        log.warn("-- warn --");
        log.error("-- {} --", "error");
    }
}
