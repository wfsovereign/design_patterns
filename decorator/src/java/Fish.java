/**
 * Created by wfsovereign on 15-3-20.
 */
public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move(){
        System.out.println("fish move");
        swim();
    }

    public void swim(){
        System.out.println("I can swim");
    }
}
