/* Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false. */
//-------------------------------------------------------------------------------------------------------

//Method 1 - My approach : Direct Brute force 
 class Solution
 {

 
    public int i = 0;
        
    public boolean canJump(int[] nums)
    {
        int jlen = 0;
        
        for( i = 0; i < nums.length; i++)
        {
            while(i < nums.length)
            {
                jlen = nums[i];
                i = i + jlen;
                
            }
            
            
        }
        
        if(i == nums.length - 1) 
        {
            return true;
        }
        else return false;
        
    }
}


//Method 2 - Accepted - more elegant 

class Solution 
{
    public boolean canJump(int[] nums)
    {
         int max = 0;

            for (int i = 0; i < nums.length;i++)
            {
                if (i > max)
                    return false;
                
                max = Math.max(nums[i]+i, max); 
            }
            return true; 
        
    }
}
