package grayson.projects.molecules;

import grayson.projects.TreeNode;
import grayson.projects.atoms.Atom;

import java.util.ArrayList;

public class Molecule<T extends Atom> extends TreeNode {

    private String name;
    private int hydrogenAtoms;
    private int oxygenAtoms;
    private int fluorineAtoms;
    private int nitrogenAtoms;
    private int mass;

    private ArrayList<T> atoms = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMoleculeName() {
        return name;
    }

    public void setAtoms(ArrayList<T> atoms) {
        this.atoms = atoms;
    }

    public void setHydrogenAtoms(int hydrogenAtoms) {
        this.hydrogenAtoms = hydrogenAtoms;
    }

    public void setOxygenAtoms(int oxygenAtoms) {
        this.oxygenAtoms = oxygenAtoms;
    }

    public void setFluorineAtoms(int fluorineAtoms) {
        this.fluorineAtoms = fluorineAtoms;
    }

    public void setNitrogenAtoms(int nitrogenAtoms) {
        this.nitrogenAtoms = nitrogenAtoms;
    }

    public void setMass() {
        this.mass = this.hydrogenAtoms + this.oxygenAtoms + this.fluorineAtoms + this.nitrogenAtoms;
    }

    public int getMass() {
        return mass;
    }

    public int compareTo(Molecule<T> molecule) {

        if (this.getMass() > molecule.getMass()) {
            return -1;
        } else if (this.getMass() < molecule.getMass()) {
            return 1;
        } else {
            return 0;
        }
    }
}
