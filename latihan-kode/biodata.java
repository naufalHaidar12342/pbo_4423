//membuat biodata
//serta menampilkan rumus luas dan keliling
//naufalHaidar12342

public class biodata {
    public static void main(String[] args) {
        //print di java ada 3 macam
        //println = otomatis enter ke line/baris di bawahnya
        //print   = mencetak sebaris
        //printf  = mencetak dengan format tertentu
        //ingat! setiap akhir print, cantumkan " ; "

        System.out.print("\n");
        // " \n " digunakan untuk memberi jarak saja 
        System.out.print(">>>Biodata<<< \n");
        System.out.print("\n");
        System.out.println("NIM         :A11.2019.12342");
        System.out.println("Nama        :Naufal Haidar Rauf");
        System.out.println("Alamat      :Zebra Mukti Utara II, Pedurungan Kidul");
        System.out.println("Kota        :Semarang");
        System.out.println("Kode Pos    :50192");
        System.out.println("Telp        :-");
        System.out.println("Hp          :085156967023");
        System.out.println("Email       :111201912342@mhs.dinus.ac.id");
        
        // pemisah saja, biar tidak bingung//

        System.out.print("\n");
        System.out.print("====> Luas dan Keliling Segitiga <====");
        System.out.print("\n");
        int alas,tinggi,luas,sisi,kel;
        alas=6;
        tinggi=10;
        luas=alas*tinggi/2;
        sisi=4;
        kel=3*sisi;

        // %d berfungsi untuk memberi jarak dari kiri.
        // untuk angka
        
        System.out.printf("Alas = %d\n ", alas);
        System.out.printf("Tinggi = %d\n ", tinggi);
        System.out.printf("Sisi = %d\n ", alas);
        System.out.print("\n");
        System.out.printf("Jadi, luas segitiga = %d\n", luas);
        System.out.printf("Jadi, keliling segitiga = %d\n", kel);



        

    } 
        
    
}
