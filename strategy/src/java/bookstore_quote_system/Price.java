package bookstore_quote_system;

/**
 * Created by wfsovereign on 15-3-21.
 */
public class Price {
    private double paymentQuota;
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public void getPaymentQuota(double bookPrice) {
        this.paymentQuota = this.strategy.calculatePrice(bookPrice);
    }

    public void printPaymentQuota() {

        System.out.println("您所需付款金额为：" + this.paymentQuota);
    }
}
