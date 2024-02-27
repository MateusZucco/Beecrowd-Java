import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> directions = Arrays.asList('N', 'L', 'S', 'O');
        int max = 1;

        while (true) {
            max = Integer.parseInt(br.readLine());
            if (max == 0 ){
                break;
            }
            int face = 0;

            String entry = br.readLine();
            for (int i = 0; i < entry.length(); i++) {
                if (entry.charAt(i) == 'D' || entry.charAt(i) == 'd') {
                    face += 1;
                } else {
                    face -= 1;
                }
                if (face > 3) {
                    face = 0;
                }
                if (face < 0) {
                    face = 3;
                }
            }
            System.out.println(directions.get(face));
        }
    }
}