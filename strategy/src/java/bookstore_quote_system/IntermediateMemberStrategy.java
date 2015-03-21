package bookstore_quote_system;

/**
 * Created by wfsovereign on 15-3-21.
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calculatePrice(double bookPrice) {
        System.out.println("对中级会员折扣为10%");
        return bookPrice * 0.9;
    }
}
