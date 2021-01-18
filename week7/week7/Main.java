package week7;
//Nutchayaporn Buarom 632115018

public class Main {
    public static void main(String[] args) {
        Animal dogAnimal = new Animal("dog","Lucky ","Pooddle ","brown ",2,"Small ","Short ","Box Box!! ","","","","");
        dogAnimal.introduce();
        dogAnimal.run();
        dogAnimal.bark();
        dogAnimal.ShortHair();
        Animal fish = new Animal("fish","kiki ","Clownfish ","Orange and white ",1,"Small ","","","Salt water ","slow ","","");
        fish.introduce();
        fish.IsSwimToSea();
        fish.SwimFast();
        Animal bird = new Animal("bird","lala ","Parrot ","Green ",3,"Medium ","","","","","New Zealand","can ");
        bird.introduce();
        bird.Speak();
        bird.CheckCountry();
        bird.IscanFly();
    }
}

