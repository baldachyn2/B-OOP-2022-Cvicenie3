package sk.stuba.fei.uim.oop.auto;

public class Auto extends Vozidlo {
    private String modeloveMeno;

    public Auto(String znacka,String modeloveMeno, int pocetKolies) {
        super(znacka, pocetKolies);
    }

    @Override
    public  void  trubit(){
        System.out.println("tuuuuuuuu");
    }
}
