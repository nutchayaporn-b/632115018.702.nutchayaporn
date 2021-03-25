public class testoverride {
    public static void main(String[] args) {
        person person1;
        person person2;
        person person3;
        person person4;
        person person5;
        person person6;
        person1 = new person("Mark",2001);
        person2 = new sherif("Mateo", 1988,"Cailfornia");
        person3 = new Teacher("Ball", 1977,"CMU");
        person4 = new Prime("Tu", 1954,"Thailand");
        person5 = new Football("Messi", 1987,"Barcelona football club");
        person6 = new gamer("Nut", 2001,"Thailand");

        person1.introduce();
        person2.introduce();
        person3.introduce();;
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
    
}
