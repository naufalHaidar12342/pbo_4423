import java.util.ArrayList;
import java.util.Scanner;

public class Siswa {
    // membuat arraylist 'wadahNama' dan 'wadahNIM'
    ArrayList<String> wadahNama = new ArrayList<String>();
    ArrayList<String> wadahNIM = new ArrayList<String>();

    // membuat arraylist 'wadahNilaiPraktek' dan 'wadahNlaiTeori'
    ArrayList<Double> wadahNilaiPraktek = new ArrayList<Double>();
    ArrayList<Double> wadahNilaiTeori = new ArrayList<Double>();

    // memanggil scanner lewat variabel 'inputDariUser'
    Scanner inputDariUser = new Scanner(System.in);

    // membuat variabel 'nama' dan 'nim'
    // bertipe string
    // serta variabel 'nilaiTeori' dan 'nilaiPraktek'
    // bertipe double
    String nama, nim;
    double nilaiTeori, nilaiPraktek;

    // fungsi untuk meminta nim dari user
    public String getNIM() {
        System.out.print("masukkan nim = ");
        nim = inputDariUser.nextLine();
        inputDariUser.nextLine();
        return nim;
    }

    // menyimpan nim ke dalam arraylist 'wadahNIM'
    void setNIM() {
        wadahNIM.add(nim);
    }

    // fungsi untuk meminta nama dari user
    public String getNama() {
        System.out.print("masukkan nama = ");
        nama = inputDariUser.nextLine();
        inputDariUser.nextLine();
        return nama;
    }

    // menyimpan Nama ke dalam arraylist 'wadahNama'
    void setNama() {
        wadahNama.add(nama);
    }

    // fungsi untuk meminta nilai teori dari user
    public double getTeori() {
        System.out.print("masukkan nilai teori = ");
        nilaiTeori = inputDariUser.nextFloat();
        inputDariUser.nextLine();
        return nilaiTeori;
    }

    // menyimpan nilaiTeori ke dalam arraylist 'wadahNilaiTeori'
    void setTeori() {
        wadahNilaiTeori.add(nilaiTeori);
    }

    // fungsi untuk meminta nilai praktek dari user
    public double getPraktek() {
        System.out.print("masukkan nilai praktek = ");
        nilaiPraktek = inputDariUser.nextFloat();
        inputDariUser.nextLine();
        return nilaiPraktek;
    }

    // menyimpan nilaiPraktek ke dalam arraylist 'wadahNilaiPraktek'
    void setPraktek() {
        wadahNilaiPraktek.add(nilaiPraktek);
    }

    // menampilkan isi arraylist//
    void tampilkanIsiData() {
        // menampilkan isi wadahNIM
        System.out.println("daftar nim = ");
        System.out.println(wadahNIM);
        System.out.println();

        // menampilkan isi wadahNama
        System.out.println("daftar nama = ");
        System.out.println(wadahNama);
        System.out.println();

        // menampilkan isi wadahNilaiTeori
        System.out.println("daftar nilai teori = ");
        System.out.println(wadahNilaiTeori);
        System.out.println();

        // menampilkan isi wadahNilaiPraktek
        System.out.println("daftar nilai praktek = ");
        System.out.println(wadahNilaiPraktek);
        System.out.println();

        //

    }
}
