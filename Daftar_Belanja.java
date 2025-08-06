import java.util.Scanner;

public class Daftar_Belanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta nama barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        // Meminta harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        // Menampilkan informasi barang
        System.out.println("\nInformasi Barang:");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: Rp " + hargaBarang);

        input.close();
    }
}
