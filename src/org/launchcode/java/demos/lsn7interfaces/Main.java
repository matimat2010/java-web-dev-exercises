package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator cComparator = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(cComparator);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        for(Flavor name : flavors) {
            System.out.println(name.getName());
        }

        System.out.println("\n");

        for(Cone cost : cones){
            System.out.println(cost.getName() + "  " + cost.getCost());
        }
    }
}
