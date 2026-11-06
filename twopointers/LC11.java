package twopointers;

public class LC11 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int result = sol.maxArea(arr);
        System.out.println(result); // Output: 49
    }
    
}

class Solution {
    public int maxArea(int[] arr) {

        int maxarea = 0;
        int area = 0;

        int left = 0;
        int right = arr.length-1;

        while(left<right)
        {
            area = Math.min(arr[left],arr[right])*(right-left);

            maxarea = Math.max(area,maxarea);

            if(arr[left]<arr[right])
            left++;

            else
            right--;
        }

        return maxarea;
        
    }
}