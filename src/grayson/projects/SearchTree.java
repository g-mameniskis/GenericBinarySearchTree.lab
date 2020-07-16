package grayson.projects;

import grayson.projects.atoms.Atom;
import grayson.projects.molecules.Molecule;

public class SearchTree<T extends Molecule<Atom<T>>> {

    private Molecule<Atom<T>> root = null;

    public boolean addItem(Molecule<Atom<T>> newMolecule) {

        if (root == null) {
            this.root = newMolecule;
            System.out.println(newMolecule.getName() + " is now the root of the list");
            return true;
        }

        Molecule<Atom<T>> currentElement = this.root;
        while(root != null) {

            if (currentElement.compareTo(newMolecule) == -1) {
                // head is greater than new element, move left
                if (currentElement.moveLeft() != null) {
                    currentElement = currentElement.moveLeft();
                } else {
                    currentElement.setLeft(newMolecule);
                    return true;
                }
            } else if (currentElement.compareTo(newMolecule) == 1) {
                // new element is larger than the root, move right
                if (currentElement.moveRight() != null) {
                    currentElement = currentElement.moveRight();
                } else {
                    currentElement.setRight(newMolecule);
                    return true;
                }
            } else {
                System.out.println(newMolecule.getName() + " is already present");
                return false;
            }
        }
        return false;
    }

    public void traverse(Molecule<Atom<T>> molecule) {

        if (molecule != null) {
            traverse(molecule.moveLeft());
            System.out.println("Hello, I am " + molecule.getName());
            traverse(molecule.moveRight());
        }
    }
}
