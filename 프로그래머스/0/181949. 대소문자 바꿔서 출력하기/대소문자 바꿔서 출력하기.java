import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char aa;
        String res = "";
        for(int i=0; i<a.length(); i++){
            aa = a.charAt(i);
            
            if(Character.isUpperCase(aa)){
                res += Character.toLowerCase(aa);
            } else {
                res += Character.toUpperCase(aa);
            }
        }
        
        System.out.println(res);
    }
}