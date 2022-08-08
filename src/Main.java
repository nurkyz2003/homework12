public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Margo");
        String name = cat.getName();
        cat.setAge(7);
        int age = cat.getAge();
        cat.setColor("White");
        String color = cat.getColor();
        cat.setEyecolor("Blue");
        String eyecolor = cat.getEyecolor();
        cat.setWeight(4.50);
        double weight = cat.getWeight();

        System.out.println("This is a Class - CAT:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        System.out.println(eyecolor);
        System.out.println(weight);
        System.out.println("-----------------------------------------------------------------------------------");

        Dog dog = new Dog();
        dog.setName1("Doberman");
        String name1 = dog.getName1();
        dog.setAge1(10);
        int age1 = dog.getAge1();
        dog.setColor1("White");
        String color1 = dog.getColor1();
        dog.setEyecolor1("Black");
        String eyecolor1 = dog.getEyecolor1();
        dog.setWeight1(10.80);
        double weight1 = dog.getWeight1();

        System.out.println("This is a Class - DOG:");
        System.out.println(name1);
        System.out.println(age1);
        System.out.println(color1);
        System.out.println(eyecolor1);
        System.out.println(weight1);
        System.out.println("-----------------------------------------------------------------------------------");

        Parrot parrot = new Parrot();
        parrot.setName2("Djo");
        String name2 = parrot.getName2();
        parrot.setAge2(3);
        int age2 = parrot.getAge2();
        parrot.setColor2("Yellow");
        String color2 = parrot.getColor2();
        parrot.setEyecolor2("Black");
        String eyecolor2 = parrot.getEyecolor2();
        parrot.setWeight2(7);
        double weight2 = parrot.getWeight2();

        System.out.println("This is a Class - PARROT:");
        System.out.println(name2);
        System.out.println(age2);
        System.out.println(color2);
        System.out.println(eyecolor2);
        System.out.println(weight2);
        System.out.println("-----------------------------------------------------------------------------------");

        Fish fish = new Fish();
        fish.setName3("Claus");
        String name3 = fish.getName3();
        fish.setAge3(4);
        int age3 = fish.getAge3();
        fish.setColor3("Pink");
        String color3 = fish.getColor3();
        fish.setEyecolor3("Black");
        String eyecolor3 = fish.getEyecolor3();
        fish.setWeight3(5.50);
        double weight3 = fish.getWeight3();

        System.out.println("This is a Class - FISH:");
        System.out.println(name3);
        System.out.println(age3);
        System.out.println(color3);
        System.out.println(eyecolor3);
        System.out.println(weight3);
    }
}