public class cube extends rectangle{
    private int Long;

    public cube(int Long1,int Height,int Long){
        super(Long1, Height);
        this.Long = Long;
    }

    //overiding method
    public String toString(){
        return super.toString()+ "\nThis is a cube with the side of "+ Long;
    }
}
    
