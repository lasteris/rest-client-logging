package api;

import clients.Client1;
import clients.Client3;
import com.fasterxml.jackson.databind.JsonNode;
import io.vertx.core.json.JsonObject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

    @Inject @RestClient
    Client3 client3;

    @Inject @RestClient
    Client1 client1;

    @GET
    @Path("/get1")
    public JsonObject get1() {
        return client1.getEntries();
    }

    @GET
    @Path("/get2")
    public JsonObject get2() {
        return null;
    }

    @GET
    @Path("/get3")
    public JsonObject get3() {
        return client3.getFact();
    }
}
