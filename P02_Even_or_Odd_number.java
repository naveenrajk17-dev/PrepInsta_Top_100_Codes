public class P02_Even_or_Odd_number {
    public static void main(String[] args) {
        int num=98;
        System.out.println(Even_or_Odd(num));
        if(Even_or_Odd(num)){
            System.out.println(num +" is even");
        }
        else{
            System.out.println(num +" is odd");
        }
    }
    public static boolean Even_or_Odd(int num){
        return (num & 1)==0;
    }
}
