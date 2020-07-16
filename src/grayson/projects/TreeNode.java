package grayson.projects;

import grayson.projects.atoms.Atom;
import grayson.projects.molecules.Molecule;

public abstract class TreeNode<T extends Molecule<Atom<T>>> {

    private Molecule leftLink;
    private Molecule rightLink;

    public Molecule moveLeft() {
        return this.leftLink;
    }

    public Molecule moveRight() {
        return this.rightLink;
    }

    public Molecule setLeft(Molecule leftMolecule) {
        return this.leftLink = moveLeft();
    }

    public Molecule setRight(Molecule rightMolecule) {
        return this.rightLink = moveRight();
    }
}
