import java.util.Scanner;

public class Motherboard {
    static class USB {

        int getTotalPorts(int usb_pertama, int usb_kedua) {
            return usb_pertama + usb_kedua;
        }
    }

    public static void main(String[] args) {

        // memanggil fungsi Scanner lewat variabel 'minta_input'
        Scanner minta_input = new Scanner(System.in);

        // memanggil class 'USB' lewat variabel 'tampilkanUSB'
        Motherboard.USB tampilkanUSB = new USB();

        /*
         * memberikan try{}finally{} untuk menutup minta_input, karena tanpa try
         * finally,akan muncul warning resource leak
         */
        try {
            // meminta input angka pertama
            System.out.println("masukkan angka pertama");
            int usb2 = minta_input.nextInt();

            // meminta input pada angka kedua
            System.out.println("masukkan angka kedua");
            int usb3 = minta_input.nextInt();

            /*
             * karena method/fungsi getTotalPorts() hanya return/mengembalikan hasil
             * penjumlahan tanpa ditampilkan/di print/di cetak, maka kita bantu dengan
             * memanggil method tersebut di dalam println (printf juga bisa)
             */
            System.out.println("Total Ports= " + tampilkanUSB.getTotalPorts(usb2, usb3));
        } finally {
            minta_input.close();
        }

    }
}
