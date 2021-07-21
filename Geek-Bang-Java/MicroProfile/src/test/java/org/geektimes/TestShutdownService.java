package org.geektimes;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.geektimes.service.ShutdownService;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author wangya
 * @date 2021-07-21 17:19
 */
public class TestShutdownService {
    @Test
    public void testGetProductItemsByGroup() throws URISyntaxException {
        URI uri = new URI("http://127.0.0.1:8080");
        ShutdownService shutdownService = RestClientBuilder.newBuilder()
                .baseUri(uri)
                .build(ShutdownService.class);

        shutdownService.shutdown();

    }
}
