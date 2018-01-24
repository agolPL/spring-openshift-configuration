package pl.osec.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationExampleApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ConfigurationExampleApplication.class);
        application.run(args);
    }
}
