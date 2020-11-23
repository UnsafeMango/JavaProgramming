package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return ("Car -> StartEngine()");
    }

    public String accelerate() {
        return "Car => accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return " Mitsubishi => Accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> Brake()";
    }
    static class Holden extends Car {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi -> StartEngine()";
        }

        @Override
        public String accelerate() {
            return " Mitsubishi => Accelerate()";
        }

        @Override
        public String brake() {
            return "Mitsubishi -> Brake()";
        }
    }

    static class Ford extends Car {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> StartEngine()";
        }

        @Override
        public String accelerate() {
            return " Ford => Accelerate()";
        }

        @Override
        public String brake() {
            return "Ford -> Brake()";
        }
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " => Accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> Brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> StartEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford => Accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> Brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car= new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
