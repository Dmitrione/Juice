
package by.bsu.bogdanchuk;

import java.util.*;
import java.io.*;


public class Juice {

    private static List<String> allFruits2;
    private static Set<String> allFruits;
    private Set<String> fruits;
    private String components;

    public Juice(String aComponents) {
        components = aComponents;
        fruits = new TreeSet();
        String c = null;
        StringTokenizer tokens = new StringTokenizer(components, " ");
        while (tokens.hasMoreTokens()) {
            c = tokens.nextToken();
            fruits.add(c);
            if (!allFruits2.contains(c))
            allFruits2.add(c);
            allFruits.add(c);

        }

    }

    @Override
    public String toString() {
        return components;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("juice.in"));
        String newJuice;
        List<Juice> juices = new ArrayList();
        allFruits = new TreeSet();
        allFruits2 = new ArrayList();
        while ((newJuice = br.readLine()) != null) {
            juices.add(new Juice(newJuice));
//            System.out.println(newJuice);
        }

        for (Juice j : juices) {
            System.out.println(j.toString());
        }

        System.out.println("Список компонент сока без сортировки");
        for (String s : allFruits2) {
            System.out.println(s);
        }
        System.out.println("Список компонент сока с сортировкой");
        for (String j : allFruits) {
            System.out.println(j);
        }
    }
}
