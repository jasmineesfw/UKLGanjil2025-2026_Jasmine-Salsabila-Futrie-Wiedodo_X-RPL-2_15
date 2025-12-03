import java.util.Scanner; 
public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Masukkan Mengecek Bilangan Prima Berapa Kali?: ");
        int cekBilangan = input.nextInt();

        for (int j = 1; j <= cekBilangan; j++) {
            System.out.println("Masukkan Bilangan ke-" + j + ": ");
            int masukkanBilangan = input.nextInt();
            
            boolean bilPrima = true;

        if (masukkanBilangan <= 1) {
            bilPrima = false; 
        }
        else {
            for (int i = 2; i <= Math.sqrt(masukkanBilangan); i++) {
                if (masukkanBilangan % i == 0) {
                    bilPrima = false;
                    break;
                }
            }
        }

        if (bilPrima) {
            System.out.println(masukkanBilangan + " adalah Bilangan Prima.");
        }
        else {
            System.out.println(masukkanBilangan + " bukan Bilangan Prima.");
        }
        }
        input.close();
    }
}