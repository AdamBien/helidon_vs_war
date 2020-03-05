package airhacks;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.annotation.Timed;

@RequestScoped
@Path("/hello")
public class HelloResource {

    @Inject
    HelloService service;

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Message hello() {
        return this.service.message();
    }
}