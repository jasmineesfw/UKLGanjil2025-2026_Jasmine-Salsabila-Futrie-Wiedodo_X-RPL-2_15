import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rndm = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.println("PERMAINAN LEMPAR DADU");
        System.out.println("Tekan enter untuk melempar dadu");
        System.out.println("Permainan berhenti jika ada yang mencapai 5 kemenangan.\n");

        while (menangKomputer < 5 && menangPemain < 5) {
            System.out.println("Tekan enter untuk melempar dadu...");
            input.nextLine();

            int daduKomputer = rndm.nextInt(6) + 1;
            int daduPemain = rndm.nextInt(6) + 1;

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("\nHasil Ronde");
            System.out.println("Dadu Komputer: " + daduKomputer);
            System.out.println("Dadu Pemain: " + daduPemain);

            if (daduPemain > daduKomputer) {
                System.out.println("Pemain Menang di Ronde Ini!");
                menangPemain++;
            } else if (daduPemain < daduKomputer) {
                System.out.println("Komputer Menang di Ronde Ini!");
                menangKomputer++;
            } else {
                System.out.println("Ronde Ini Seri!");
            }
            System.out.println("Skor Sementara -> Pemain: " + menangPemain + " | Komputer: " + menangKomputer + "\n");
        }

        System.out.println("PERMAINAN SELESAI");
        if (menangPemain == 5) {
            System.out.println("Pemenang adalah: PEMAIN!!");
        } else {
            System.out.println("Pemenang adalah: KOMPUTER!!");
        }

        System.out.println("\nREKAP SEMUA LEMPARAN");
        System.out.println("Riwayat Lemparan Pemain: " + riwayatPemain);
        System.out.println("Riwayat Lemparan Komputer: " + riwayatKomputer);

        System.out.println("\nTOTAL KEMENANGAN");
        System.out.println("Pemain: " + menangPemain);
        System.out.println("Komputer: " + menangKomputer);

        input.close();
    }
}