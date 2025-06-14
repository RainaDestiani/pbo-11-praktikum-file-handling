import java.io.*;
import java.util.Scanner;

public class CSVWriterPraktikum {
    public static void main(String[] args) {
        String csvFile = "./data/students-praktikum.csv";
        Scanner scanner = new Scanner(System.in);

        File folder = new File("./data");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        System.out.println("=== Input Data Mahasiswa ke CSV ===");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write("NIM,NAMA,UMUR,PRODI");
            bw.newLine();

            System.out.print("Masukkan jumlah data: ");
            int jumlah = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= jumlah; i++) {
                System.out.println("\nData ke-" + i);
                System.out.print("NIM: ");
                String nim = scanner.nextLine();

                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                System.out.print("Umur: ");
                String umur = scanner.nextLine();

                System.out.print("Prodi: ");
                String prodi = scanner.nextLine();

                String data = nim + "," + nama + "," + umur + "," + prodi;
                bw.write(data);
                bw.newLine();
            }

            System.out.println("\n Data berhasil ditulis ke: " + csvFile);

        } catch (IOException e) {
            System.out.println(" Gagal menulis file: " + e.getMessage());
        }
        scanner.close();
    }
}
