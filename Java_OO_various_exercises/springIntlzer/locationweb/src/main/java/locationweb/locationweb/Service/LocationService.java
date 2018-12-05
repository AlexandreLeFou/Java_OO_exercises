package locationweb.locationweb.Service;

import locationweb.locationweb.entities.Location;

import java.util.List;

public interface LocationService {
    //save, update, delete
    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    //get location by id
    Location getLocationById(int id);

    List<Location> getAllLocations();

}
