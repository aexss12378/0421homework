import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

import javax.print.FlavorException;

public class A1103316_0421_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //String pat="[0-9]";
        String str;
        boolean isright;

        do{
            isright = true;
            System.out.print("輸入");
            str =br.readLine();
            if(str.matches("\\d{4}/\\d{2}/\\d{2}")) {
                System.out.println(str.substring(0,4)+"年"+str.substring(5,7)+"月"+str.substring(8,10)+"日");
                isright = false;
            }
            if(str.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println(str.substring(6,10)+"年"+str.substring(0,2)+"月"+str.substring(3,5)+"日");
                isright = false;
            }

 
        }while(isright);



    }
}
