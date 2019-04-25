
package org.springboot.vets;

import org.springboot.vets.system.VetsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties(VetsProperties.class)
public class VetsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetsServiceApplication.class, args);
	}
}
