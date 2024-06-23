//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n==0||n==1){
            System.out.println(n+" is not a prime number"); //0 and 1 are neither prime and composite numbers
            return;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    return;
                }
            }
        }
        System.out.println(n+" is a prime number");
    }
}