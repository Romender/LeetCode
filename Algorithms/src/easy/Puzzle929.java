package easy;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * If you add periods ('.') between some characters in the local name part of an email address,
 * mail sent there will be forwarded to the same address without dots in the local name.
 *
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 *
 * (Note that this rule does not apply for domain names.)
 *
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.
 *  (Again, this rule does not apply for domain names.)
 *  It is possible to use both of these rules at the same time.
 *
 *  Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 *
 *  Example 1:
 *
 *  Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 *
 *  Output: 2
 *
 *  Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 *
 *  Note:
 *  1 <= emails[i].length <= 100
 *  1 <= emails.length <= 100
 *  Each emails[i] contains exactly one '@' character.
 */
public class Puzzle929 {

    /**
     *
     * @param emails array of emails id.
     * @return int distinct email id's
     *
     * Runtime: 32 ms, faster than 64.67% of Java online submissions for Unique Email Addresses.
     * Memory Usage: 28.7 MB, less than 37.62% of Java online submissions for Unique Email Addresses.

     */
    public int numUniqueEmails(String[] emails) {
        Set<String> emailList = new HashSet<>();
        for(String email : emails) {
            String domain = email.substring(email.indexOf('@'),email.length());
            String name = email.substring(0,email.indexOf('@'));
            if(name.indexOf('+') > -1) {
                name = name.substring(0,name.indexOf('+'));
            }
            name = name.replaceAll("\\.","");
            emailList.add(name+domain);
        }
        return emailList.size();
    }

    public static void main(String args[]) {
        Puzzle929 puzzle = new Puzzle929();
        String [] emails = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(puzzle.numUniqueEmails(emails));
    }
}
