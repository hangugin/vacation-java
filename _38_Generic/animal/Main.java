package com.study._38_Generic.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 10);
        Cat cat = new Cat("야옹이", 8);

        AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>();
        AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>();

        dogHospital.setAnimal(dog);
        catHospital.setAnimal(cat);

        dogHospital.checkUp();
        catHospital.checkUp();

        // dogHospital.setAnimal(cat);
    }
}
