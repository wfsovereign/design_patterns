package level1;

import java.util.List;

/**
 * Created by wfsovereign on 15-3-23.
 */
public abstract class Component {
    public abstract void printStructure(String preStr);

    public void addChild(Component child){
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public void removeChild(int index){
        throw new UnsupportedOperationException("对象不支持次功能");
    }

    public List<Component> getChild(){
        throw new UnsupportedOperationException("对象不支持此功能");
    }

}
