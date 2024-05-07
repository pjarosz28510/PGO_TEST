public class Furniture {
    String nazwa;
    double cena;
    double vat = 0.23;
    public Furniture(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public double getPriceWithoutVat(){
        return cena;
    }
    public double getPriceWithVat(){
        return cena-cena*vat;
    }
}
