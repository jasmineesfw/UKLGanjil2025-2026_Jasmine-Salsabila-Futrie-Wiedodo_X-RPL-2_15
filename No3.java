import java.util.Random;
import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rndm = new Random();

        System.out.println("SELAMAT DATANG DI GAME KUIS!");
        System.out.println("1 - Perkalian");
        System.out.println("2 - Pembagian");
        System.out.println("3 - Modulus (sisa bagi)");

        while (true) {
            System.out.println("Pilih Operator: ");
            int inputOperator = input.nextInt();
            int index = inputOperator - 1;

            int bil1 = rndm.nextInt(10) + 1;
            int bil2 = rndm.nextInt(10) + 1;

            char[] listOperator = {'*', '/', '%'};
            char operator = listOperator[index];

            int jawabanBenar = 0;

            switch (operator) {
                case '*':
                    jawabanBenar = bil1 * bil2;
                    break;
                case '/':
                    jawabanBenar = bil1 / bil2;
                    break;
                case '%':
                    jawabanBenar = bil1 % bil2;
                    break;
            }

            System.out.println(bil1 + " " + operator + " " + bil2 + " = ");

            int jawabanUser = input.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Selamat! Jawaban Anda Benar!");
            }
            else {
                System.out.println("Sayang sekali, Jawaban Anda Salah! Jawaban yang Benar adalah: " + jawabanBenar);
            }

            System.out.print("Apakah Anda Ingin Lanjut Kuisnya? (y/n): ");
            char lanjut = input.next().charAt(0);

            if (lanjut == 'n') {
                System.out.println("\nKuis Selesai. Terimakasih!");
                break;
            }

            System.out.println();
            
        }
        input.close();
    }
}