import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiUjianStack stack = new NilaiUjianStack();

        int pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Tampilkan Total & Rata-rata");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai ujian: ");
                    int nilai = scanner.nextInt();
                    stack.push(nilai);
                    System.out.println("Nilai berhasil ditambahkan!");
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack kosong, tidak bisa pop!");
                    } else {
                        NilaiUjianStack tempStack = new NilaiUjianStack();
                        
                        System.out.print("Nilai di stack: ");
                        // Pop semua nilai
                        while (!stack.isEmpty()) {
                            int poppedValue = stack.pop();
                            tempStack.push(poppedValue);
                            System.out.print(poppedValue + " ");
                        }
                        
                        // Kembalikan semua nilai
                        while (!tempStack.isEmpty()) {
                            int restoredValue = tempStack.pop();
                            stack.push(restoredValue);
                        }
                        System.out.println();
                    }
                    break;
                
                case 3:
                    System.out.println("Total = " + stack.hitungTotal());
                    System.out.printf("Rata-rata = %.2f\n", stack.hitungRataRata());
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
            }
        } while (pilihan != 3);
        scanner.close();
    }
}
