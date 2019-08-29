package day02;

public class array3 {
    public static void main(String[]args){
       int[] nums = {0,3,4,5,7,2,6,9,8,7,1};

       for (int i= 0; i < nums.length; i++){
          if(nums [i] % 2 ==0){
              System.out.println(nums[i]+ " is genap ");
              continue;
          }
       }
    }
}
