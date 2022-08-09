public class Main {
    public static void main(String[] args) {
        new Parrot();
        Parrot parrot = new Parrot(4,"Blue",true,5.80);
        System.out.println("This is the Class - PARROT:");
        System.out.println("Age: " + parrot.getAge2());
        System.out.println("Color: " +  parrot.getColor2());
        System.out.println("Pets: " + parrot.getPets2());
        System.out.println("Weight: " + parrot.getWeight2());
        System.out.println("------------------------------------");


        Parrot parrot2 = new Parrot(2,"Green",true,5.20);
        System.out.println("This is the Class - PARROT2:");
        System.out.println("Age: " + parrot2.getAge2());
        System.out.println("Color: " +  parrot2.getColor2());
        System.out.println("Pets: " + parrot2.getPets2());
        System.out.println("Weight: " + parrot2.getWeight2());
        System.out.println("------------------------------------");

        new Cat();
        Cat cat = new Cat(6,"White",true,4.30);
        System.out.println("This is the Class - CAT:");
        System.out.println("Age: " + cat.getAge2());
        System.out.println("Color: " + cat.getColor2());
        System.out.println("Pets: " + cat.getPets2());
        System.out.println("Weight: " + cat.getWeight2());
        System.out.println("------------------------------------");

        new Fish();
        Fish fish = new Fish(3,"Pink",false,3.70);
        System.out.println("This is the Class - FISH:");
        System.out.println("Age: " + fish.getAge2());
        System.out.println("Color: " + fish.getColor2());
        System.out.println("Pets: " + fish.getPets2());
        System.out.println("Weight: " + fish.getWeight2());
        System.out.println("------------------------------------");

        new Dog();
        Dog dog = new Dog(10,"Grey",true,11.90);
        System.out.println("This is the Class - DOG:");
        System.out.println("Age: " + dog.getAge2());
        System.out.println("Color: " + dog.getColor2());
        System.out.println("Pets: " + dog.getPets2());
        System.out.println("Weight: " + dog.getWeight2());
    }
}