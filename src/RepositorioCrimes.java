import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RepositorioCrimes {
	
	ArrayList<Crime> assasinatos = new ArrayList<Crime>();
	
	
	
	
	public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

	
	public static void homicidioNov2015(String path)
	{
	
		
		FileInputStream fileputStream;
	}
	
}
