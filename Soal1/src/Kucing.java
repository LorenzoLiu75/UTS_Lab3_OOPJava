// contoh class
public class Kucing {

    private String nama, habitat;

    // constructor
    public Kucing(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    public void hello() {
        System.out.println("Halo aku adalah Kucing bernama " + nama);
        System.out.println("Aku tinggal di " + habitat);
    }

    // getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
