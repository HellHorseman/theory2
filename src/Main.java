import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Напишите пример перехвата и обработки исключения с использованием собственных исключений.
public class Main {
    public static void main(String[] args) {

        input();

    }

    public static String input() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = null;

        try {
            str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            if (str.equals("")){
                throw new MyException("String don't be empty");
            }
        }
        return str;
    }

}