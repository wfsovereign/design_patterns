/**
 * Created by wfsovereign on 15-3-20.
 */
public class GreatestSageClient {
    public static void main(String[] args) {
        TheGreatestSage sage = new Mokey();

        TheGreatestSage bird = new Bird(sage);
        Fish fish = new Fish(bird);

        fish.move();

    }
}
