import java.util.ArrayList;
import java.util.Scanner;
public class No7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> produksi = new ArrayList<>();
        ArrayList<Integer> jual = new ArrayList<>();
        ArrayList<Integer> terjual = new ArrayList<>();
        ArrayList<Integer> totalBiaya = new ArrayList<>();
        ArrayList<Integer> totalPendapatan = new ArrayList<>();
        ArrayList<Integer> labaRugi = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        System.out.println("Masukkan Jumlah Jenis Cookies: ");
        int n = input.nextInt();
        input.nextLine();

        int totalKeseluruhan = 0;
        int maxLaba = Integer.MIN_VALUE;
        String cookiesMaxLaba = "";

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Cookies ke-" + (i + 1) + ": ");

            System.out.println("Nama Cookies: ");
            nama.add(input.nextLine());
            System.out.println("Harga Produksi /bungkus: ");
            produksi.add(input.nextInt());
            System.out.println("Harga Jual /bungkus: ");
            jual.add(input.nextInt());
            System.out.println("Jumlah Terjual: ");
            terjual.add(input.nextInt());
            input.nextLine();

            int biaya = produksi.get(i) * terjual.get(i);
            totalBiaya.add(biaya);

            int pendapatan = jual.get(i) * terjual.get(i);
            totalPendapatan.add(pendapatan);

            int lr = pendapatan - biaya;
            labaRugi.add(lr);

            totalKeseluruhan += lr;

            if (lr > 0) status.add("Laba");
            else if (lr < 0) status.add("Rugi");
            else status.add("Impas");

            if (lr > maxLaba) {
                maxLaba = lr;
                cookiesMaxLaba = nama.get(i);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-16s | Rp%-10d | Rp%-14d | Rp%-7d | %s\n", nama.get(i), totalBiaya.get(i), totalPendapatan.get(i), labaRugi.get(i), status.get(i));
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalKeseluruhan);
        System.out.println("Cookies dengan Laba Tertinggi: " + cookiesMaxLaba + " (Rp" + maxLaba + ")");
        input.close();
    }
}