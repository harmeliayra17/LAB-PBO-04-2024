import java.util.Scanner;

public class TP1_5_H071231079 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = input.nextInt();
            
            boolean ditemukan = false;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) {
                    break;
                }
            }
            
            if (!ditemukan) {
                System.out.println("Angka " + target + " tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
        } finally {
            input.close();
        }
    }
}
