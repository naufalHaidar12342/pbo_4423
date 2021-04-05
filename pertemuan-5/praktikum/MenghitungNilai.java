import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class MenghitungNilai {
    ArrayList<Double> wadahNilai = new ArrayList<>();
    ArrayList<String> wadahNama = new ArrayList<String>();

    //
    Scanner inputanUser = new Scanner(System.in);

    /*
     * membuat variabel tipe string bernama 'nama', dan membuat variabel tipe
     * integer, bernama 'nilai'
     */

    String nama;
    Double nilai;

    // meminta input nama
    public String mintaNama() {
        System.out.print("masukkan nama = ");
        nama = inputanUser.nextLine();
        System.out.println();
        return nama;
    }

    // menyimpan nama yang dimasukkan user
    // ke dalam arrayList 'wadahNama'
    void simpanNama() {
        wadahNama.add(nama);
    }

    // meminta input nilai
    public double mintaNilai() {
        System.out.print("masukkan nilai = ");
        nilai = inputanUser.nextDouble();

        System.out.println();
        return nilai;
    }

    // menyimpan nilai yang dimasukkan user
    // ke dalam arrayList 'wadahNilai'
    void simpanNilai() {
        wadahNilai.add(nilai);
    }

    // menampilkan nama dan nilai
    // yang sudah disimpan tadi
    void daftarNilai() {
        //
        Iterator<String> iteratorWadahNama = wadahNama.iterator();

        //
        Iterator<Double> iteratorWadahNilai = wadahNilai.iterator();

        //
        System.out.println("daftar nama = ");
        System.out.println(iteratorWadahNama.hasNext());
        System.out.println();

        //
        System.out.println("daftar nilai= ");
        System.out.println(iteratorWadahNilai.hasNext());
    }

}
