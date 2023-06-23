import java.util.Scanner;

public class BaekJoon_2941 {
    //크로아티아 알파벳 문제 contains와 replace를 활용해서 문제 풀기
    //문제를 잘 이해하지 못했던 문제 
    public static void main(String[] args) {
        String[] str = { "c=" ,"c-" ,"dz=","d-" , "lj","nj","s=","z="};


        Scanner sc = new Scanner(System.in);

        String Croatia = sc.nextLine();

            for (int i = 0; i < str.length; i++) {
                if(Croatia.contains(str[i])){
                    Croatia = Croatia.replace(str[i],"!"); 
                }
            }
            
        
            
            System.out.println(Croatia.length());
            System.out.println(Croatia);
        
            
    }
}