import junit.framework.TestCase;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by asus on 15/10/2017.
 */
public class VectorHelperTest extends TestCase {
    public void testTriVect() throws Exception {
        VectorHelper v=new VectorHelper();
        ArrayList<Integer> t=new ArrayList<Integer>();
        t.add(-9);
        t.add(0);
        t.add(78);
        t.add(2);
        t.add(123);
        t.add(-52);
        v.triRapide(t);
        for (int c:
                t) {
            System.out.println(c);
        }
    }

    public void testMaxMinVect() throws Exception {
        VectorHelper v=new VectorHelper();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(-9);
        t.add(0);
        t.add(78);
        t.add(2);
        t.add(123);
        t.add(-52);
        for (Object i:
             v.MaxMinVect(t)) {
            System.out.println(i);
        }
    }

}