import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by DELL on 14/10/2017.
 */
public class Main {
    public static void main(String[] args) throws DEFERENTSIZEEXCEPTION {
       ArrayList V1 = new ArrayList();
        ArrayList V2 = new ArrayList();
        V1.add(90);V1.add(12);V1.add(9);V1.add(56);V1.add(3);V1.add(80);V1.add(24);V1.add(76);V1.add(133);V1.add(7);V2.add(3);
        V2.add(13);V2.add(42);V2.add(23);V2.add(66);V2.add(76);V2.add(2);V2.add(44);V2.add(56);V2.add(23);V2.add(2);
        VectorHelper H = new VectorHelper();
        try {
            System.out.print(V1.size()+" "+V2.size());
            H.SommeDeuxVect(V1,V2);
        } catch (DEFERENTSIZEEXCEPTION deferentsizeexception) {
            deferentsizeexception.printStackTrace();
        }
    }
}
