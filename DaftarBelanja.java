public class DaftarBelanja {
    public static void main(String[] args) {
        System.out.println("=== Daftar Belanja ===");

        System.out.println("Nama Barang 1: Pop Mie cup Korean Spicy Ramyeon");
        double hargaBarang1 = 2 * 5000;
        System.out.println("Harga Barang 1: Rp " + hargaBarang1);

        System.out.println("Nama Barang 2: Indomie Premium Tori Miso");
        double hargaBarang2 = 2 * 5000;
        System.out.println("Harga Barang 2: Rp " + hargaBarang2);

        System.out.println("Nama Barang 3: Indomie Premium Fiery Chicken");
        double hargaBarang3 = 4 * 5000;
        System.out.println("Harga Barang 3: Rp " + hargaBarang3);

        System.out.println("Nama Barang 4: Sprite 250 ml");
        double hargaBarang4 = 3000;
        System.out.println("Harga Barang 4: Rp " + hargaBarang4);

        System.out.println("Nama Barang 5: Teh Kotak 250 ml");
        double hargaBarang5 = 3000;
        System.out.println("Harga Barang 5: Rp " + hargaBarang5);
        double total = hargaBarang1 + hargaBarang2 + hargaBarang3 + hargaBarang4 + hargaBarang5;

        System.out.println("Total Belanja: Rp " + total);
        System.out.println("=== Akhir Daftar Belanja ===");

    }
}
