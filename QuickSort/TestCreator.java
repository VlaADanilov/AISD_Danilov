import java.io.*;

public class TestCreator {
    public static void main(String[] args) throws IOException {
        createFiles();
        doingNumbersInTests();
    }

    public static void doingNumbersInTests() throws IOException {
        int i = 1;
        OutputStream outputStream;
        File file;
        for (int x = 0; x < 100; x++, i++){
            file = new File("C:\\Users\\User\\IdeaProjects\\DanilovControl\\Tests\\" + x +".txt");
            outputStream = new FileOutputStream(file);
            String str;
            for (int p = 0; p < i * 100; p++){
                str = ((int) (Math.random() * 10_000) - 5000) + (p + 1 == i * 100 ? "" : "\n");
                outputStream.write(str.getBytes());
            }
            outputStream.close();
        }
    }

    public static void createFiles() throws IOException {
        File file;
        for(int i = 0; i < 100; i++){
            file = new File("C:\\Users\\User\\IdeaProjects\\DanilovControl\\Tests\\" + i +".txt");
            System.out.println(file.createNewFile());
        }
    }
}
