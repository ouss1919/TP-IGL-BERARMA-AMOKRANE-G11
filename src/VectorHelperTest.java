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

    public void testInvVect() throws Exception {
        VectorHelper v=new VectorHelper();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(-9);
        t.add(0);
        t.add(78);
        t.add(2);
        t.add(123);
        t.add(-52);
        for (Object i:
                v.InvVect(t)) {
            System.out.println(i);
        }
    }

    public void testFoncVect() throws Exception {
        VectorHelper v=new VectorHelper();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(-9);
        t.add(0);
        t.add(78);
        t.add(2);
        t.add(123);
        t.add(-52);
        for (Object i:
                v.FoncVect(t, '7', 2)) {
            System.out.println(i);
        }
    }

    public void testSommeDeuxVect() throws Exception {
        VectorHelper v=new VectorHelper();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(-9);
        t.add(0);
        t.add(78);
        t.add(2);
        t.add(123);
        t.add(-52);

        ArrayList<Integer> E=new ArrayList<>();

        E.add(-9);
        E.add(0);
        E.add(78);
        E.add(2);
        E.add(123);
        E.add(-52);
        for (Object i:
                v.SommeDeuxVect(t, E)) {
            System.out.println(i);
        }
    }

    public void testSommeDeuxVectException() throws Exception {
        VectorHelper v=new VectorHelper();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(-9);
        t.add(0);
        t.add(78);
        t.add(2);
        t.add(123);
        t.add(-52);
        t.add(30);

        ArrayList<Integer> E=new ArrayList<>();

        E.add(-9);
        E.add(0);
        E.add(78);
        E.add(2);
        E.add(123);
        E.add(-52);
        v.SommeDeuxVect(t, E);
    }

}