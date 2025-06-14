import java.io.*;

public class CSVCloner {
    public static void main(String[] args) {
        String sumber = "./data/test.csv";             
        String tujuan = "./data/test-copy.csv";        

        File folder = new File("./data");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        try (
            BufferedReader br = new BufferedReader(new FileReader(sumber));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tujuan))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println(" File berhasil disalin ke: " + tujuan);
        } catch (FileNotFoundException e) {
            System.out.println(" File sumber tidak ditemukan: " + sumber);
        } catch (IOException e) {
            System.out.println(" Terjadi kesalahan saat menyalin file: " + e.getMessage());
        }
    }
}
