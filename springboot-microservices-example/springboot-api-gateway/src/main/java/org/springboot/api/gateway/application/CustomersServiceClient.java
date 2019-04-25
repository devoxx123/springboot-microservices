
package org.springboot.api.gateway.application;

import lombok.RequiredArgsConstructor;

import org.springboot.api.gateway.dto.OwnerDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class CustomersServiceClient {

    private RestTemplate loadBalancedRestTemplate;

    public OwnerDetails getOwner(final int ownerId) {
        return loadBalancedRestTemplate.getForObject("http://customer-service/owners/{ownerId}", OwnerDetails.class, ownerId);
    }
}
