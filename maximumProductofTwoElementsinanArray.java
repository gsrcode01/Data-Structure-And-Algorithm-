public class maximumProductofTwoElementsinanArray {
    //optimal Approch
    public int maxProduct(int[] nums) {
        int max1=0;
        int max2=0;
        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max2=num;
            }
        }
        return (max1 - 1)*(max2 -1);

    }
    //approch 2-not that much optimal

//    public int maxProduct(int[] nums) {
//        int max = 0;
//        for (int i = 0; i<nums.length; i++){
//            for(int j =i+1; j<nums.length; j++){
//                if (max < (nums[i]-1)*(nums[j]-1)){
//                    max = (nums[i]-1)*(nums[j]-1);
//                }
//            }
//        }
//        return max;
//    }
}
