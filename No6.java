import java.util.Scanner;
public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN!");
        System.out.println("Daftar Kategori Buku:");
        System.out.println("A - Buku Pelajaran / Referensi");
        System.out.println("B - Novel / Komik");
        System.out.println("C - Majalah / Buku Umum");

        System.out.println("\nMasukkan Nama Peminjam: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Judul Buku: ");
        String judul = input.nextLine();
        
        char kategori;

        while (true) {
            System.out.println("Masukkan Kategori Buku: ");
            kategori = input.next().toUpperCase().charAt(0);

            if (kategori == 'A' || kategori == 'B' || kategori == 'C') {
                break;
            } else {
                System.out.println("Kategori tidak valid! Silahkan masukkan A, B, atau C.");
            }
        }

        System.out.println("Masukkan Lama Peminjaman (hari): ");
        int lama = input.nextInt();

        int tarif = 0;

        switch (kategori) {
            case 'A':
                tarif = 2000;
                break;
            case 'B':
                tarif = 1500;
                break;
            case 'C':
                tarif = 1000;
                break;
            default:
                System.out.println("Kategori Tidak Valid!");
                input.close();
                return;
        }

        int biayaAwal = tarif * lama;

        int denda = 0;
        if (lama > 7) {
            int hariTerlambat = lama - 7;
            denda = hariTerlambat * 500;
        }

        int total = biayaAwal + denda;

        System.out.println("\nRINCIAN PEMINJAMAN");
        System.out.println("Nama Peminjam: " + nama);
        System.out.println("Judul Buku: " + judul);
        System.out.println("Kategori Buku: " + kategori);
        System.out.println("Lama Peminjaman: " + lama + " Hari");
        System.out.println("Biaya Peminjaman Awal: Rp" + biayaAwal);
        System.out.println("Denda Keterlambatan: Rp" + denda);
        System.out.println("Total Biaya Akhir: Rp" + total);

        input.close();
    }
}