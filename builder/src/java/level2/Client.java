package level2;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class Client {
    public static void main(String[]args){
        EmploymentContract.ConcreteBuilder builder =
                new EmploymentContract.ConcreteBuilder("9887", 2015, 2018);
        EmploymentContract contract =
                builder.setPersonName("FY").setOtherData("Employee").build();
        contract.someOperation();
        builder = new EmploymentContract.ConcreteBuilder("9888",2015,2018);
        contract = builder.setCompanyName("TW").setOtherData("Employer").build();
        contract.someOperation();
    }
}
