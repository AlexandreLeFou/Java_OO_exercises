
package dbcarsprojectpackt.demo;
//import org.springframework.beans.factory.annotation.Autowired;


import com.packt.cardatabase.domain.*;

//import com.packt.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//import com.packt.cardatabase.domain.Car;
//import com.packt.cardatabase.domain.CarRepository;


@SpringBootApplication(scanBasePackages={"com.packt.cardatabase.domain"})
public class DemoDbprojectApplication {
   @Autowired
    private CarRepository repository;

    @Autowired
    private OwnerRepository orepository;

    //@Autowired
     //@Repository
 //private CarRepository repository;


    public static void main(String[] args) {

        SpringApplication.run(DemoDbprojectApplication.class, args);
    }


    @Bean
    CommandLineRunner runner() {
        return args -> {
            // save some demo data
            Owner owner1 = new Owner("John" , "Johnson");
            Owner owner2 = new Owner("Mary" , "Robinson");
            orepository.save(owner1);
            orepository.save(owner2);

            Car car = new Car("Ford", "Mustang", "Red",
                    "ADF-1121", 2017, 59000, owner1);

            repository.save(car);
            car = new Car("Nissan", "Leaf", "White",
                    "SSJ-3002", 2014, 29000, owner2);

            repository.save(car);
            car = new Car("Toyota", "Prius", "Silver",
                    "KKO-0212", 2018, 39000, owner2);
            repository.save(car);

        };
    }
}


// //  com.packt.cardatabase.domain