package Hackerrank;

/*
Calculate super digit( a single digit) given a string and k
I.E
    9875, 4 would mean that 9875 is concatenated 4 times
    9875987598759875
    initial processing of the digits is adding them so 9+8+7+5.....
    which would become 116 recursively solve until we have a single digit
 */
public class superDigit {

    public static void main(String[] args){
        System.out.println(super_Digit("9875",4));
    }
    public static int super_Digit(String n, int k) {
        if(n.length() == 1){
            return Integer.valueOf(n);
        }
        //Add
        //Using long in case the number is to big for int
        long num = 0;
        for(int i = 0; i < n.length(); i++){
            num += (n.charAt(i) - '0');
        }
        if(k != 0){
            num *= k;
        }
        return super_Digit(Long.toString(num), 0);
    }

}
