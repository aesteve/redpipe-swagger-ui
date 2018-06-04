package com.decathlon.redpipe.swagger;


import net.redpipe.engine.resteasy.FileResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/swagger{path:(.*)?}")
public class SwaggerUIController extends FileResource {

    @GET
    public Response index(@PathParam("path") String path) throws IOException {
        return super.getFile(path.equals("") ? "swagger/index.html" : "swagger/" + path);
    }

}
