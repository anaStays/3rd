
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public  static void main(String args[]) {
        Comparator test = new Comparator(10000);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        System.out.println();
        System.out.println("Number of operations: " + test.getCountOperations());
        System.out.println("          __________________________");
        System.out.println("           ArrayList | LinkedList  ");
        System.out.println("          __________________________");
        System.out.println("   add   |   " + test.add(arrayList) +  "ms   |   " + test.add(linkedList) +   "ms   |");
        System.out.println("          __________________________");
        System.out.println("addBegin |   " + test.addBegin(arrayList) +  "ms   |   " + test.addBegin(linkedList) +   "ms   |");
        System.out.println("          __________________________");
        System.out.println("addEnd   |   " + test.addEnd(arrayList) +  "ms   |   " + test.addEnd(linkedList) +   "ms   |");
        System.out.println("          __________________________");
        System.out.println("   get   |   " + test.get(arrayList) +  "ms   |   " + test.get(linkedList) +   "ms   |");
        System.out.println("          __________________________");
        System.out.println(" delete  |   " + test.delete(arrayList) +  "ms   |   " + test.delete(linkedList) +   "ms   |");
        System.out.println("          ___________________________");
    }
}