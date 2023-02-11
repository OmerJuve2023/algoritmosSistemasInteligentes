package org.example.p01;

public class p01 {
    private int[] persons;

    public p01() {
        this.persons = new int[]{1, 2, 3, 4, 5, 6};
    }

    private void oneMessage() {
        System.out.print("[----] [----] [----] [----] [----] [----] \t\t\t");
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] > 3) {
                System.out.print("[" + "misionero" + "]");
            } else {
                System.out.print("[" + "canibal" + "]");
            }
        }
    }

    private void ruta() {

    }

    public static void main(String[] args) {
        p01 p = new p01();
        p.oneMessage();
    }
}
