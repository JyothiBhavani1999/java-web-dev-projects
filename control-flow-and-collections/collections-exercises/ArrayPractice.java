import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,8};
        for(int i: array)
        {
            if(i%2 == 1)
            {
                System.out.println("odd numbers are: "+i);
            }
        }

        String sample = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = sample.split("\\.");
        System.out.println(Arrays.toString(stringArray));

    }
}
