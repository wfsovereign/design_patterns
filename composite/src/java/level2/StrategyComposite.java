package level2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wfsovereign on 15-3-23.
 */

public class StrategyComposite {

    private List<StrategyWorkshop> strategyWorkshops = new ArrayList<StrategyWorkshop>();
    private String strategyName;

    public StrategyComposite(String strategyName){
        this.strategyName = strategyName;
    }

    public void addNode(StrategyWorkshop strategyExample){
        this.strategyWorkshops.add(strategyExample);
    }

    public void removeNode(StrategyWorkshop strategyExample){
        this.strategyWorkshops.remove(strategyExample);
    }

    public void printStructure(){
        String preStr = "  ";
        System.out.println(preStr + "+" + this.strategyName);
        for (StrategyWorkshop s : this.strategyWorkshops){
            System.out.println(s.getName());
        }
    }


}
