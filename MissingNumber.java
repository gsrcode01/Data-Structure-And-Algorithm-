public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int totsum = len*(len+1)/2;
        int sum =0;
        for(int i = 0; i< nums.length; i++){
            sum+=nums[i];
        }
        return totsum - sum;
    }

    //Another Approach
    /*
      public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }

        return xor;
    }*/

}
