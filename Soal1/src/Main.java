public class Main {
    public static void main(String[] args) {
        // Class adalah sebuah blueprint/cetakan yang digunakan untuk
        // membuat sebuah objek yang mendefinisikan karakter/perilaku
        // objek yang akan dibuat. Class sendiri berisi variabel atau
        // data dan fungsi atau method untuk memanipulasi data tersebut.

        // Object adalah instansiasi/produk dari class, bisa juga kita
        // artikan sebagai hasil pembuatan objek dari blueprint yang
        // telah ditentukan oleh class. Object sendiri memiliki karakteristik
        // yang telah ditentukan oleh class.

        // Constructor adalah sebuah method khusus pada suatu classs yang
        // berfungsi untuk menginisialisasi objek dari class tersebut.
        // Constructor dijalankan secara otomatis ketika objek baru dibuat.
        // Constructor dapat memiliki parameter atau tidak tergantung
        // kebutuhan class tersebut.

        // Method overloading adalah kemampuan untuk membuat beberapa method
        // dengan nama yang sama pada suatu class, namun memiliki parameter
        // yang berbeda-beda. Hal ini membuat kita bisa menggunakan nama
        // method yang sama dengan berbagai jenis parameter yang berbeda
        // sehingga dapat meningkatkan fleksibilitas dan kemudahan penggunaan
        // class.

        // Getter dan setter adalah sebuah method yang digunakan untuk mengakses
        // atau memanipulasi nilai dari variabel yang terdapat pada suatu class.
        // Getter digunakan untuk mengambil nilai dari variabel, sedangkan
        // setter digunakan untuk mengubah nilai variabel tersebut. Getter dan
        // Setter biasanya digunakan pada variabel private yang tidak dapat diakses
        // langsung oleh kode program lainnya. Dengan menggunakan getter dan setter,
        // kita dapat membatasi akses langsung ke variabel tersebut dan melakukan
        // validasi nilai yang dimasukkan.


        // Contoh object
        Kucing kucing1 = new Kucing("Garfield", "rumah majikan tentu nya");

        Ikan ikan1 = new Ikan("Nemo", "lautan samudera");

        kucing1.hello();
        ikan1.hello();
    }
}