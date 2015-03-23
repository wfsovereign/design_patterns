package level1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wfsovereign on 15-3-23.
 */
public class Composite extends Component {
    @Override
    public void printStructure(String preStr) {
        System.out.println(preStr + "+" + this.compositeName);
        if(this.childComponents != null){
            preStr += "  ";
            for(Component c : childComponents){
                c.printStructure(preStr);
            }
        }
    }

    private List<Component> childComponents = new ArrayList<Component>();
    private  String compositeName;

    public Composite(String compositeName){
        this.compositeName = compositeName;
    }

    public void addChild(Component child){
        childComponents.add(child);
    }

    public void removeChild(int index){
        childComponents.remove(index);
    }

    public List<Component> getChildComponents(){
        return childComponents;
    }


}
