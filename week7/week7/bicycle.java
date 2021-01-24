package week7;

public class bicycle {
    private int currentSpeed;
    final private static int SPEEDUPDOWN = 5;
    public bicycle(){
        
    }
    public void setCurrentSpeed(int setCurrentSpeed){
        this.currentSpeed = setCurrentSpeed;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public int getConstanceSpeed(){
        return SPEEDUPDOWN;
    }
    public void displaySpeed(){
    }
    public boolean checkSpeed(int getspeed){
        if(getspeed > 99){
            System.out.println("The current speed of a bicycle cannot exceed the 99 km/hr");
            return true;
        }
        else {
            return false;
        }
    }
}
