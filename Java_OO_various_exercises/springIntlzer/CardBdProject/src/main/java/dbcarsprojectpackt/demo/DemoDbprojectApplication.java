package dbcarsprojectpackt.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoDbprojectApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoDbprojectApplication.class, args);
    }


    @Bean
    CommandLineRunner runner() {
        return args -> {
            // Place your code here
        };
    }
}


// //  com.packt.cardatabase.domain