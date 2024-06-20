
package session11;
import java.util.ArrayList;
import java.util.Collection;

    public class MyCollection {
        public static void main(String[] args) {
            Collection<Integer> arrInt= new ArrayList();
            arrInt.add(1);
            arrInt.add(4);
            arrInt.add(2);
            Collection <Integer> arrInt2= new ArrayList();
            arrInt.add(5);
            arrInt.add(6);
            arrInt.add(7);
//        arrInt.addAll(arrInt2);
//        System.out.println(arrInt);

            arrInt.remove(5);
            System.out.println(arrInt);


        }
    }
