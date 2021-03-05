class variables {
    public static void main(String[] args) {
        //tipe data
        //integer, float, string
        //boolean

        int angka;
        angka=2; 
        //memasukkan nilai '2' ke dalam 'angka'
        // %d merupakan decimal
        System.out.printf("angka=%d \n",angka);
        System.out.println("angka "+angka+" merupakan bilangan genap");

        // langkah lain inisiasi
        int _angka;
        _angka=33;
        int $angka;
        $angka=43;
        System.out.println(_angka+$angka);

        char karakter;
        karakter='%';
        System.out.println(karakter);
        double tampungan;
        tampungan=3.3;
        System.out.println("angka " +tampungan+" adalah pecahan");

        // %f menampilkan angka di belakang koma
        //yang lebih panjang
        System.out.printf("angka= %f",tampungan);

        //angka=tampungan;
        //integer di tukar dengan double/float, tidak bisa
        //tapi sebaliknya, justru bisa (float/double ditukar
        //dengan integer)

        tampungan=angka;
        
        // mencetak 2 digit di belakang koma
        // gunakan %.2f
        // jika ingin lebih dari 2, angka '2'
        //di dalam %.2f diganti 3,4,5 , dst...
        System.out.printf("angka= %.2f", tampungan);

        //integer dibagi dengan integer
        //akan menghasilkan integer
        int angka2;
        angka2=3;
        System.out.println(angka/angka2);

        //jika ingin menghasilkan pecahan,
        //siapkan dulu wadah untuk hasil pembagian,
        //kemudian ubah angka dan angka2 ke dalam pecahan
        double hasilbagi;

        //mengubah angka dan angka2 ke dalam pecahan/double
        hasilbagi=(float)angka/(float)angka2;
        System.out.println(hasilbagi);       
        

        // mencetak variabel secara bersamaan
        // nilai/value bisa langsung di assign 
        int b=2,c=3,d=4;
        System.out.println(b+" "+c+" "+d);


        // char jika di cetak bersama dengan char
        // akan dicasting ke int, nilainya 50
        int a=2;
        char karakter2='2';
        int karakter3='2';
        System.out.println(a+karakter2);
        //karakter2 dicetak bersama dengan a
        // a bertipe integer. karakter2 dicast 
        // menjadi int bernilai 50
        // sehingga, a+karakter2 =2+50 
        //                       =52

        System.out.println(karakter3);
        //membuktikan apakah benar char jika dicast
        // ke int bernilai 50. terbukti benar
        //karakter3=50

        //tipe boolean
        //deklarasi dengan boolean ;
        boolean sementara;
        sementara=true;
        System.out.println(sementara);

        String namaDepan="john";
        String namaBelakang="doe";
        System.out.println(namaDepan+""+namaBelakang);
    }
}
