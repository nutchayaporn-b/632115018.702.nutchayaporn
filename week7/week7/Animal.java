package week7;

public class Animal extends Pet {

    public Animal(String type, String name, String species, String color, int age, String size, String hair,
            String bark, String water, String speed, String country, String fly) {
        super(type, name, species, color, age, size, hair, bark, water, speed, country, fly);
    }

    public void dog(String type, String name, String species, String color, int age, String hair, String size,
            String bark) {
        this.type = type;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.size = size;
        this.bark = bark;
        this.hair = hair;
    }

    public void run() {
        System.out.println("My " + type + " " + name + " is run to the jungle");
    }

    public void bark() {
        System.out.println(size + " bark " + bark);
    }

    public void ShortHair() {
        System.out.println(hair + " Hair: True");
    }

    public void Fish(String type, String name, String species, String color, int age, String speed, String size,
            String water) {
        this.type = type;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.speed = speed;
        this.size = size;
        this.water = water;

    }

    public void IsSwimToSea() {
        System.out.println("My " + size + " " + type + " " + name + " is swim to the " + water);
    }

    public void SwimFast() {
        System.out.println("Swim speed: " + speed);
    }

    public void bird(String type, String name, String species, String color, int age, String country, String size,
            String fly) {
        this.type = type;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.country = country;
        this.size = size;
        this.fly = fly;

    }

    public void Speak() {
        System.out.println("My " + size + " " + type + " " + name + " is said 'dee jaaaaa'");
    }

    public void CheckCountry() {
        System.out.println(name + " is stay in " + country);
    }

    public void IscanFly() {
        System.out.println(name + " can fly: " + fly);
    }
}
