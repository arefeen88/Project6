import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    
    public static void main(String[] args)  {


        BufferedReader br = null;
        String line;

        try {

            br = new BufferedReader(new FileReader("sample.txt"));
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}


