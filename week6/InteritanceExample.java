public class InteritanceExample {
    //Nutchayaporn Buarom 632115018
    public static void main(String[] args) {
        Artist art = new Artist("Ball",20,"Male");
        art.genre="hip hop";
        art.introduce();
        art.playMusic();
        Artist en = new Artist("Nut", 19, "Female");
        en.genre="computer";
        en.introduce();
        en.technology();
        Artist doc = new Artist("Mai", 30, "Female");
        doc.genre="emergency";
        doc.introduce();
        doc.takecare();
        Artist ac = new Artist("Nadia", 25, "Male");
        ac.genre="finance";
        ac.introduce();
        ac.money();
        Artist che = new Artist("Jaosoua", 28, "Female");
        che.genre="food";
        che.introduce();
        che.food();
        Artist teach = new Artist("Aom", 40, "Male");
        teach.genre="teaching";
        teach.introduce();
        teach.teach();
        Artist sin = new Artist("May", 45, "Male");
        sin.genre="sing a song";
        sin.introduce();
        sin.song();
    }
}