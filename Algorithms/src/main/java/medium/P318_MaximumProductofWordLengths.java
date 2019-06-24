package medium;

public class P318_MaximumProductofWordLengths {

    public int maxProduct(String[] words) {
        int[] value = new int [words.length];
        for(int j =0 ;j <words.length; j++) {
            for (int i =0 ;i < words[j].length(); i++)
                value[j] |= 1 << (words[j].charAt(i) - 'a');
        }
        int maxProduct = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i+1 ;j < words.length; j++) {
                if((value[i] & value[j]) ==0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        return maxProduct;
    }

    private boolean isWordsHasDifferentCharacters(String word1, String word2) {
        boolean[] wordMap = new boolean[26];
        for(int i =0 ;i <word1.length(); i++) {
            wordMap[((int)word1.charAt(i))-97] = true;
        }
        for(int i=0; i<word2.length(); i++) {
            if(wordMap[((int)word2.charAt(i))-97])
                return false;
        }
        return true;
    }
}
