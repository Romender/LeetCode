package medium;

import java.util.ArrayList;
import java.util.List;

public class P93_Resotre_IP_Address {

    public List<String> restoreIpAddresses(String s) {
        List<String> ipAddress = new ArrayList<>();
        resolveIP("", s, ipAddress);
        return ipAddress;
    }

   private void resolveIP(String current, String pending, List<String> ipAddress) {
        System.out.println("current :" +current +"-->"+pending);
        int pos = current.indexOf('.') != -1 ? current.split("\\.").length : 0;
        if (pos < 4 && pending.length() / (4-pos) <=3) {
            for(int i = 1; i <4 ;i ++) {
                if (pending.length() >= i && isValid(pending.substring(0,i))) {
                    resolveIP(current+pending.substring(0,i)+(pending.substring(i,pending.length()).isEmpty()?"":"."),pending.substring(i,pending.length()),ipAddress);
                }
            }
        } else if(pending.isEmpty())
            ipAddress.add(current);
   }

   private boolean isValid(String num) {
        if(num.startsWith("0") && num.length() >=2)
            return false;
        else if(Integer.parseInt(num) <=255)
            return true;
        return false;
   }

}
