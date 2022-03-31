//package mypkg;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class JfsMicroserviceDiscoverApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(JfsMicroserviceDiscoverApplication.class, args);
//	}
//
//}
package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JfsMicroserviceDiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfsMicroserviceDiscoverApplication.class, args);
	}

}
