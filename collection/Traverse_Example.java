import java.util.*;

public class Traverse_Example{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        //for-each loop
        for (String fruit : list) {
            System.out.print(fruit);
            StringBuffer sb = new StringBuffer(fruit);
            sb.reverse();
            System.out.println("    "+sb);
        }
        System.out.println("___________________________");
        //traversing using Iterator : Forward Traversing
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("___________________________");
        //traversing using ListIterator : Backward Traversing
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("___________________________");
        // Enumeration Traversing
        Vector<String> vector = new Vector<>(list);
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("___________________________");
        // for each method
        list.forEach(e -> {
            System.out.println(e);
        });
        TreeSet<String> treeSet = new TreeSet<>(list);
        treeSet.addAll(list);
        System.out.println("___________________________");
        treeSet.forEach(e -> {
            System.out.println(e);
        });
    }
}