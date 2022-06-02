import java.util.Arrays;

public class Contains_Duplicate {
    static boolean find(int[] nums){
        // naive approach yet (easy)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int n = i+1; n < nums.length; n++) {
        //         if (nums[n] == nums[i]) {
        //             return true;                
        //         }
        //     }
                     
        // }
        // return false;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        
        int[] nums = {2,14,18,22,22};
                    //0,1 ,2 ,3 ,4 

        boolean res = find(nums);

        System.out.println(res);
    }
}
