import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon10828{
    public static void main(String[] args) throws IOException{
        //예외처리를 하는 이유
        //readLine() 메소드는 IOException을 발생 시키기 때문이다.

        Stack<Integer> stack = new Stack<>();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //Scanner와 System.out 의 입출력시간이 길어 시간초과가 일어남
        //대용으로 BufferedReader/Writer를 사용

        int i = Integer.parseInt(br.readLine());
        
        
        while(i-->0){

            //String[] str = br.readLine();
            //BufferedReader는 한줄 전체를 읽어버림
            //StringTokenizer st = new StringTokenizer(str); 토큰클래스 사용
            //그래서 StringTokenizer 클래스를 이용해 띄어쓰기를 기준으로 나눠줌
            //호환성을 위해 유지되는 레거시 클래스이고 사용권장을 안한다고함.
            //그래서 split을 사용하기로 했음

            String[] str = br.readLine().split(" ");

            

            switch(str[0]){
            //switch(st.nextToken()){ 토큰클래스 사용

                case "push": 
                    //int n = Integer.parseInt(st.nextToken()); 토큰클래스 사용
                    int n = Integer.parseInt(str[1]);
                    //push X 에서 X 를 매번 받아오기위해 case문 안에 넣음
                    stack.push(n); 
                    break;
                    //push X: 정수 X를 스택에 넣는 연산이다.
                case "pop": 
                    if (stack.empty()==true) {
                        bw.write(-1+"\n"); 
                    }else {                   
                        bw.write(stack.pop()+"\n");                 
                    };                    
                    break;
                    //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "size": 
                        bw.write(stack.size()+"\n");
                    break;
                    //size: 스택에 들어있는 정수의 개수를 출력한다.
                case "empty": 
                    if(stack.empty()==true){
                        bw.write("1"+"\n");
                    }else {
                        bw.write("0"+"\n");
                    };
                    break;
                    //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
                case "top": 
                    if (stack.empty()==true) {
                        bw.write("-1"+"\n"); 
                    }else {                   
                        bw.write(stack.peek()+"\n");                  
                    };
                    break;
                    //top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    
            }

        }
        br.close();
        //bw.flush();
        //flush는 여태까지의 값들을 한번에 모아두는 것이다.
        //예를 들자면 여태까지 한 것에 대해 로그가 필요할때 쓰는 용도라 보면되겠다.
        bw.close();


    }
}