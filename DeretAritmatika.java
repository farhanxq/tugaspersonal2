import java.util.Scanner;

public class DeretAritmatika {
    public static void main(String[] args) {
        System.out.println("Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial");

        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk menginput banyak angka
        System.out.print("Masukkan banyak angka (2-10): ");
        int banyakAngka = scanner.nextInt();

        // Validasi banyak angka
        if (banyakAngka < 2 || banyakAngka > 10) {
            System.out.println("Banyak angka tidak valid.");
            return;
        }

        // Meminta user untuk menginput beda masing-masing angka
        System.out.print("Masukkan beda masing-masing angka (2-9): ");
        int beda = scanner.nextInt();

        // Validasi beda
        if (beda < 2 || beda > 9) {
            System.out.println("Beda tidak valid.");
            return;
        }

        // Menampilkan deret Aritmatika
        System.out.println("Deret Aritmatika:");
        int aritmatika = 1;
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print(aritmatika + " ");
            aritmatika += beda;
        }
        System.out.println();

        // Menampilkan deret Geometri
        System.out.println("Deret Geometri:");
        int geometri = 1;
        for (int i = 0; i < banyakAngka; i++) {
            System.out.print(geometri + " ");
            geometri *= beda;
        }
        System.out.println();

        // Menghitung Faktorial
        System.out.print("Faktorial: ");
        int faktorial = banyakAngka;
        for (int i = banyakAngka - 1; i > 0; i--) {
            faktorial *= i;
        }
        System.out.println(faktorial);

        // Meminta inputan user untuk mengulang perhitungan
        System.out.print("Apakah Anda mau ulang (Y/T)? ");
        String ulang = scanner.next();

        if (ulang.equalsIgnoreCase("Y")) {
            // Jika user memilih 'Y', program akan berulang
            main(args);
        } else {
            // Jika user memilih 'T', program akan berakhir
            System.out.println("Terima kasih!");
        }

        scanner.close();
    }
}