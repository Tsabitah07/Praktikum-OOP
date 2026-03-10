package edu.pradita.oop.session03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * TUGAS 000 – Peringkat Peserta Lomba Lari
 *
 * Cerita:
 * - Input: waktu tempuh dalam detik (double)
 * - Output: kategori:
 *   - <  12  → "Kategori Lari Cepat"
 *   - 12–20 → "Kategori Lari Menengah"
 *   - > 20  → "Kategori Lari Jarak Jauh"
 * - Jika waktu negatif → pesan error
 *
 * TODO:
 * 1. Implementasikan getRank(double timeInSeconds)
 * 2. Tangani input di main() (Scanner, try–catch)
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== TUGAS 000: Peringkat Lomba Lari ===");
        System.out.print("Masukkan waktu tempuh peserta (dalam detik): ");

        try {
            double time = scanner.nextDouble();

            String rank = getRank(time);
            System.out.println("Peringkat peserta: " + rank);

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan angka (misalnya: 15.5).");
        }

        scanner.close();
    }

    /**
     * TODO: Implementasikan logika if-else di sini.
     *
     * Aturan:
     * - Jika time < 0 → return "Waktu tidak boleh negatif"
     * - Jika time < 12 → return "Kategori Lari Cepat"
     * - Jika time >= 12 dan time <= 20 → return "Kategori Lari Menengah"
     * - Jika time > 20 → return "Kategori Lari Jarak Jauh"
     */
    public static String getRank(double timeInSeconds) {
        // TODO: Lengkapi menggunakan if / else if / else
        if (timeInSeconds < 0) {
            return "Waktu tidak boleh negatif";
        } else if (timeInSeconds < 12) {
            return "Kategori Lari Cepat";
        } else if (timeInSeconds <= 20) {
            return "Kategori Lari Menengah";
        } else {
            return "Kategori Lari Jarak Jauh";
        }
    }
}
