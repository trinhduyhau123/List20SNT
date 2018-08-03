import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i <= 100; i++) {

            boolean check = true;
            if(i<2){
                check = false;
            }
            if(i==2){
                check = true;
            }
            if(i>2){
                if(i%2==0){
                    check = false;
                }
                else{
                    for(int j=3;j<=Math.sqrt((double)i);j+=2){
                        if(i%j==0){
                            check = false;
                        }else{
                            check = true;
                        }
                    }
                }
            }
            if(check && count<=20){
                System.out.print(i  + "    ");
                count++;
            }
//            else{
//                System.out.println(i + "ko phai so nguyen to");
//            }
        }

    }
}