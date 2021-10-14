package throwingexceptions;

import throwingexceptions.models.Cat;
import throwingexceptions.models.Collar;

public class CatShelter {
    private Cat[] kennels = new Cat[10];
    private Cat lastAdoptedCat;

    public void main() {
        Cat catTemplate = new Cat("Sparky", 1, "grey", 1.5f, new Collar("red", "(111)-111-1234"));
        Cat copyCat = duplicateCat(catTemplate);

        addCatToShelter(copyCat, 1);
        adoptCat(1);
        printCatInformation(2);
        System.out.println(lastAdoptedCat);
//
//        copyCat.setName("Copy Cat");
//        copyCat.getCollar().setColor("red");
//
//        System.out.println(catTemplate);
//        System.out.println(copyCat);
    }

    public static Cat duplicateCat(Cat other) {
        Cat copy = new Cat();
        copy.setName(other.getName());
        copy.setAge(other.getAge());
        copy.setColor(other.getColor());
        copy.setWeight(other.getWeight());
        copy.setCollar(other.getCollar());
        return copy;
    }

    public void printCatInformation(int kennelNumber) {
        Cat cat = kennels[kennelNumber];
        if (cat == null) throw new NullPointerException("No Cat Found in Kennel " + kennelNumber);

        System.out.println(cat);
    }

    public void addCatToShelter(Cat newCat, int kennelNumber) {
        kennels[kennelNumber] = newCat;
    }

    public void adoptCat(int kennelNumber) {
        if (kennelNumber >= kennels.length || kennelNumber < 0) {
            throw new IllegalArgumentException("Kennel Number should be a positive value less than " + kennels.length);
        }
        lastAdoptedCat = kennels[kennelNumber];
        kennels[kennelNumber] = null;
    }
}
