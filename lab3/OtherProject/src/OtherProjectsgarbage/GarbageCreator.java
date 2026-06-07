package OtherProjectsgarbage;

import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        String filename = "test.exe"; // Thay bằng đường dẫn tệp tin lớn của bạn
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();
    
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b; // Tạo ra rất nhiều "rác" trong bộ nhớ
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}