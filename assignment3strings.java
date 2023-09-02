


import java.util.Arrays;
import java.util.*;
public class assignment3strings {
    public static void main(String[] args) {
        //   String str = " strinngsggg ";
        // reverse(str);
        // System.out.println(pallidrome(str));
//        String s1 = "hello";
//        String s2 ="lohel";
//        System.out.println(rotation(s1,s2));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(countAndSay(n));
        String s1 =" 123";
        String s2 =" hello";
        String res =" 123hello";
        if(isshuffle(s1,s2,res))
            System.out.println("yes");
        else System.out.println("no");

    }
// question 1
//    static void reverse(String str ){
//        StringBuilder builder = new StringBuilder();
//        builder.append(str);
//        builder.reverse();
//        System.out.println(builder);
//    }

        //question 2
//    static boolean pallidrome(String str){
//        int i =0;
//        int j = str.length()-1;
//        while(i<j) {
//            if (str.charAt(i) != str.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//            return true;
//
//        }

//question 3
//        String test = "geeksforgeeks";
//        char[] arr = test.toCharArray();
//        Arrays.sort(arr);
//        String sorted = new String(arr);
//        String ans =""+ sorted.charAt(0);
//        int count =1;
//        for(int i =1;i<sorted.length();i++) {
//            char curr = sorted.charAt(i);
//            char prev = sorted.charAt(i - 1);
//            if (curr == prev) {
//                count++;
//            } else {
//                if (count > 1) {
//                    ans += count;
//                    count = 1;
//                    ans += curr;
//                }
//            }
//        }
//        if(count >1){
//            ans+=count;
//            System.out.println(ans);
//        }
//
//
        //question 4
//    static boolean rotation(String s1, String s2){
//        if(s1.length()!=s2.length()){
//            return false;
//        }
//        String temp = s1+s1;
//        if(temp.indexOf(s2)!=-1){
//            return true;
//        }
//        return false;
//    }

        //question 5;
        // if several reference points to the same Strings without even knowing it, it would be bad if one of the references modified that string value.
    //}
    //question 6;
//    static String countAndSay(int n){
//        if(n==1){
//            return "1";
//        }
//        String previoustrem = countAndSay(n-1);
//        int count = 0;
//        char prev = '0';
//        String ans =" ";
//        for(int i =0;i <previoustrem.length();i++){
//            if(previoustrem.charAt(i)==prev){
//                count++;
//            }
//            else {
//                if(count !=0){
//                    ans+=count;
//                    ans+=prev;
//                }
//                prev = previoustrem.charAt(i);
//                count =1;
//            }
//        }
//        if(count !=0){
//            ans+=count;
//            ans+=prev;
//        }
//        return ans;
//
//
//    }

    // question 7;
    static boolean isshuffle(String s1,String s2, String res){
        int n = s1.length();
        int n2 =s2.length();
        if(n+n2!=res.length())
            return false;
        s1 = sort(s1);
        s2 = sort(s2);
        res = sort(res);
        int i =0,j=0,k=0;
        while(k<res.length()){
            if(i<n&& s1.charAt(i)==res.charAt(k))
                i++;
            else if(j<n2&&s2.charAt(j)==res.charAt(k))
                j++;
            else
                return false;
                k++;}
        return i<=n && j>=n2;
    }
    static String sort(String ss){
        char [] ca = ss.toCharArray();
        Arrays.sort(ca);
        return String.valueOf(ca);
    }
}
