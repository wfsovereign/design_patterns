package bookstore_quote_system;

import java.util.Scanner;

/**
 * Created by wfsovereign on 15-3-21.
 */

public class BookStore {
    public static void main(String[] args) {
        double bookPrice;
        int memberLevel;
        Price price;

        Scanner input = new Scanner(System.in);


        System.out.println("welcome to my book store");
        System.out.println("下面是本店报价系统");
        System.out.println("请输入你购买书的金额：");
        bookPrice = input.nextDouble();
        System.out.println("请输入你的会员级别：");
        System.out.println("初级会员：1      中级会员：2      高级会员：3");
        memberLevel = input.nextInt();
        switch (memberLevel){
            case 1:
                System.out.println("您是普通会员");
                MemberStrategy primaryMember = new PrimaryMemberStrategy();
                price = new Price(primaryMember);
                price.getPaymentQuota(bookPrice);
                price.printPaymentQuota();
                break;
            case 2:
                System.out.println("您是可爱的中级会员");
                MemberStrategy intermediateMember = new IntermediateMemberStrategy();
                price = new Price(intermediateMember);
                price.getPaymentQuota(bookPrice);
                price.printPaymentQuota();
                break;
            case 3:
                System.out.println("您是尊贵的高级会员");
                MemberStrategy advancedMember = new AdvancedMemberStrategy();
                price = new Price(advancedMember);
                price.getPaymentQuota(bookPrice);
                price.printPaymentQuota();
                break;
            default:
                System.out.println("输入错误，本次服务到此结束，谢谢");

        }

    }

}
