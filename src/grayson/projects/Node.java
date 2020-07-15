package grayson.projects;

import grayson.projects.atoms.Atom;
import grayson.projects.molecules.Molecule;

public class Node<T extends Molecule<Atom<T>>> {

    private Molecule<Atom> value;
    private Molecule<Atom> leftLink;
    private Molecule<Atom> rightLink;


}
