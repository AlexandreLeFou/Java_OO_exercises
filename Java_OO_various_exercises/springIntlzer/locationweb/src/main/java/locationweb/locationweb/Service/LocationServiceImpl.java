package locationweb.locationweb.Service;

import locationweb.locationweb.entities.Location;
import locationweb.locationweb.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //service layer bean
public class LocationServiceImpl implements LocationService {

    @Autowired //add dependency
    private LocationRepository repository;


    public LocationRepository getRepository() {
        return repository;
    }

    public void setRepository(LocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Location saveLocation (Location location){
        return repository.save(location);
    }
    @Override
    public Location updateLocation (Location location){
        return repository.save(location);
    }@Override
    public void deleteLocation (Location location){
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return repository.findById(id).orElse(null);
    }

    //@Override
   // public Location getLocationById (int id){
   //     return repository.findById(id);}
     @Override
    public List<Location> getAllLocations (){
        return repository.findAll();
    }
}
