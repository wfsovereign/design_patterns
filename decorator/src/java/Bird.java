/**
 * Created by wfsovereign on 15-3-20.
 */
public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move(){
        System.out.println("bird move");
        fly();
    }

    public void fly(){
        System.out.println("I can fly");
    }

}
