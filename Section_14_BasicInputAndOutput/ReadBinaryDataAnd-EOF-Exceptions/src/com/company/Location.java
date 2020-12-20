package com.company;
//Location in an adventure game based ont the game colossal cave adventure game

import java.util.LinkedHashMap;
import java.util.Map;

public final class Location {
    private final int locationId; // fields are marked final so that they cannot
    // be changed when the constructor has finished creating a location instance
    private final String description;

    private final Map<String, Integer> exits;

    public Location(int locationId, String description, Map<String, Integer> exits)  {
        this.locationId = locationId;
        this.description = description;
        if (exits != null) {
            this.exits = new LinkedHashMap<>(exits); //shallow copy
        } else {
            this.exits = new LinkedHashMap<>();
        }
        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//        // location contains the location id and the description as well
//        // as the map defined on line 11 which is used to store the available exits from a location
//    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<>(exits); //returning an immutable object as a getter
        // here; as the main exit map will not be altered as a copy has been made here
    }

    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }












}
