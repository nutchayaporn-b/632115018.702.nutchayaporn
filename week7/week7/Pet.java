package week7;

public class Pet {
    String type;
   String name;
   String species;
   String color;
   int age;
   String size;
   String hair;
   String bark;
   String water;
   String speed;
   String country;
   String fly;

   public Pet(String type, String name, String species, String color, int age, String size, String hair,
         String bark, String water, String speed, String country, String fly) {
      this.type = type;
      this.name = name;
      this.species = species;
      this.color = color;
      this.age = age;
      this.size = size;
      this.hair = hair;
      this.bark = bark;
      this.water = water;
      this.speed = speed;
      this.country = country;
      this.fly = fly;
   }

   public void introduce() {
      System.out.println("My " + type);
      System.out.println("Name: " + name + "Species: " + species + "Color: " + color + "Age: " + age);
   }
}

