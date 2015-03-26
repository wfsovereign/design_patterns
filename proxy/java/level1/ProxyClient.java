package level1;

/**
 * Created by wfsovereign on 15-3-25.
 */
public class ProxyClient {
    public static void main(String[] args) {
        AbstractObject proxy = new ProxyObject();
        proxy.operation();
    }
}
