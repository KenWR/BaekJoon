import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9093No2 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int a = Integer.parseInt(br.readLine());
        
        while(a-->0){

            String str=br.readLine();
            //입력받는값
            String[] str2  =str.split(" ");
            //입력 받는 값을 띄어쓰기 기준으로 나눠서 배열에 담기

            for(int i=0; i<str2.length; i++){//배열길이만큼 반복(i의 값이 str2.length와 같아질때까지)
            
                //str2[i] 라는 한 단어의 순서를 바꿔야함
                StringBuilder sb = new StringBuilder(str2[i]);            
    
                System.out.print(sb.reverse()+" ");

                    
            }

        }

    }
    
}
