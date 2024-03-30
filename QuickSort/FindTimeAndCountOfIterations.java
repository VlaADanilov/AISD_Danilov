import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindTimeAndCountOfIterations {

    public static void main(String[] args) throws FileNotFoundException {
        File file;
        Scanner sc;
        int[] array;
        for (int i = 0; i < 100; i++){
            file = new File("C:\\Users\\User\\IdeaProjects\\DanilovControl\\Tests\\" + i +".txt");
            sc = new Scanner(file);
            array = new int[(i+1) * 100];
            for (int j = 0; j < array.length; j++){
                array[j] = Integer.parseInt(sc.nextLine());
            }
            System.out.print("Test" + i);
            RelazationFORCOUNT.quickSort(array);
        }
    }
}
