import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa (minimal 3): ");
        int jumlah = Integer.parseInt(input.nextLine());

        // Memastikan minimal 3 mahasiswa
        while (jumlah < 3) {
            System.out.println("Jumlah mahasiswa minimal 3!");
            System.out.print("Masukkan jumlah mahasiswa: ");
            jumlah = Integer.parseInt(input.nextLine());
        }

        // Membuat array untuk menyimpan object mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlah];

        // Input data mahasiswa menggunakan loop
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            daftarMahasiswa[i] = new Mahasiswa();

            System.out.print("Nama: ");
            daftarMahasiswa[i].nama = input.nextLine();

            System.out.print("NIM: ");
            daftarMahasiswa[i].nim = input.nextLine();

            System.out.print("Nilai: ");
            daftarMahasiswa[i].nilai =
                Double.parseDouble(input.nextLine());
        }

        // Menampilkan seluruh data mahasiswa
        System.out.println("\n===== HASIL DATA MAHASISWA =====");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
            daftarMahasiswa[i].cekKelulusan();
        }

        input.close();
    }
}
