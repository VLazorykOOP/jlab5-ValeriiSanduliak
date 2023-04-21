import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void task2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Text path: D:\\Education\\2-course\\Java\\jlab5-ValeriiSanduliak\\files\\input.txt");
        System.out.print("Input text file path:");
        String text_filename = in.next();
        File text_file = new File(text_filename);
        while (!text_file.exists()) {
            System.out.print("File not found. Input text file path:");
            text_filename = in.next();
            text_file = new File(text_filename);
        }
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(text_filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
         catch (IOException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        for (Map.Entry<String, Integer> i : wordCount.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
