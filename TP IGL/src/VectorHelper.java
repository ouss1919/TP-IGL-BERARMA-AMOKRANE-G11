import java.util.ArrayList;

import static sun.security.x509.CertificateVersion.V1;

/**
 * Created by DELL on 14/10/2017.
 */
public class VectorHelper {
    /**
     *  inverse les éléments d'un tableau
     *
     * @param V
     *          le tableau qu'on va inverser
     *
     * @return le tableau inversé RES
     *
     */
    ArrayList InvVect (ArrayList V){
        ArrayList RES = new ArrayList();
        for (int i=1 ; i<= V.size();i++){
            RES.add(V.get(V.size()-i));
        }
        return RES;
    }


    /**
     * Appliquer une formule s'ous forme de fonction a tous les elements d'un vecteur
     * @param V les éléments du tableau sont les premiers operands
     * @param op opérateur de la formule
     * @param x le deuxième operand de la formule
     * @return  un vecteur res qui contient le resultat
     */
    ArrayList FoncVect (ArrayList V , char op , int x){
        ArrayList res = new ArrayList();
            switch (op) {
                case '+':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) + x);
                    }
                    break;
                case '-':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) - x);
                    }
                    break;
                case '*':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) * x);
                    }
                    break;
                case '/':
                    for (int i=0;i<V.size();i++) {
                        res.add((int) V.get(i) / x);
                    }
                    break;
                default:
                    System.out.print("error");
                    break;
            }
        return res;
    }

    /**
     * fait l'operation de la somme entre deux vecteur
     * @param V1 le premier vecteur de la somme
     * @param V2 le deuxiéme vecteur de la somme
     * @return un vecteur res qui contient le resultat de la somme
     * @throws DEFERENTSIZEEXCEPTION si la taille des  deux vecteurs sont différent
     */
    ArrayList SommeDeuxVect (ArrayList V1 , ArrayList V2)throws DEFERENTSIZEEXCEPTION
    {
        ArrayList res = new ArrayList();
        try {
            for (int i=0;i<Math.max (V1.size(),V2.size());i++){
                res.add((int)V2.get(i) + (int)V1.get(i));
            }
        }catch(Exception e){
            System.out.print("DIFFERENT SIZE EXCEPTION");
        }
        return res;
    }
}
