package grayson.projects.atoms;

import grayson.projects.molecules.Molecule;

import java.util.ArrayList;

public abstract class Atom<T> {

    private String name;
    private int electrons;
    private int neutrons;
    private int protons;
    private int mass;

    public Atom(String name, int electrons, int neutrons, int protons) {
        this.name = name;
        this.electrons = electrons;
        this.neutrons = neutrons;
        this.protons = protons;
        this.mass = electrons + neutrons + protons;
    }


    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public Molecule<Atom<T>> bind(ArrayList<Atom<T>> atoms) {

        Molecule<Atom<T>> newMolecule = new Molecule<>();
        newMolecule.setAtoms(atoms);

        int hydrogenAtoms = 0;
        int oxygenAtoms = 0;
        int fluorineAtoms = 0;
        int nitrogenAtoms = 0;

        for (int i = 0; i < atoms.size(); i++) {
            if (atoms.get(i).getName().equals("Hydrogen")){
                hydrogenAtoms++;
                newMolecule.setHydrogenAtoms(hydrogenAtoms);
            } else if (atoms.get(i).getName().equals("Oxygen")) {
                oxygenAtoms++;
                newMolecule.setOxygenAtoms(oxygenAtoms);
            } else if (atoms.get(i).getName().equals("Fluorine")) {
                fluorineAtoms++;
                newMolecule.setFluorineAtoms(fluorineAtoms);
            } else if (atoms.get(i).getName().equals("Nitrogen")) {
                nitrogenAtoms++;
                newMolecule.setNitrogenAtoms(nitrogenAtoms);
            } else {
                System.out.println(atoms.get(i).getName() + " is an unidentified element");
            }
        }

        assignName(newMolecule, hydrogenAtoms, oxygenAtoms, fluorineAtoms, nitrogenAtoms);
        newMolecule.setMass();
        System.out.println(newMolecule.getMoleculeName());
        System.out.println(newMolecule.getName() + " mass = " + newMolecule.getMass());
        return newMolecule;
    }

    private void assignName(Molecule<Atom<T>> newMolecule, int hydrogenAtoms, int oxygenAtoms, int fluorineAtoms, int nitrogenAtoms) {

        if (hydrogenAtoms == 1 && oxygenAtoms == 2 && fluorineAtoms == 0 && nitrogenAtoms == 0) {
            newMolecule.setName("H2O");
        } else if (hydrogenAtoms == 3 && oxygenAtoms == 0 && fluorineAtoms == 0 && nitrogenAtoms == 1) {
            newMolecule.setName("NH3");
        } else if (hydrogenAtoms == 1 && oxygenAtoms == 0 && fluorineAtoms == 1 && nitrogenAtoms == 0) {
            newMolecule.setName("HF");
        } else {
            newMolecule.setName("Mystery Molecule");
        }
    }
}
