import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int accum = Integer.parseInt(br.readLine());

        int count = 0;
        while (count < accum){
            String entry = br.readLine();
            if(entry.charAt(0) == entry.charAt(2)){
                System.out.println(Integer.parseInt(String.valueOf(entry.charAt(0))) * Integer.parseInt(String.valueOf(entry.charAt(2))));
                count++;
            }else if(isUpper(entry.charAt(1))){
                System.out.println(Integer.parseInt(String.valueOf(entry.charAt(2))) - Integer.parseInt(String.valueOf(entry.charAt(0))) );
                count++;
            }else{
                System.out.println(Integer.parseInt(String.valueOf(entry.charAt(2))) + Integer.parseInt(String.valueOf(entry.charAt(0))));
                count++;
            }
        }
    }

    static boolean isUpper(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
}