import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PersamaanDenganUnary {
    public static void main(String[] args) {
        // deklarasi persamaan yang akan dicek
        String persamaan1 = "11+1=1+1+1";

        // membuat list (array yang dinamis) bertipe arraylist(nama lain dari 'list')
        // kita beri nama list tersebut 'listDariChars'
        List<Character> listDariChars = new ArrayList<>();

        // mengubah string ke list berisi char
        // kemudian push ke stack 'listDariChars' bertipe Characters

        for (

        char sementara : persamaan1.toCharArray()) {
            listDariChars.add(sementara);

            if (persamaan1.contains("=")) {
                continue;
            }

        }

        // mendeklarasikan iterator bernama 'aksesAnggota'
        // untuk mencetak atau menampilkan tiap anggota dari stack
        Iterator aksesAnggota = listDariChars.iterator();

        // perulangan while untuk mencetak anggota dari stack
        while (aksesAnggota.hasNext()) {
            System.out.println("anggota dari stack yang ditambahkan: " + aksesAnggota.next());

        }
        System.out.println();

        // perulangan untuk mengecek ketikan
        // stack tidak kosong.
        // jika tidak kosong, akan pop anggota dari stack
        while (!listDariChars.isEmpty()) {
            char anggotaHilang;
            anggotaHilang = listDariChars.remove(listDariChars.size() - 1);
            System.out.println("anggota dari stack yang terhapus : " + anggotaHilang);

        }

    }

}
