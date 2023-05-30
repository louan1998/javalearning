package day1;

public class Dog implements Comparable<Dog> {
    int weight;
    int height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int comparaTo(Dog dog) {
        if (this.weight<dog.weight)
            return -1;
        else if (this.weight>dog.weight) {
            return 1;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
