### Jawaban

**Nama  : Naufal Haidar Rauf**

**NIM   : A11.2019.12342**
2. program inheritance contoh #2

- Person.java

~~~
public class Person {
    //variabel milik parent class
    protected String name;
    protected String address;

    //method menampilkan nama dan alamat
    public void identity() {
        System.out.println("Nama : "+name);
        System.out.println("Alamat : "+address);
    }
}
~~~

- Student.java

~~~
//mewarisi method dan variabel
//dari parent class nya, 'Person'
public class Student extends Person{
    String nim;

    //method yang khas di class 'Student'
    public String getNim(){
        return nim;
    }

    //memanggil perintah override

    @Override
    public void identity(){
        System.out.println("NIM : "+getNim());
    }
}

~~~

- InheritMain.java

~~~
public class InheritMain {
    public static void main(String[] args) {
        //memanggil class 'Student'
        //lewat variabel 'mahasiswa'
        Student mahasiswa = new Student();

        //memanggil method dari parent class
        // (class Person)
        //mahasiswa.identity();

        //memanggil method dari class 'Student'
        // (anak dari class 'Person')
        //String nim= mahasiswa.getNim();
        //System.out.println(nim);

        mahasiswa.nim="A11.2000.00001";
        mahasiswa.identity();
    }
}

~~~

Ditanyakan : output dari program tersebut

Hasil :

~~~
NIM : A11.2000.00001

Process finished with exit code 0

~~~

Screenshot:

![bukti screenshot program!](pertemuan-8/praktikum/src/main/resources/contoh-soal-2.png)
