import java.util.ArrayList;
import java.util.Scanner;
public class NilaiSiswa {
    //
    ArrayList<Double> daftarNilai;
    Scanner IsiNilai = new Scanner(System.in);

    //
    Double nilai;

    NilaiSiswa() {
        daftarNilai = new ArrayList<>();
    }

    //
    public Double mintaNilai() {
        System.out.print("masukkan Nilai = ");
        nilai = IsiNilai.nextDouble();
        IsiNilai.nextLine();
        return nilai;

    }

    //
    void pushKeDaftarNilai() {
        daftarNilai.add(nilai);

    }

    public boolean isEmpty() {
        return daftarNilai.isEmpty();

    }

    //
    void popNilai() {
        if (!isEmpty()) {
            // Double popNilaiPilihan = daftarNilai.get(daftarNilai.size() - 1);
            Double anggotaTerhapus;
            anggotaTerhapus = daftarNilai.remove(daftarNilai.size() - 1);
            System.out.println("anggota dari stack yang terhapus = " + anggotaTerhapus);

        } else {
            System.out.println("Stack sudah kosong");
            System.out.println("pop dari stack yang kosong");
        }

    }

    //
    Double intipAnggotaPalingAtas() {
        return daftarNilai.get(daftarNilai.size() - 1);

    }

    //
    void cariLetakAnggota(){
        int indeksNilaiDicari;
        Double nilaiDicari;
        System.out.print("nilai yang akan dicari = ");
        nilaiDicari= IsiNilai.nextDouble();
        if(daftarNilai.contains(nilaiDicari)){
            indeksNilaiDicari= daftarNilai.indexOf(nilaiDicari);
            System.out.println("anggota stack bernama : "+nilaiDicari+", ditemukan pada index = "+indeksNilaiDicari);
        }else{

            System.out.println("anggota stack bernama :"+nilaiDicari+" sudah tidak ada dalam stack");
        }

        /*
        * int indeksAnggotaDicari;
        String anggotaDicari;
        System.out.print("nama yang akan dicari posisinya = ");
        anggotaDicari=IsiNama.nextLine();
        if(daftarNama.contains(anggotaDicari)){
            indeksAnggotaDicari=daftarNama.indexOf(anggotaDicari);
            System.out.println("anggota stack bernama : "+anggotaDicari+", ditemukan pada index = "+indeksAnggotaDicari);
        }else{
            System.out.println("anggota stack bernama :"+anggotaDicari+" sudah tidak ada dalam stack");
        }*/
    }
}
