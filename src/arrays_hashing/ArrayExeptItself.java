package src.arrays_hashing;

public class ArrayExeptItself {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeros=0;
        for (int i = 0; i < nums.length; i++)
            if(prod*nums[i]!=0)prod*=nums[i];
            else zeros++;

        if(zeros>1)return new int[nums.length];
        if (zeros==1)
            for (int i = 0; i < nums.length; i++)
                if(nums[i]!=0)nums[i]=0;
                else nums[i]=prod;
        else
            for (int i = 0; i < nums.length; i++) nums[i]=prod/nums[i];

        return nums;
    }
}
