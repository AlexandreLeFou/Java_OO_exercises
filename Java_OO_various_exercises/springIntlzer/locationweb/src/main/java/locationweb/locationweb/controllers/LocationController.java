package locationweb.locationweb.controllers;


import com.fasterxml.jackson.databind.annotation.JsonAppend;
import locationweb.locationweb.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import locationweb.locationweb.entities.Location;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc") //return the same jsp page but display the message at the end(success message)
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        //model attribut(retreive an object)->create bean
        Location locationSaved = service.saveLocation(location);
        String msg = "Location saved with id:" + locationSaved.getId();
        modelMap.addAttribute("msg", msg); //see .jsp file ${} variable ;)
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations); //send it back to the response
        return "displayLocations";
    }

    @RequestMapping("deleteLocation")
    //method to handle delete
    public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) { //retreive this parameter from the url i.e. url?${}
        //new Location();
        Location location = new Location();
        location.setId(id);
        //Location location = service.getLocationById(id);
        service.deleteLocation(location);
        List<Location> locations= service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";

    }

    @RequestMapping("/updateLocation")
    public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
        Location location =  service.getLocationById(id);
        modelMap.addAttribute("location", location);
        return "editLocation";

    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
        service.updateLocation(location);
        //Location location  = service.updateLocation(location); //if i wanted to retreive the location
        return "displayLocations";

    }



}
