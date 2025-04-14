package hu.szamalk.modell;

import java.util.UUID;

public class Mukincs {
    private UUID id;
    private String alkoto;
    private String cim;
    private String kategoria;

    public Mukincs(UUID id, String alkoto, String cim, String kategoria) {
        this.id = id;
        this.alkoto = alkoto;
        this.cim = cim;
        this.kategoria = kategoria;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public void setAlkoto(String alkoto) {
        this.alkoto = alkoto;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Mukincs{" +
                "id=" + id +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}