import java.util.Scanner;
//mewarisi method dan variabel
//dari parent class nya, 'Person'
public class Student extends Person{
    String nim;
    Integer sks,spp,modulKuliah;
    int totalTagihan;
    Integer hargaSKS=150000;
    Integer hargaModul=100000;
    Scanner tanyaMahasiswa = new Scanner(System.in);
    //konstruktor untuk 'Student'
    public Student(){
        System.out.println("Inside Student : Constructor ");
    }

    //method yang khas di class 'Student'
    public String getNim(){
        System.out.print("masukkan NIM kamu :");
        nim=tanyaMahasiswa.nextLine();
        //tanyaMahasiswa.nextLine();
        System.out.println();
        return nim;
    }

    //method untuk meminta berapa banyak sks yang diambil
    public Integer getSKS(){
        System.out.print("berapa SKS yang diambil?(max. 20 sks) : ");
        sks= tanyaMahasiswa.nextInt();
        tanyaMahasiswa.nextLine();
        return sks;
    }

    //method untuk meminta harga spp yang diambil
    public Integer getSpp(){
        System.out.print("besaran SPP yang diambil? : ");
        spp= tanyaMahasiswa.nextInt();
        tanyaMahasiswa.nextLine();
        return sks;
    }
    //method untuk meminta berapa modul yang diambil semester ini
    public Integer getModulKuliah() {
        System.out.print("berapa modul yang diambil? : ");
        modulKuliah= tanyaMahasiswa.nextInt();
        tanyaMahasiswa.nextLine();
        return modulKuliah;
    }

    //
    public int hitungTagihan(){
        totalTagihan=(sks*hargaSKS)+(modulKuliah*hargaModul)+spp;
        return totalTagihan;
    }
    //
    @Override
    public void identity() {
        System.out.println("NIM : "+getNim());
        System.out.println("Nama :"+super.name);
        System.out.println("Alamat :"+super.address);
    }

    //memanggil perintah override

    //@Override
    //public void identity(){
    //    System.out.println("NIM : "+getNim());
    //}

    //override kedua
//    @Override
//    public void identity() {
//        //super.identity();
//        System.out.println("NIM : "+getNim());
//        //super.identity();
//    }

    void pekerjaan(){
        System.out.println("Pekerjaan : Mahasiswa");
    }
}
