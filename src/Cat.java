
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

    private Boolean weightControl()                      //метод возвращает true или false в зависимости от текущего
                                                         //состояния кота
    {
        if (this.getStatus().equals("Playing")) {        //если кот не взорвался или не умер можно производить над ним вычисления
            return true;
        } else if (this.getStatus().equals("Sleeping")) {
            return true;
        } else {
            return false;
        }
    }

    public String foodBack() {
        if (this.weightControl()) {                      //если метод контроля веса возвратил true вычисляем количество съеденной еды
            weightDiff = weight - originWeight;
          if (weightDiff > 0 ) {                         //проверяем - ел ли кот вообще что-нибудь
              return weightDiff.toString();
          } else {
              return "A cat does not eat";
          }
        } else {
            return "Problems with cat.";
        }
    }

    public void goWc() {
        if (this.weightControl()) {
            weight -= toilet;
            System.out.println("Awesome!");
        } else {
            System.out.println("Problems with cat.");
        }

    }
}