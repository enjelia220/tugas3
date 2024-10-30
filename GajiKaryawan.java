import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        String nama = inputNama(input);
        double gajiPokok = inputGaji(input, "Gaji Pokok");
        double tunjangan = inputGaji(input, "Tunjangan");
        double potongan = inputGaji(input, "Potongan");

        // Perhitungan gaji bersih
        double gajiBersih = hitungGajiBersih(gajiPokok, tunjangan, potongan);

        // Output hasil
        cetakSlipGaji(nama, gajiPokok, tunjangan, potongan, gajiBersih);

        input.close();
    }

    // Method untuk input nama karyawan
    private static String inputNama(Scanner input) {
        System.out.print("Masukkan Nama Karyawan: ");
        return input.nextLine();
    }

    // Method untuk input gaji
    private static double inputGaji(Scanner input, String jenisGaji) {
        System.out.print("Masukkan " + jenisGaji + ": ");
        return input.nextDouble();
    }

    // Method untuk menghitung gaji bersih
    private static double hitungGajiBersih(double gajiPokok, double tunjangan, double potongan) {
        return gajiPokok + tunjangan - potongan;
    }

    // Method untuk mencetak slip gaji
    private static void cetakSlipGaji(String nama, double gajiPokok, double tunjangan, double potongan, double gajiBersih) {
        System.out.println("\n--- Slip Gaji Karyawan ---");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Potongan: Rp " + potongan);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
