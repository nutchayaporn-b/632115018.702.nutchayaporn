package week7;

public class bike extends bicycle {

    public bike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("Bicycle");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);          
        }
        System.out.println("The current speed is :" +getCurrentSpeed());
    }
    public void speedup(){
        setCurrentSpeed(getCurrentSpeed()+ getConstanceSpeed());
        if (checkSpeed(getCurrentSpeed())) {
            setCurrentSpeed(getCurrentSpeed() - getConstanceSpeed());
        }
        System.out.println("Speed up");
        System.out.println("The current speed is :" +getCurrentSpeed());
    }

    public void Break() {
        setCurrentSpeed(getCurrentSpeed() - getConstanceSpeed());
        System.out.println("Break");
        System.out.println("The current speed is :" +getCurrentSpeed());
    } 
}
