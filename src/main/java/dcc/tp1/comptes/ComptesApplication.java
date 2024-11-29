package dcc.tp1.comptes;

import dcc.tp1.comptes.ConfSecurity.RsaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(RsaConfig.class)
public class ComptesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComptesApplication.class, args);
    }

}
