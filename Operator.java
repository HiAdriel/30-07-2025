import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan 1: ");
        int bil1 = input.nextInt();
        System.out.println("Masukkan bilangan 2: ");
        int bil2 = input.nextInt();

        int jumlah = bil1 + bil2;
        int kurang = bil1 - bil2;
        int kali = bil1 * bil2;
        int bagi = bil1 / bil2;
        int sisa = bil1 % bil2;

        System.out.println("Hasil Penjumlahan: " + jumlah);
        System.out.println("Hasil Pengurangan: " + kurang);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.println("Hasil Pembagian: " + bagi);
        System.out.println("Sisa Pembagian: " + sisa);

        input.close();
    }
}
