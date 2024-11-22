import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8};
        for (int i : array) {
            if (i % 2 == 1) {
                System.out.println("odd numbers are: " + i);
            }
        }

        String sample = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = sample.replaceAll(",", "").replaceAll("\\.", "").split(" ");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i + 1);
        }

        System.out.println("Sum of Even numbers of list: " + EvenSum(list));


        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        printFiveLetterWords(stringList);

    }

    static int EvenSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static void printFiveLetterWords(ArrayList<String> list){
        for(String i: list)
        {
            if(i.length() == 5){
                System.out.println("Five leter words: "+ i);
            }
        }
    }
}