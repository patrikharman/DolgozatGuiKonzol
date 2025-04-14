package hu.szamalk.nezet;

import hu.szamalk.modell.Mukincs;
import hu.szamalk.modell.Festmenyek;
import hu.szamalk.modell.Szobrok;
import hu.szamalk.modell.Gyujtemeny;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Konzol {
    private List<Mukincs> mukincsek;
    private static Gyujtemeny gyujtemeny;


    public Konzol() {
        this.mukincsek = new ArrayList<>();
        gyujtemeny = new Gyujtemeny();


        mukincsek.add(new Szobrok(UUID.randomUUID(), "alkoto1", "cim1", "kategoria1", "anyag1", 1960));
        mukincsek.add(new Szobrok(UUID.randomUUID(), "alkoto2", "cim2", "kategoria2", "anyag2", 1560));
        mukincsek.add(new Szobrok(UUID.randomUUID(), "alkoto3", "cim3", "kategoria3", "anyag3", 2020));
        mukincsek.add(new Szobrok(UUID.randomUUID(), "alkoto4", "cim4", "kategoria4", "anyag4", 1900));

        mukincsek.add(new Festmenyek(UUID.randomUUID(), "alkoto1", "cim1", "kategoria1", "stilus1", "szén"));
        mukincsek.add(new Festmenyek(UUID.randomUUID(), "alkoto2", "cim2", "kategoria2", "stilus2", "ceruza"));
        mukincsek.add(new Festmenyek(UUID.randomUUID(), "alkoto3", "cim3", "kategoria3", "stilus3", "festék"));
        mukincsek.add(new Festmenyek(UUID.randomUUID(), "alkoto4", "cim4", "kategoria4", "stilus4", "vegyes"));


        for (Mukincs mukincs : mukincsek) {
            gyujtemeny.getMukincsek().add(mukincs);
        }
    }


    public static void konzolraIr() {
        List<Mukincs> mukincsek = gyujtemeny.getMukincsek();
        for (Mukincs mukincs : mukincsek) {
            System.out.println(mukincs);
        }
    }


    public static void fajlbaIr() {
        List<Mukincs> mukincsek = gyujtemeny.getMukincsek();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("gyujtemeny.txt"))) {
            for (Mukincs mukincs : mukincsek) {
                writer.write(mukincs.toString());
                writer.newLine();
            }
            System.out.println("A műalkotások sikeresen fájlba lettek mentve.");
        } catch (IOException e) {
            System.err.println("Hiba történt a fájlba írás során: " + e.getMessage());
        }
    }


    public static void statisztika() {
        int osszes = gyujtemeny.getMukincsek().size();
        System.out.println("Összes műalkotás száma: " + osszes);
    }


    public static void main(String[] args) {
        Konzol konzol = new Konzol();
        statisztika();
        fajlbaIr();
        konzolraIr();
    }
}