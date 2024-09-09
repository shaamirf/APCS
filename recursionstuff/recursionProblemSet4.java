package recursionstuff;

public class recursionProblemSet4 {
    public static void main(String[] args){
        int[]nums = {3,3,5,5};

        System.out.println(groupSum(0,nums,16));
        System.out.println(split53(nums));
        System.out.println(splitArray(nums));
    }
//1
    public static boolean groupSum(int start, int[]nums, int target){
        if(target==0) return true;
        if(nums.length>start && groupSum(start+1,nums,target-nums[start]))
            return true;
        else if(nums.length>start && groupSum(start+1,nums,target))
            return true;
        else return false;
    }
//2
    public static boolean splitArray(int[] nums) {
        return sum(0,nums,0,0);
    }
    public static boolean sum(int start,int[] nums,int sum1,int sum2) {
        if(start >= nums.length) return sum1==sum2;
        return sum(start+1,nums,sum1+nums[start],sum2) || sum(start+1,nums,sum1,sum2+nums[start]);
    }
//3
    public static boolean split53(int[]nums){
        return sum53(0,nums,0,0);
    }
    public static boolean sum53(int start,int[] nums,int sum1,int sum2) {
        if(start >= nums.length) return sum1==sum2;
        if(nums[start]%5==0)
            return sum53(start+1,nums,sum1+nums[start],sum2);
        else if(nums[start]%3==0)
            return sum53(start+1,nums,sum1,sum2+nums[start]);
        return sum53(start+1,nums,sum1+nums[start],sum2) || sum53(start+1,nums,sum1,sum2+nums[start]);
    }
}
