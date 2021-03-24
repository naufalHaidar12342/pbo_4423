public class Mahasiswa {
    private int nim;
    private String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public int ambilNim() {
        return nim;
    }

    public String ambilNama() {
        return nama;
    }
}
