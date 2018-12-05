package locationweb.locationweb.repos;

import locationweb.locationweb.entities.Location; //import from my pacakges
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    //tell the Spring App the location type and Id
    //jpa repository than crud repo==> provides methods to return a list instead of iterable

}
