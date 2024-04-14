import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = new String[a.length()];
        for(int i=0;i<a.length();i++){
            b = a.split("");
        }
        for(String br : b){
            System.out.println(br);
        }
    }
}