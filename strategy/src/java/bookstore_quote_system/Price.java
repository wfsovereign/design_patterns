package bookstore_quote_system;

/**
 * Created by wfsovereign on 15-3-21.
 */
public class Price {
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }

    public double getPaymentQuota(double bookPrice){
        return this.strategy.calculatePrice(bookPrice);
    }
}
