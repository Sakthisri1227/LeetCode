class Solution {
    public void sortColors(int[] nums) 
    {
        int zc=0;
        int one=0;
        int two=0;
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) zc++;
            if(nums[i]==1) one++;
            if(nums[i]==2) two++;
        }

        for(int i=0;i<zc;i++)
        {
            nums[i]=0;

        }
        for(int i=zc;i<zc+one;i++)
        {
            nums[i]=1;
            ind=i;
        }
         for(int i=zc+one;i<nums.length;i++)
        {
            nums[i]=2;
        }
        System.out.print(Arrays.toString(nums));
    }
}
