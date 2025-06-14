import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderBaris {
    public static void main(String[] args) {
        String csvFile = "./data/students-praktikum.csv"; // 
        String line;
        int baris = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            System.out.println("=== Isi students-praktikum.csv ===");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                baris++;
            }

            System.out.println("\nJumlah baris dalam file: " + baris);
        } catch (FileNotFoundException e) {
            System.out.println(" File tidak ditemukan. Pastikan students-praktikum.csv ada di folder 'data'.");
        } catch (IOException e) {
            System.out.println(" Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}