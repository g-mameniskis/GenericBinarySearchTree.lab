package grayson.projects;

import grayson.projects.atoms.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Welcome to the Generic LinkedList Learned Lab!
        // Here you will practice using Linked Lists, Binary Search Trees, and Class Generics
        // Goals of the Lab:
            // Establish confidence creating generic classes that have multiple sub classes extending
            // Gain experience building LinkedLists and Binary Search Trees
            // Understand Type Parameters and the security restrictions they can put on your program

        // Instructions;
            // Create a generic interface representing some characteristic common in your entities
            // generify the interface using your implementing base class as a type parameter
            // generify your base class using type parameters
            // create three different subclasses that extend your base class
            // build a generified linkedlist class that restricts elements of different types
            // build a binary search tree modeled after your linkedlist

        ArrayList<Atom> h2oElement = new ArrayList<>();

        Atom hydrogenAtom1 = new HydrogenAtom();
        Atom oxygenAtom1 = new OxygenAtom();
        Atom oxygenAtom2 = new OxygenAtom();
        Atom fluorineAtom1 = new FluorineAtom();
        Atom nitrogenAtom1 = new NitrogenAtom();

        h2oElement.add(hydrogenAtom1);
        h2oElement.add(oxygenAtom1);
        h2oElement.add(oxygenAtom2);

        hydrogenAtom1.bind(h2oElement);


        ArrayList<Atom> nh3Element = new ArrayList<>();
        nh3Element.add(new NitrogenAtom());
        nh3Element.add(new HydrogenAtom());
        nh3Element.add(new HydrogenAtom());
        nh3Element.add(new HydrogenAtom());

        oxygenAtom1.bind(nh3Element);
        System.out.println(hydrogenAtom1.getMass());
        System.out.println(fluorineAtom1.getMass());
        System.out.println(nitrogenAtom1.getMass());
    }
}
