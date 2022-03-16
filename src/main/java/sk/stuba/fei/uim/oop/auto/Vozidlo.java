package sk.stuba.fei.uim.oop.auto;

public class Vozidlo {
    protected  String znacka;
    protected int pocetKolies;


    public Vozidlo (String znacka,int pocetKolies){
        this.znacka=znacka;
    }

    public  void  trubit(){
        System.out.println("tuut tuut");
    }
}
