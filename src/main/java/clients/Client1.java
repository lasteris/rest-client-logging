package clients;

import io.quarkus.rest.client.reactive.ClientQueryParam;
import io.vertx.core.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "client1")
public interface Client1 {

    @GET
    @Path("/")
    @ClientQueryParam(name = "format", value = "json")
    JsonObject getEntries();
}
