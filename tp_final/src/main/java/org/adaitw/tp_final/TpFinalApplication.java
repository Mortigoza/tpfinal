package org.adaitw.tp_final;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpFinalApplication {

    private static final Logger logger =
    LoggerFactory.getLogger(TpFinalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TpFinalApplication.class, args);

        logger.info("INFO - Level Log Message");
        logger.warn("WARN - Level Log Message");
        logger.error("ERROR - Level Log Message");
    }

}
