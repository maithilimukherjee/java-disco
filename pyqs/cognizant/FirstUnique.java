import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        String s = sc.next();
        int result = firstUniqChar(s);
        System.out.println(result);

        sc.close();
    }

    public static int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char x : s.toCharArray())
        {
            if(!map.containsKey(x))
            {
                map.put(x,1);
            }

            else
            map.put(x, map.get(x)+1);
        }

        char letter='\u0000';

        for(Map.Entry<Character, Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                letter = entry.getKey();
                break;
            }
        }

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==letter)
            return i;
        }
        
        return -1;
    }
}