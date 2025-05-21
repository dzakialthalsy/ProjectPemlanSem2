package TugasAkhir;

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
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai ujian: ");
                    int nilai = scanner.nextInt();
                    stack.push(nilai);
                    System.out.println("Nilai berhasil ditambahkan!");
                    break;

                case 2:
                    stack.tampilkanNilai();
                    System.out.println("Total = " + stack.hitungTotal());
                    System.out.printf("Rata-rata = %.2f\n", stack.hitungRataRata());
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
