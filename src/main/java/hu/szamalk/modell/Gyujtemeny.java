package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny {

    private List<Mukincs> mukincsek;

    public Gyujtemeny() {
        // Inicializáljuk a mukincsek listát, hogy az módosítható legyen
        mukincsek = new ArrayList<>();
    }

    public List<Mukincs> getMukincsek() {
        return mukincsek;
    }

    // Ha van egy metódus, amely elemeket ad a gyűjteményhez
    public void addMukincs(Mukincs mukincs) {
        mukincsek.add(mukincs);
    }
}