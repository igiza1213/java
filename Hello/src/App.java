import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // int a[];
        // int[] b;
        // int[] c = {31, 32, 33};
        // a = new int[4];
        // b = new int[]{21, 22, 23, 24};
        // c = b;
        // System.out.println(a.length + " " + b.length + " " + c.length);

        int score[] = new int[5];
        int sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("성적입력: ");
            score[i] = sc.nextInt();
            sum += score[i];
        }
        System.out.println("합계 : " + sum);
        avg = sum / 5;
        System.out.println("평균 : " + avg);
        sc.close();
    }
}























