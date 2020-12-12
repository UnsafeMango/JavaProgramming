package com.company;

public class Labrador extends Dog { //Subclassing the Dog class(base class)

    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) { // test if the object is being compared to itself
//            return true;
//        }
//        if (obj instanceof Labrador) { //is it the Dog class?
//            String objName = ((Labrador)obj).getName(); // casting the object to the Dog
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
