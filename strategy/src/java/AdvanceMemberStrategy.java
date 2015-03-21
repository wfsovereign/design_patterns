/**
 * Created by wfsovereign on 15-3-21.
 */
public class AdvanceMemberStrategy implements MemberStrategy {
    @Override
    public double calculatePrice(double bookPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return bookPrice * 0.8;
    }
}
