package easy;

public class P7_Reverse_Integer {

    public int reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative)
            x = x*-1;
        int result = 0;
        while(x>0) {
            if(Integer.MAX_VALUE/(result > 0?result :1)  < 10)
                return 0;
            result = (result*10)+ x%10;
            x/= 10;

        }
        return isNegative? -1*result:result;
    }
}


