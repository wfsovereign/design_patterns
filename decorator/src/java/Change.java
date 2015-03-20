/**
 * Created by wfsovereign on 15-3-20.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        sage.move();
    }
}
