public class Tampilkan_CPU {
    public static void main(String[] args) {
        // memanggil class 'CPU' lewat variabel
        // 'kunjungiCPU'
        CPU kunjungiCPU = new CPU();

        /*
         * variabel 'tampilkanProcie' akan memanggil class 'Processor' yang ada di dalam
         * class 'CPU'.
         * 
         * Tapi, variabel ini memerintahkan si variabel 'kunjungiCPU' karena
         * 'tampilkanProcie' tidak bisa melakukannya tanpa orang dalam . Jadi, variabel
         * 'kunjungiCPU' merupakan orang suruhan dari variabel 'tampilkanProcie'
         */
        CPU.Processor tampilkanProcie = kunjungiCPU.new Processor();

        // menampilkan isi dari method getCache()
        System.out.printf("Processor Cache= %.1f", tampilkanProcie.getCache());
        System.out.println();

        /*
         * variabel 'tampilkanRAM' akan memanggil class 'ram' yang ada di dalam class
         * 'CPU'.
         * 
         * Tapi, variabel ini memerintahkan si variabel 'kunjungiCPU' karena
         * 'tampilkanRAM' tidak bisa melakukannya tanpa orang dalam . Jadi, variabel
         * 'kunjungiCPU' merupakan orang suruhan dari variabel 'tampilkanRAM'
         */
        CPU.RAM tampilkanRAM = kunjungiCPU.new RAM();

        // menampilkan isi dari method getClockSpeed()
        System.out.printf("Ram Clock Speed = %.1f", tampilkanRAM.getClockSpeed());
    }
}
