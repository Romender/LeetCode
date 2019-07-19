package easy;

public class P125_ValidPalidrome {

    public boolean isPalindrome(String s) {
        if (s.trim().isEmpty())
            return true;
        char [] array = s.trim().toCharArray();
        int x = 0, y = s.length() - 1;
        int i = -1, j = -1;
        while (x < y) {
            i = i == -1 ? getCharValue(array[x]) : i;
            j = j == -1 ? getCharValue(array[y]) : j;
            if(i == j) {
                x++;
                y--;
                i = -1;
                j = -1;
            } else if(i == -1) {
                x++;
            } else if(j == -1) {
                y--;
            } else {
                return false;
            }
        }
        return true;
    }

        private int getCharValue(char l) {
            if(l <= 122 && l>= 97) {
                return (122 - l);
            } else if (l<=90 && l>=65){
                return (90-l);
            } else if(l >= 48 && l <= 57) {
                return l;
            } else
                return -1;
        }

}
