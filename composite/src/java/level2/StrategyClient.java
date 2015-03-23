package level2;

/**
 * Created by wfsovereign on 15-3-23.
 */
public class StrategyClient {
    public static void main(String[] args) {
        StrategyComposite strategyOne = new StrategyComposite("组合1");
        StrategyWorkshop cole = new StrategyWorkshop("可乐5折");
        StrategyWorkshop orangeJuice = new StrategyWorkshop("橙汁8折");
        StrategyWorkshop instantNoodles = new StrategyWorkshop("方便面9折");

        strategyOne.addNode(cole);
        strategyOne.addNode(orangeJuice);
        strategyOne.addNode(instantNoodles);
        strategyOne.printStructure();
    }
}
