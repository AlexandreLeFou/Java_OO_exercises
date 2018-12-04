package locationweb.repos;

import locationweb.locationweb.entities.Location; //import from my pacakges
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
    //tell the Spring App the location type and Id
}
