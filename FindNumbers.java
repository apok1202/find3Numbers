import java.util.*;
import java.io.*;
public class FindNumbers {
 
   
    public static List<List<Integer> > findThreeNumbers(int nums[], int sum)
    {
 
        // Sort the elements
        Arrays.sort(nums);
 
        List<List<Integer> > pair = new ArrayList<>();
        TreeSet<String> set = new TreeSet<String>();
        List<Integer> triplets = new ArrayList<>();
 
        for (int i = 0; i < nums.length - 2; i++) {
 
            // index of the first element in the
            // remaining elements
            int j = i + 1;
 
            // index of the last element
            int k = nums.length - 1;
 
            while (j < k) {
 
                if (nums[i] + nums[j] + nums[k] == sum) {
 
                    String str = nums[i] + ":" + nums[j] + ":" + nums[k];
 					// To check for the unique triplet
                    if (!set.contains(str)) {
 
                        
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        pair.add(triplets);
                        triplets = new ArrayList<>();
                        set.add(str);
                    }
 
                    j++; 
                    k--;  
                } else if (nums[i] + nums[j] + nums[k] < sum)
                    j++;
 
                else 
                    k--;
            }
        }
        return pair;
    }
 
    public static void main(String[] args)
    {
        //array to store the values
        int[] nums = {1,2,3,4,5,6,7,8};

        //array to store the sum
        int sum = 12;

        //List to store all the tripets
        List<List<Integer> > triplets = findThreeNumbers(nums, sum);

        //Print the result
        if (!triplets.isEmpty()) {
            System.out.println(triplets);
        } else {
            System.out.println("No triplets can be formed");
        }
    }
}