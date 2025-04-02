public class P01_Number_is_Positive_or_Negative {
    public static void main(String[] args) {
        positive_or_negetive(-55);
    }
     static void positive_or_negetive(int num){
        if(num==0){
            System.out.println("the given number zero");
        }
        else{
            String result=num>0? "the number is positive":"the number is negitive";
            System.out.println(result);
        }
    }
}
