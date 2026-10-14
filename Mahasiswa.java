public class Mahasiswa {
    // Atribut mahasiswa
    String nama;
    String nim;
    double nilai;

    // Method untuk menampilkan data mahasiswa
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    // Method untuk memeriksa kelulusan mahasiswa
    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}
