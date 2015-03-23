package level1;

/**
 * Created by wfsovereign on 15-3-23.
 */
public class Leaf extends Component {

    private String leafName;

    public Leaf(String name){
        this.leafName = name;
    }



    @Override
    public void printStructure(String preStr) {
        System.out.println(preStr + "-" + leafName);
    }
}
