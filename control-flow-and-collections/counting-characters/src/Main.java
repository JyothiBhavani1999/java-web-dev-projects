import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> counting = new HashMap<>();

        String name = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";
        char[] charactersOfString = name.toCharArray();
        for(char ch: charactersOfString)
        {
            if(counting.containsKey(ch))
            {
                counting.put(ch,counting.get(ch)+1);
            }

            else {
                counting.put(ch,1);
            }

        }

        for(HashMap.Entry<Character,Integer> entry: counting.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}