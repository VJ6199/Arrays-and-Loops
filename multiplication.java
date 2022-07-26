public class multiplication {
    public static void main(String[] args){
        int result = 0;
        System.out.println("multiples of 5 are: ");
        for(int i = 1; i<=50; i++){
            if(i%5==0){
                result = result+i;
                System.out.println(i+" ");
            }
        }
    }
}
