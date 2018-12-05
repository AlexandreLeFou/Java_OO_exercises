package locationweb.locationweb.controllers;


import com.fasterxml.jackson.databind.annotation.JsonAppend;
import locationweb.locationweb.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import locationweb.locationweb.entities.Location;


@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc") //return the same jsp page but display the message at the end(sucess message)
    public String saveLocation(@ModelAttribute("location") Location location) {
        //model attribut(retreive an object)->create bean
        service.saveLocation(location);
        return "createLocation";
    }

}
