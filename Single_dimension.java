import java.util.Scanner;

public class Single_dimension {
    public static void main(String[] args){
        int a[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("Enter the values");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=3;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
