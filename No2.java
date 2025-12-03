import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        System.out.print("Masukkan Jumlah Uang: Rp");
        int uang = input.nextInt();

        System.out.println("RINCIAN UANG PECAHAN");
        for (int p : pecahan) {
            int jumlah = uang / p;
            if (jumlah > 0) {
                String satuan = (p >= 1000) ? "Lembar" : "Koin";
                System.out.println(jumlah + " " + satuan + " " + p);
            }
            uang %= p;
        }
        System.out.println("Sisa Uang: " + uang);
        input.close();
        //tambahkan sampai pecahan 500, 100 dengan keterangan koin
    }
}