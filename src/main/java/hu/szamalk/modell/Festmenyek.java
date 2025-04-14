package hu.szamalk.modell;

import java.util.UUID;

public class Festmenyek extends Mukincs {
    private String stilus;
    private String technika;

    public Festmenyek(UUID id, String alkoto, String cim, String kategoria, String stilus, String technika) {
        super(id, alkoto, cim, kategoria);
        this.stilus = stilus;
        this.technika = technika;
    }

    public String getStilus() {
        return stilus;
    }

    public void setStilus(String stilus) {
        this.stilus = stilus;
    }

    public String getTechnika() {
        return technika;
    }

    public void setTechnika(String technika) {
        this.technika = technika;
    }

    @Override
    public String toString() {
        return "Festmenyek{" +
                "stilus='" + stilus + '\'' +
                ", technika='" + technika + '\'' +
                '}';
    }
}