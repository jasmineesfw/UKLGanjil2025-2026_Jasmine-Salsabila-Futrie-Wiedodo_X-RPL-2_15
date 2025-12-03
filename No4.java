import java.util.Scanner;
public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Elemen Array (pisahkan dengan spasi): ");
        String line = input.nextLine();

        String[] bagian = line.split(" ");
        int[] array = new int[bagian.length];

        for (int i = 0; i < bagian.length; i++) {
            array[i] = Integer.parseInt(bagian[i]);
        }

        boolean found = false;
        boolean[] sudahDicek = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (sudahDicek[i]) continue;

            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    sudahDicek[j] = true;
                }
            }
            if (count > 1) {
                System.out.println("Angka " + array[i] + " duplikat sebanyak " + count + " kali");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Tidak ada elemen yang duplikat dalam array!");
        }
        input.close();
    }
}