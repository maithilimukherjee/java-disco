package hashmaps;
import java.util.*;

public class CharFreq {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x: str.toCharArray())
        {
            if(map.containsKey(x))
            {
                map.put(x, map.get(x) + 1);
            }

            else
            {
                map.put(x,1);
            }
        }

        System.out.println("frequency of each character in the string is: ");

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }   
}
