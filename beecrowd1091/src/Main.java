import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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

        while (true){
            int queriesNumber = Integer.parseInt(br.readLine());


            if (queriesNumber == 0){
                break;
            }

            String center = br.readLine();
            String[] centerPoints = center.split(" ");

            int count = 0;

            while (count < queriesNumber){
                String coordinate = br.readLine();
                String[] coordinatePoints = coordinate.split(" ");
                String result;

                if(Objects.equals(coordinatePoints[1], centerPoints[1]) || Objects.equals(coordinatePoints[0], centerPoints[0])){
                    result = "divisa";
                }else {
                    if (Integer.parseInt(coordinatePoints[1]) > Integer.parseInt(centerPoints[1])) {
                        result = "N";
                    } else {
                        result = "S";
                    }

                    if (Integer.parseInt(coordinatePoints[0]) > Integer.parseInt(centerPoints[0])) {
                        result += 'E';
                    } else {
                        result += 'O';
                    }
                }

                System.out.println(result);
                count++;
            }

        }

    }
}