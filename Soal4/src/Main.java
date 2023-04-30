public class Main {
    public static void main(String[] args) {

        // Rumus matematika menghitung akar persamaan kuadrat
        // Misalkan kita mempunyai persamaan kuadrat 2x^2 - x - 15
        // Kemudian kita diminta mencari himpunana penyelesaiannya
        // Maka nilai a=2, b=-1 dan c=-15
        // lalu kita lanjut ke perhitungan akar1 dan akar2
        // sesuai kode di bawah
        Matematika mat1 = new Matematika(2, -1, -15);

        System.out.println("Hasil akar pertama adalah " + mat1.getresult1());
        System.out.println("Hasil akar kedua adalah " + mat1.getresult2());

        // Rumus Fisika menghitung besar gaya listrik
        // Tujuan dari rumus ini adalah untuk menghitung
        // besar gaya antara muatan 1 dan 2 yang dinotasikan dengan (q1 dan q2)
        // di udara pada jarak r.
        // Besar gaya memiliki satuan newton,
        // muatan 1 dan 2 memiliki satuan coulomb,
        // dan jarak memiliki satuan meter.
        Fisika fis1 = new Fisika(25, 16, 5);

        System.out.println("Besar gaya yang diperoleh adalah sebesar " + fis1.getResult1() + " Newton");


    }
}