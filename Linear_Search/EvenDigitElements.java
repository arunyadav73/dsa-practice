/*
Given an array nums of integers, return how many of them contain an even number of digits.
Example:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/

class EvenDigitElements
{
    // function to count even digit numbers in an array
    static int evenDigitElements(int[] nums)
    {
        int count=0;
        int digit=1;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            digit=1;
            while(n/10 != 0)
            {
                digit++;
                n=n/10;  
            }
            
            if(digit % 2==0)
            {
                count++;
                //System.out.println(count);
            }
        }
        return count;
    }

    // function to count even digit numbers in an array
    static int evenDigit(int[] nums)
    {
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            String s=nums[i]+"";
            if(nums[i]<0)
            {
                s=(nums[i]*-1)+"";
            }
            
            if(s.length() % 2==0)
            {
                count++;
            }
        }
        return count;
        
    }

    // function to count even digit numbers in an array
    static int findNumbers(int[] nums)
    {
        int count=0;
        for(int n:nums)
        {
            if(n<0){
                n=n*-1;
            }
            if(((int)Math.log10(n)+1)%2==0)
            {
                count++;
            }
        }
        return count;
    }

    // function to count even digit numbers in an array
    static int findNumbers2(int[] nums)
    {
        int count=0;
        for(int n:nums)
        {
            if(n<0){
                n=n*-1;
            }
            if((int)Math.log10(n)%2==1)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] ar)
    {
        int[] nums ={0,1,22,555,1,457855,44,3366,88,22222,6,883344,-99};
        System.out.println(evenDigitElements(nums));
        System.out.println(evenDigit(nums));
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers2(nums));
    }
}