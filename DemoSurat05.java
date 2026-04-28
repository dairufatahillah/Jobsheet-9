import java.util.Scanner;

public class DemoSurat05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat05 stack = new StackSurat05(10);
        int pilih;

        do {
            System.out.println("\n=== Sistem Pengelolaan Surat Izin Prodi ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n--- Masukkan Data Surat ---");
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat05 suratBaru = new Surat05(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    System.out.println("Surat dari " + nama + " berhasil dimasukkan ke tumpukan.");
                    break;

                case 2:
                    Surat05 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("\nSurat teratas berhasil diproses/divalidasi!");
                        System.out.println("Nama: " + diproses.namaMahasiswa + " | Jenis Izin: " + diproses.jenisIzin);
                    }
                    break;

                case 3:
                    Surat05 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("\n--- Surat Teratas Saat Ini ---");
                        System.out.println("ID Surat: " + terakhir.idSurat);
                        System.out.println("Nama    : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas   : " + terakhir.kelas);
                    }
                    break;

                case 4:
                    System.out.print("\nMasukkan Nama Mahasiswa yang dicari: ");
                    String keyword = scan.nextLine();
                    stack.cariSurat(keyword);
                    break;
                
                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilih != 5);
        
        scan.close();
    }
}