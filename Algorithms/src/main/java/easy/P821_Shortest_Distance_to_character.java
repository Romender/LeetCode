package easy;

public class P821_Shortest_Distance_to_character {

    public int[] shortestToChar(String S, char C) {
        int [] result = new int[S.length()];
        int x, y, index = S.lastIndexOf(C);
        for( x =0, y=0; x < S.length() && y <S.length(); x++) {
            if(C == S.charAt(x)) {
                while(y <=x ) {
                    result[y] = Math.min(Math.abs(y-index),Math.abs(y-x));
                    y++;
                }
                index = x;
            }
        }
        while(y < x) {
            result[y] = Math.abs(y-index);
            y++;
        }
        return result;
    }
}
