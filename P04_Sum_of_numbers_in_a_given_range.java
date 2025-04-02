public class P04_Sum_of_numbers_in_a_given_range {
    public static void main (String[]args)
    {
        int num1 = 2;
        int num2 = 5;
        int sum = num2*(num2+1)/2 - num1*(num1-1)/2;
        System.out.println("The Sum is "+ sum);
//        System.out.println ("The sum is : " + getSum (num1,num2));
    }


//   static int getSum (int i, int b)
//   {
//       // stop when any recursion call tries to go over b (larger number)
//     if (i > b)
//           return 0;
//     return i + getSum(i + 1, b);
//   }
}
