package praktek03;

public class MinumanAksi {
    public static void main(String[] args) {
        Minuman s = new Minuman();
           s.setMerk("mizone");
           s.setRasa("leci");
           s.setBentuk("gelas");
           s.setHarga(3000);
           //gak bisas.setKhasiatMinuman()
           
        s.cetakInfo();
        
        System.out.println("Merknya /t: ");
        System.out.println(s.getMerk());
        System.out.println("Rasanya /t: ");
        System.out.println(s.getRasa());
        System.out.println("Bentuknya /t: ");
        System.out.println(s.getBentuk());
        System.out.println("Harganya /t: ");
        System.out.println(s.getHarga());
        
        KhasiatMinuman sm = new KhasiatMinuman();
        sm.setMerk("Torabika");
        sm.setRasa("Manis");
        sm.setBentuk("botol");
        sm.setHarga(20000);
        sm.setKhasiatMinuman("Penyegar");
        sm.cetakInfo();
        System.out.println("khasiatMinuman :"+sm.getKhasiatMinuman());
    }
}
