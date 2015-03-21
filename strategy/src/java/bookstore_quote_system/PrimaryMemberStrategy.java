package bookstore_quote_system;

/**
 * Created by wfsovereign on 15-3-21.
 */
public class PrimaryMemberStrategy implements MemberStrategy{


    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("对初级会员没有折扣");
        return booksPrice;
    }
}
