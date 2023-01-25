package com.Gorka;

public class Ordenadores {

    int memoria;
    int discoDuro;

    public Ordenadores(int memoria, int discoDuro) {
        this.memoria = memoria;
        this.discoDuro = discoDuro;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Ordenadores{" + "memoria=" + memoria + ", discoDuro=" + discoDuro + '}';
    }
}
