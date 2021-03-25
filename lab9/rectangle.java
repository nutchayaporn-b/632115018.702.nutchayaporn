public class rectangle extends shape {
    private int Long1;
    private int Height;

    public rectangle(int Long1,int Height){
        this.Long1 = Long1;
        this.Height = Height;

    }

    //overiding method
    public String toString(){
        return super.toString() + "\nThis is a rectangle with width as "+ Long1 + " and height as "+ Height;

    }
    
}
    
