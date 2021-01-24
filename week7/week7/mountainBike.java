package week7;

public class mountainBike extends bicycle {
    public mountainBike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("MountainBike");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);
        }
        System.out.println("The current speed is :" +getCurrentSpeed());
    }
    public void gear(int gear){
        setCurrentSpeed(getCurrentSpeed()+(gear* getConstanceSpeed()));
        if (checkSpeed(getCurrentSpeed())) {
            setCurrentSpeed(getCurrentSpeed() - (gear * getConstanceSpeed()));
        }
        System.out.println("Gear up");
        System.out.println("The current speed is :" +getCurrentSpeed());
    }

    public void Break() {
        setCurrentSpeed(getCurrentSpeed() - getConstanceSpeed());
        System.out.println("Break");
        System.out.println("The current speed is :" +getCurrentSpeed());
    }
}

