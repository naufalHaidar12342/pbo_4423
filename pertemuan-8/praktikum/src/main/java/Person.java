import java.util.Scanner;
public class Person {
    //variabel milik parent class
    protected String name;
    protected String address;

    //scanner untuk mengambil nama dan alamat saja
    Scanner namaDanAlamat = new Scanner(System.in);

    //konstruktor pertama
    public Person() {
        System.out.println("Inside Person : Constructor");
        name="";
        address="";
    }

    //konstruktor kedua
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //
    public String getNama() {
        System.out.print("masukkan nama kamu :");
        name=namaDanAlamat.nextLine();
        //namaDanAlamat.nextLine();
        //System.out.println();
        return name;
    }
    //
    public String getAddress() {
        System.out.print("masukkan alamat kamu :");
        address=namaDanAlamat.nextLine();
        //namaDanAlamat.nextLine();
        //System.out.println();
        return address;
    }

    //
    public void setName(String name){
        this.name=name;

    }

    //
    public void setAddress(String address){
        this.address=address;
    }

    //
    public void jobs(String jobs){
        System.out.println("Pekerjaan :"+jobs);
    }

    public void hobby(){
        System.out.println("Hobi : Melukis");
    }

    //method menampilkan nama dan alamat
    public void identity() {
        System.out.println("Nama : "+name);
        System.out.println("Alamat : "+address);
    }
}
