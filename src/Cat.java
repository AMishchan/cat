
public class Cat {
    private Double originWeight;
    private Double weight;
    private Double toilet;
    private Double minWeight;
    private Double maxWeight;
    private Double weightDiff;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        toilet = 100.0;
        weightDiff = 0.0;
    }

    public void meow() {
        weight--;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double foodBack() {
        weightDiff = weight - originWeight ;
        return weightDiff;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public void goWc() {
        weight -= toilet;
        System.out.println("Awesome!");
    }
}