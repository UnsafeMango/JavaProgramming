package com.company;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) { //we do not want to accept BodyType as a parameter
        super(name, orbitalPeriod, BodyTypes.PLANET); // we want to pass the enum constant for planets
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON) { //test for moon
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
