
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        System.out.println(cat.getWeight());
    //    cat.feed(120.0);
        for (int i = 0; i < 50; i++) {
            cat.meow();
        }
        System.out.println(cat.getWeight());
        System.out.println(cat.foodBack());
        System.out.println(cat.getWeight());
        cat.goWc();
        System.out.println(cat.getWeight());
    }
    //- Создать в классе Cat метод, который будет возвращать массу съеденной еды.
    //- Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-­
    //  нибудь печатать.
}