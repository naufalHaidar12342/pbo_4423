import java.util.Vector;
import java.util.Iterator;

public class VektorLatihan {
    public static void main(String[] args) {
        // membuat vektor 'angka' dan 'mamalia'
        //
        Vector<Integer> angka = new Vector<>();
        Vector<String> mamalia = new Vector<>();

        // memasukkan anggota vektor 'angka'
        angka.add(1);
        angka.add(2);
        angka.add(3);
        System.out.println(angka);
        System.out.println();

        // memasukkan anggota vektor 'mamalia'
        mamalia.add("kambing");
        mamalia.add("unta");
        mamalia.add("sapi");

        // membuat iterator bernama 'bolak_balik'
        // dimana iterator ini akan membaca isi dari
        // vektor bernama 'mamalia'
        Iterator<String> bolak_balik = mamalia.iterator();

        // menggunakan iterator 'bolak_balik'
        // untuk menampilkan isi vektor 'mamalia'
        // dengan fungsi hasNext().

        // hasNext() akan mencari apakah ada element
        // selanjutnya ketika element sebelumnya sedang
        // dibaca oleh iterator 'bolak_balik'

        // bolak_balik.next() akan dijalankan berulang-ulang
        while (bolak_balik.hasNext()) {
            System.out.print(bolak_balik.next() + ", ");
        }
        System.out.println();

        //

    }
}
