class arrpro {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        result[0] = 1;

        // store product of all elements to the left
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int right = 1;

        // multiply by product of all elements to the right
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        arrpro obj = new arrpro();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}