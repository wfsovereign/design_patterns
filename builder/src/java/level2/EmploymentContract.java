package level2;

/**
 * Created by wfsovereign on 15-3-19.
 */
public class EmploymentContract {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    private EmploymentContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }

    static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        public EmploymentContract build() {
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }
            boolean signPerson = (personName == null);
            boolean signCompany = (companyName == null);
            if (signPerson && signCompany) {
                throw new IllegalArgumentException("一份雇佣合同必须是个人和公司签订");
            }
            if (beginDate <= 0) {
                throw new IllegalArgumentException("一份雇佣合同必须有开始生效的日期");
            }
            if (endDate <= 0) {
                throw new IllegalArgumentException("一份雇佣合同必须有失效的日期");
            }
            if (endDate < beginDate) {
                throw new IllegalArgumentException("一份雇佣合同的失效日期必须大于生效日期");
            }
            return new EmploymentContract(this);
        }
    }

    public void someOperation() {
        System.out.println("当前正在操作的保险合同编号为【" + this.contractId + "】");


        System.out.println("person name :" + this.personName);
        System.out.println("company name :" + this.companyName);
        System.out.println("begin data :" + this.beginDate);
        System.out.println("end data :" + this.endDate);
        System.out.println("other data :" + this.otherData);
    }


}
