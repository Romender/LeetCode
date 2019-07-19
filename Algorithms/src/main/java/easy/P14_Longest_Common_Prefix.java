package easy;

public class P14_Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String temp = "";
        if(strs[0].length()==1)
            return checkPrefix(strs,strs[0])?strs[0] :"";
        for(int i = strs[0].length()-1 ;i >= 0; i-- ) {
            String prefix = strs[0].substring(i);
            if(!checkPrefix(strs, prefix))
                return temp;
            else
                temp = prefix;
        }
        return temp;
    }

    boolean checkPrefix(String[] args, String prefix) {
        for (int i =1 ; i < args.length ; i++) {
            if(!args[i].startsWith(prefix))
                return false;
        }
        return true;
    }
}
