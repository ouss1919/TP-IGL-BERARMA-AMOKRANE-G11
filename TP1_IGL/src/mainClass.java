import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by AMOKRANE Abdennour on 14/10/2017.
 */
public class mainClass {
    public static void main(String[] args) {
    ArrayList v = new ArrayList();
    v.add(5); v.add(0); v.add(-8); v.add(789);v.add(-50);v.add(100);
        VectorHelper h =new VectorHelper();
        /*Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            v.add(Integer.valueOf(s.nextInt()));
        }*/
        //System.out.print(v.size());
        h.triRapide(v);
        for (Object i:
                v) {
            System.out.println(i);
        }
    }
}
