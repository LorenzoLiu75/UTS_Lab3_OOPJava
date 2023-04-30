public class Ikan extends Kucing {
    public Ikan(String nama, String habitat) {
        super(nama, habitat);
    }

    // method overloading
    public void hello() {
        System.out.println("Halo aku adalah Ikan bernama " + this.getNama());
        System.out.println("Aku tinggal di " + this.getHabitat());
    }
}
