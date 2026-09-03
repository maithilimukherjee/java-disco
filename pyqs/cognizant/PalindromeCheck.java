import java.util.Scanner;
import java.util.Vector;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        String s = sc.nextLine();
        boolean result = isPalindrome(s);
        System.out.println(result);

        sc.close();
    }

    public static boolean isPalindrome(String s) {
        // TODO: Implement two-pointer check ignoring non-alphanumeric chars

        Vector<Character> word = new Vector<>();

        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                if(Character.isLetter(s.charAt(i)))
                    word.add(Character.toLowerCase(s.charAt(i)));

                else
                    word.add(s.charAt(i));
            }
        }
                

        int left = 0;
        int right = word.size()-1;

        while(left<=right)
        {
            if(word.get(left)!=word.get(right))
                return false;

            left++;
            right--;
        }
        
        return true;
    }
}