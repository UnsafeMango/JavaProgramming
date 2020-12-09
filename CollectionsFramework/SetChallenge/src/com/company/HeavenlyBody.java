package com.company;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody { //removed 'final' so it can be  subclassed
    private final Key key;
    //    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
//    private final BodyTypes bodyType;

//    public static final int STAR = 1;
//    public static final int PLANET = 2;
//    public static final int DWARF_PLANET = 3;
//    public static final int MOON = 4;
//    public static final int COMET = 5;
//    public static final int ASTEROID = 6;
    //ANOTHER WAY OF DECLARING MULTIPLE CONSTANT VALUES
    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        //        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
//        this.bodyType = bodyType;
    }

    public Key getKey() {
        return key;
    }

    //    public String getName() {
//        return name;
//    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites); // shallow copy
    }


    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) { //casting it if it returns true
            HeavenlyBody theObject = (HeavenlyBody)obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

//    Makes printing the BodyType method easier
    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
            //a string has a hashcode and a constant also has a hashcode
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj; // cast it to an object
            if (this.name.equals(key.getName())) {
                return (this.bodyType == key.getBodyType());
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}




















