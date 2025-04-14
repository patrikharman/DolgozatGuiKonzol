package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.List;

public class Gyujtemeny {

    private List<Mukincs> mukincsek;

    public Gyujtemeny() {

        mukincsek = new ArrayList<>();
    }

    public List<Mukincs> getMukincsek() {
        return mukincsek;
    }


    public void addMukincs(Mukincs mukincs) {
        mukincsek.add(mukincs);
    }
}