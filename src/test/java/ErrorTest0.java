import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void error() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert(0);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        try {
            aVLTree0.delete(0);
        }catch (Exception ex){
            fail("Bug Detected");
        }
    }
}

