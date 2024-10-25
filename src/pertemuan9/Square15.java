package pertemuan9;

import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for(int iouter=1; iouter<=N; iouter++){
        System.out.print("*");
        for(int i=1; i<N; i++){
            System.out.print("*");
            }
            System.out.println();
        }    
    }
}
