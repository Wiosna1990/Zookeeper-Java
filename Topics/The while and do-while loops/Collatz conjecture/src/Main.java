import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.print(n+" ");
        do{
            if(n==1){
                break;
            }
            else if(n%2==0){
                n=n/2;
                
            }else{
                n=(n*3)+1;
                
            }
        System.out.print(n+" ");
        }while(n>1);

    }
}

