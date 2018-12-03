package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
    private final static Logger log = LoggerFactory.getLogger(Hello.class);

    /**
     * 注意：
     *      在代码中，不能成段出现完全相同的代码，会警告提示。
     */
    public static void sayHello() {
        log.trace("trace");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
    }
}
