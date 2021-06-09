package PackageA.PackageB;

import org.codehaus.groovy.reflection.ParameterTypes;
import org.junit.Test;

public class PackageB {
    @Test
    public void test(){
        PackageB b = new PackageB();
        System.out.printf(b.getClass().getSimpleName());
    }
}
