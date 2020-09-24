
public class Loader
{
    public static void main(String[] args)
    {
        /* ### Lesson 1 test ### */
        Cat defaultCat = new Cat();
        Cat barsik = new Cat();
        Cat kuzya = new Cat();
        Cat murka = new Cat();
        Cat ryzhik = new Cat();
        Cat bantik = new Cat();

        System.out.println("CAT".equals(rrr.CAT));


        System.out.println(defaultCat.getStatus());
        System.out.println("Barsik weight " + barsik.getWeight());
        System.out.println("Kuzya weight " + kuzya.getWeight());
        System.out.println("Murka weight " + murka.getWeight());
        System.out.println("Ryzhik weight " + ryzhik.getWeight());
        System.out.println("Bantik weight " + bantik.getWeight());
        overFeedCat(barsik);
        meowCat(kuzya);

        /* ### Lesson 2 test ### */

        murka.feed(150.0);
        murka.pee(10);
        murka.pee(30);
        System.out.println("Food amount is " + murka.getFoodAmount());

        /* ### Lesson 5 test ### */
        Cat kitten = getKitten();

        /* ### Lesson 7 test ### */
        try {
            bantik.setColor(CatColor.BLACK);
            Cat bantikClone = (Cat)bantik.clone();
            System.out.println(bantikClone.getWeight());
            System.out.println(bantikClone.getColor());
        } catch (CloneNotSupportedException e) {
            System.out.println("Exception occured during cat cloning!");
            System.out.println("CAT".equals(rrr.CAT));
        }
    }

    private static Cat getKitten() {
        return new Cat(1100);
    }

    private static void meowCat(Cat cat) {
        while (!cat.isDead()) {
            cat.meow();
        }
        System.out.println("Cat is dead ");
    }

    private static void overFeedCat(Cat cat) {
         while (!cat.isExploded()) {
             cat.feed(100.0);
         }
        System.out.println("Cat is exploded ");
    }

    enum rrr {
        CAT;
    }
}