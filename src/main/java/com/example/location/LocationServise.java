package com.example.location;

import com.example.post.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocationServise {
    Location l1 = new Location("l12", "nameL1");
    Location l2 = new Location("l22", "nameL2");

    List<Location> locations = new ArrayList<>(Arrays.asList(l1,l2));

    public List<Location> getAllLocations(){
        return locations;
    }

    public Location getLocation (String id){
        return locations.stream().
                filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
    }

    public void addLocation(Location location){
        locations.add(location);
    }

    public void updateLocation(String id, Location location) {
         for(int i = 0; i <locations.size(); i++){
             if(locations.get(i).getId().equals(id)){
                 locations.set(i, location);
             }
         }
    }

    public void deleteLocation(String id){
        locations.removeIf(l -> l.getId().equals(id));
    }
}
