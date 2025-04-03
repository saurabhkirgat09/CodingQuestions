package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorOnList {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> arrayList =
                new CopyOnWriteArrayList<>(Arrays.asList(23, 33, 22, 43, 43, 44, 56));

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();  // Fetch only once
            System.out.print(value + " ");
            if (value.equals(43)) {  // Check on the same value
                arrayList.add(34);
                arrayList.remove(Integer.valueOf(56));
            }
        }

        System.out.println("\nUpdated List: " + arrayList);

        // Corrected loop to properly iterate and print each element
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ensure subList indices are valid
        if (arrayList.size() > 5) {
            System.out.println("Printing sub list from index 2 to 5: " + arrayList.subList(2, 5));
        } else {
            System.out.println("List is too small for subList operation.");
        }
    }
}
