/*Provide an array of n-1 integers in the range of 1 to n with no duplicates in list, One of the integers is missing in the list. Write a code to find the missing integer.
        Examples:
        Input : arr[] = [1, 2, 3, 5, 6, 7, 8]

        Output : 4



        Input : arr[] = [1, 2, 4, 5, 6, 7, 8, 9]

        Output : 3
*/

public class Solution{

    public int binarySearch(int[] nums){
        int start = 0;
        int end = nums.length;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==mid+1){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
    }
}