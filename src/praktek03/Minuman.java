package praktek03;

public class Minuman {
    private String merk;
    private String rasa;
    private String bentuk;
    private double harga;
    
    void cetakInfo(){

      System.out.println("=====PRAKTEK 003=====");

      System.out.println("Merk \t        : " +merk+"\n"+

                "rasa         \t: " +rasa+"\n"+

                "bentuk        \t: " +bentuk+"\n"+

                "Harga         \t: " +harga);

  }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
