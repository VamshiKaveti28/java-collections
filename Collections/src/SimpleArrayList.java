import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SimpleArrayList {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("enter the list...");
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
       // list.add(sc.nextInt());
     /*   list.remove(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.set(3,33);
        System.out.println(list); */
        list.clone();

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.contains(65));
        for (int numbers : list) {
            System.out.print(numbers);
            System.out.print(",");
        }


        }


    }