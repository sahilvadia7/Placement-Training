package programs.assigments.exams;

import programs.assigments.days.day1.finalll;

public class exceptionHandling {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        try {
            System.out.println(nums[5]);
        } catch (Exception e) {
        System.out.println("Exception :"+e);    
        }
        finally{
            System.out.println("In the finally block");
        }
    }
}
