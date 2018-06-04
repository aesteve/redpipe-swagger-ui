package com.decathlon.redpipe.swagger.test;

import io.vertx.core.json.JsonObject;
import rx.Single;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestController {


    private final static JsonObject TEST_DATA = new JsonObject()
            .put("some", "value");

    @GET
    public Single<JsonObject> testJsonSingle() {
        return Single.just(TEST_DATA);
    }

}
