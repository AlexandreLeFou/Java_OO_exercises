package locationweb.locationweb.Service;

import locationweb.locationweb.entities.Location;
import locationweb.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class  LocationServiceImpl implements LocationService {

    @Autowired
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
        return null;
    }@Override
    public void Location deleteLocation (Location location){
        //TODO Auto-generated
    }@Override
    public Location getLocationById (int id){
        //TODO Auto-generated
        return null;
    }Override
    public List<Location> getAllLocations (int id){
        //TODO Auto-generated
        return null;
    }
}
