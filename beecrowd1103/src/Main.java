import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int midNightMinutes = 59 + 23 * 60;

        while (true) {
            String time = br.readLine();

            if(Objects.equals(time, "0 0 0 0")){
               break;
            }

            String[] separated = time.split(" ");

            int hour1 = Integer.parseInt(separated[0]);
            int minute1 = Integer.parseInt(separated[1]);

            int hour2 = Integer.parseInt(separated[2]);
            int minute2 = Integer.parseInt(separated[3]);

            if(hour1 < hour2){
                System.out.println(60 - minute1 + minute2 + ((hour2 - 1 - hour1) * 60));
            } else if(hour1 == hour2 && minute1 <= minute2){
                System.out.println(minute2 - minute1);
            }else{
                System.out.println(60 - minute1 + minute2 + ((23 - hour1) * 60) + (hour2 * 60)) ;
            }
        }
    }
}