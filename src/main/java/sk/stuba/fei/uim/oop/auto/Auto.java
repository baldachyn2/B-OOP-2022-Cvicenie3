package sk.stuba.fei.uim.oop.auto;

public class Auto {
    public double kapacitaNadrze;
    public double stavNadrze;
    public static final double PALIVO_NA_KM = 0.2;
    public static final double KAPACITA_NADRZE = 100;
    public boolean ojazdene;

    public Auto() {
        this(KAPACITA_NADRZE);
    }

    public Auto(double kapacitaNadrze){
        this.ojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
        this.stavNadrze = 50;
    }

    public void jazdi(double vzdialenost) {
        this.ojazdene = true;
        stavNadrze -= vzdialenost * PALIVO_NA_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public String stav() {
        String vysledok;
        if (this.ojazdene) {
            vysledok = "Auto je ojazdene";
        } else {
            vysledok = "Auto je neojazdene";
        }
        vysledok += " Stav nadrze: " + stavNadrze + "/" + kapacitaNadrze;
        return vysledok;
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }
}
