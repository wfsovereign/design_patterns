package level1;

/**
 * Created by wfsovereign on 15-3-23.
 */
public class SimpleComposite {
    public static void main(String[] args) {
        Composite clothesRoot = new Composite("服装");
        Composite manNode = new Composite("男装");
        Composite womanNode = new Composite("女装");

        Component shirt = new Leaf("衬衫");
        Component jacket = new Leaf("夹克");
        Component skirt = new Leaf("裙子");

        clothesRoot.addChild(manNode);
        clothesRoot.addChild(womanNode);
        manNode.addChild(shirt);
        manNode.addChild(jacket);
        womanNode.addChild(skirt);

        clothesRoot.printStructure("");

    }
}
