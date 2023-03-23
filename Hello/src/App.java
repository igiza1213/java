// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // int a[];
    // int[] b;
    // int[] c = {31, 32, 33};
    // a = new int[4];
    // b = new int[]{21, 22, 23, 24};
    // c = b;
    // System.out.println(a.length + " " + b.length + " " + c.length);

    // int score[] = new int[5];
    // int sum = 0;
    // float avg;
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < 5; i++) {
    //   System.out.print("성적입력: ");
    //   score[i] = sc.nextInt();
    //   sum += score[i];
    // }
    // System.out.println("합계 : " + sum);
    // avg = sum / 5;
    // System.out.println("평균 : " + avg);
    // sc.close();

    int a[][] = new int[2][3];
    a[0][0] = 1; a[0][1] = 2; a[0][2] = 3;
    a[1][0] = 10; a[1][1] = 20; a[1][2] = 30;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + "\t");
        }
    }
    

    
    }
}


