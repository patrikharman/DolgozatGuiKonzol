package hu.szamalk.modell;

import java.util.UUID;

public class Szobrok extends Mukincs {
    private String anyag;
    private int evszam;

    public Szobrok(UUID id, String alkoto, String cim, String kategoria, String anyag, int evszam) {
        super(id, alkoto, cim, kategoria);
        this.anyag = anyag;
        this.evszam = evszam;

    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public int getEvszam() {
        return evszam;
    }

    public void setEvszam(int evszam) {
        this.evszam = evszam;
    }

    @Override
    public String toString() {
        return "Szobrok{" +
                "anyag='" + anyag + '\'' +
                ", evszam=" + evszam +
                '}';
    }
}