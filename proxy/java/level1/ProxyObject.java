package level1;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class ProxyObject extends AbstractObject {
    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        System.out.println("before");
        realObject.operation();
        System.out.println("after");
    }
}
