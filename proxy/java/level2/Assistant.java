package level2;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class Assistant implements Leader {
    private Leader leader;

    public Assistant(Leader leader){
        this.leader = leader;
    }
    @Override
    public void sign() {
        System.out.println("send to leader");
        leader.sign();
        System.out.println("receive from leader");
    }
}
