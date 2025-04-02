public class P03_Sum_of_First_N_Natural_numbers {
    public static void main(String[] args) {
        int num=3;
        int sum=totalsum(num);
        System.out.println(sum);
    }
    static int totalsum(int num){
        if(num==0){
            return 0;
        }
        return (num + totalsum(num-1));
    }
}
