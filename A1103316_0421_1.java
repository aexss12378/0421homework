import java.io.*;

public class A1103316_0421_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String str;
        boolean issmall;

        do{
            issmall = true;
            System.out.println("請輸入電子郵件信箱:");
            str = br.readLine();

            for(int i=0;i<str.length();i++){
                char ch =str.charAt(i);
                if(!str.matches("[a-z]+")) {
                    System.out.println("你輸入格式錯誤");
                    issmall = false;
                    break;
                }
            }
        } while(!issmall);
        
    }
}
