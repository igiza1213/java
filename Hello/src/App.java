// import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {


    int sum = 0;
    System.out.print("1-2+3-4+5-6+7-8+9-10=");
    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) { 
            sum += i;
        } else{
            sum -= i;
        }
    }
    System.out.print(sum);

    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= 5; j++){
            System.out.print(j + "\t");
        }
    System.out.print("\n");
    }

    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j + "\t");
        }
        System.out.print("\n");
    }

    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*\t" );
        }
        System.out.print("\n");
    }

    for (int i = 1; i <= 3; i++) {
        for (int j = 3; j >= i; j--) {
            System.out.print("*\t" );
        }
        System.out.print("\n");
    }


    }
}


