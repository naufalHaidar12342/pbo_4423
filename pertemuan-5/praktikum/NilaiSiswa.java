import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        // memanggil kelas 'Siswa'
        // lewat variabel 'aksesKelasSiswa'
        Siswa akses_kelas_Siswa = new Siswa();

        // memanggil scanner lewat variabel
        // pilihanUser
        Scanner pilihanUser = new Scanner(System.in);
        // membuat variabel 'isiUlang'
        // bertipe integer untuk menampung pilihan
        // input data
        int isiUlang;

        try {
            //// memanggil fungsi getNim
            // dan setNim
            akses_kelas_Siswa.getNIM();
            akses_kelas_Siswa.setNIM();

            //// memanggil fungsi getNama
            // dan setNama
            akses_kelas_Siswa.getNama();
            akses_kelas_Siswa.setNama();

            //// memanggil fungsi getTeori
            // dan setTeori
            akses_kelas_Siswa.getTeori();
            akses_kelas_Siswa.setTeori();

            //// memanggil fungsi getPraktek
            // dan setPraktek
            akses_kelas_Siswa.getPraktek();
            akses_kelas_Siswa.setPraktek();

            // mengisi lagi //
            System.out.print("ingin isi berapa data lagi? = ");
            isiUlang = pilihanUser.nextInt();

            for (int i = 0; i < isiUlang; i++) {
                //
                akses_kelas_Siswa.getNIM();
                akses_kelas_Siswa.setNIM();

                //
                akses_kelas_Siswa.getNama();
                akses_kelas_Siswa.setNama();

                //
                akses_kelas_Siswa.getTeori();
                akses_kelas_Siswa.setTeori();

                //
                akses_kelas_Siswa.getPraktek();
                akses_kelas_Siswa.setPraktek();
            }
            // menampilkan isi dari semua arraylist//
            akses_kelas_Siswa.tampilkanIsiData();
        } finally {
            // menutup input
            pilihanUser.close();
        }

    }
}
