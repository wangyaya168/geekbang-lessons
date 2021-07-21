package org.geektimes.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author wangya
 * @date 2021-07-21 17:16
 */
@Path("/actuator/")
public interface ShutdownService {

    @POST
    @Path("/shutdown")
    String shutdown();
}
