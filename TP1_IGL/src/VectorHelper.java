import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by AMOKRANE Abdennour on 14/10/2017.
 */
public class VectorHelper {

    void VectorHelper() {

    }

    /**
     *
     * La méthode de triage d'un vecteur
     *
     * @param tableau
     *          Contient le vecteur a triée.
     * @return
     *          Le tableau triée.
     */

    public void triRapide(ArrayList<Integer> tableau)
    {
        int longueur=tableau.size();
        triRapide(tableau,0,longueur-1);
    }

    public static int partition(ArrayList<Integer> tableau, int deb, int fin)
    {
        int compt=deb;
        int pivot=tableau.get(deb);

        for(int i=deb+1;i<=fin;i++)
        {
            if (tableau.get(i)<pivot)
            {
                compt++;
                echanger(tableau,compt,i);
            }
        }
        echanger(tableau,deb,compt);
        return(compt);
    }

    public static void echanger(ArrayList<Integer> tableau, int deb, int compt) {
        int a = tableau.get(compt);
        tableau.set(compt, tableau.get(deb));
        tableau.set(deb, a);
    }

    public static void triRapide(ArrayList<Integer> tableau, int deb, int fin)
    {
        if(deb<fin)
        {
            int positionPivot=partition(tableau,deb,fin);
            triRapide(tableau,deb,positionPivot-1);
            triRapide(tableau,positionPivot+1,fin);
        }
    }

    /**
     * cherche le Max et le Min d'un tableau
     * @param V //
     * @return un tableau qui contient le max ensuite le min
     */
    ArrayList MaxMinVect (ArrayList V){
        ArrayList res = new ArrayList();
        int min ;
        int max ;
        min = (int) V.get(0);
        max = (int) V.get(0);
        for (int i=1;i<V.size();i++){
            if ( (int) V.get(i) < min) min = (int) V.get(i);
            if ( (int) V.get(i) > max) max = (int) V.get(i);
        }
        res.add(max);
        res.add(min);
        return res;
    }


}
