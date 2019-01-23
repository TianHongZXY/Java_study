package hello;

public class twoSum {

	public int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		int i;
        int j;
        int[] result = new int[2];
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<i+1;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                	result[0] = i;
                	result[1] = j;
                }
            }
        }
		return result;
	}
}

