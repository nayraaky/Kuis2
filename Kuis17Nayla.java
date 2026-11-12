import java.util.Scanner;

public class Kuis17Nayla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = -1;
        int porsiTerbanyak = 0;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();
        jumlahTransaksi++;

        while (porsi != 0) {
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
            int biaya = 15000 + (porsi - 1) * 12000;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);

            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            jumlahTransaksi++;

            if (porsi < 1 || porsi > 10) {
                System.out.println("Input tidak valid");
            } else if (porsi > porsiTerbanyak) {
                porsiTerbanyak = porsi;
            }
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Porsi terbanyak  : " + porsiTerbanyak);
    }
}