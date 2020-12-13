public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second) {
        int num;
        int gcd = 0;
        if (first < 10 || second < 10){
            return -1;
        }
        num = Math.max(first, second);
        for (int i = 1;i < num;i++){
            if (first % i==0 && second % i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}