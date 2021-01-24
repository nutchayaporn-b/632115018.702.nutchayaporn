package week7;
//Nutchayaporn Buarom 632115018
public class MainBike{
    public static void main(String[] args) {
        bike b = new bike(10);
        b.speedup();
        b.Break();
        b.displaySpeed();       
        mountainBike mb = new mountainBike(10);
        mb.gear(2);
        mb.displaySpeed();
        mb.Break();
        mb.gear(17);
        mb.displaySpeed();
    }
}
