package com.decathlon.redpipe.swagger;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import net.redpipe.engine.core.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {

    private final static Logger LOG = LoggerFactory.getLogger(TestMain.class);
    private final static JsonObject TEST_CONF = new JsonObject()
            .put("http_port", 9090)
            .put("scan", new JsonArray().add("com.decathlon.redpipe.swagger"));


    public static void main(String... args) {
        new Server()
                .start(TEST_CONF)
                .subscribe(
                        voidz -> LOG.info("Server started"),
                        error -> LOG.error("Could not start server", error)
                );

    }

}
