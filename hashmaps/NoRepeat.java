package hashmaps;
import java.util.*;

public class NoRepeat {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char x:str.toCharArray())
        {
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);

            else
                map.put(x,1);
        }
    }
    
}
