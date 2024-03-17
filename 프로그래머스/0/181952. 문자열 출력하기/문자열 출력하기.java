import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int a2 = a.length();
        if(1 <= a2 && a2 <= 1000000){
            System.out.println(a);
        }  
    }
}