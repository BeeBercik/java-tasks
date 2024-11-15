package oop.overloading_methods;

class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;

    Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
//        crazyMode = true;
    }

    float getTopSpeed() {
        return topSpeed;
    }

    float getTopSpeed(boolean crazyMode) {
        if(crazyMode)
            return this.crazyTopSpeed;
        else
            return this.topSpeed;
    }

    float getAcceleration() {
        return this.acceleration;
    }

    float getAcceleration(boolean crazyMode) {
        if(crazyMode) return this.crazyAcceleration;
        else return acceleration;
    }
}

public class Main {
    public static void main(String[] args) {
        Roadster normalCar = new Roadster(100.0f, 7.0f);
        System.out.println(
                normalCar.getAcceleration()
        );

        Roadster sportCar = new Roadster(180.0f, 5.5f,
                220.f, 3.0f);
        System.out.println(
                sportCar.getAcceleration(true)
        );
    }
}
