package level2;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class Client {
    public static void main(String[]args){
        InsuranceContract.ConcreteBuilder builder =
                new InsuranceContract.ConcreteBuilder("9587", 2015, 2018);
        InsuranceContract contract =
                builder.setPersonName("FY").setOtherData("test").build();
        contract.someOperation();
        builder = new InsuranceContract.ConcreteBuilder("9888",2015,2018);
        contract = builder.setCompanyName("TW").setOtherData("test").build();
        contract.someOperation();
    }
}
