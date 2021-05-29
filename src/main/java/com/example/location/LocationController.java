package com.example.location;

import com.example.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    LocationServise locationServise;


    @RequestMapping (value = "/locations")
    public List<Location> getAllLocations(){
        return locationServise.getAllLocations();
    }

    @RequestMapping(value = "/locations/{Id}")
    public Location getLocation(@PathVariable String Id){
        return locationServise.getLocation(Id);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location){
        locationServise.addLocation(location);
    }

    @RequestMapping(value = "/locations/{Id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable ("Id") String id){
        locationServise.updateLocation(id, location);
    }


    @RequestMapping(value = "/locations/{Id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable ("Id") String id){
        locationServise.deleteLocation(id);
    }

}
