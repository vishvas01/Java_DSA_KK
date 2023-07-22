package advance_java;
import java.io.*;

class assignment {
    public static void main(String[] args) {
        // Input file path and name
        String inputFile = "input.txt";
        // Output file path and name
        String outputFile = "output.txt";

        try {
            // Create FileInputStream to read from input file
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            // Wrap FileInputStream with BufferedInputStream for buffering
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Create FileOutputStream to write to output file
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            // Wrap FileOutputStream with BufferedOutputStream for buffering
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            // Read data from BufferedInputStream into buffer
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                // Write data from buffer to BufferedOutputStream
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }

            // // Flush any remaining data in the BufferedOutputStream
            // bufferedOutputStream.flush();

            // // Close the BufferedInputStream and BufferedOutputStream
            // bufferedInputStream.close();
            // bufferedOutputStream.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

