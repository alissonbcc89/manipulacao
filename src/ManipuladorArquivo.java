import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class ManipuladorArquivo {

	//FileOutputStream out = null;
//	ArrayList<Crime>crimes = new ArrayList<Crime>();
	public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
      //  out = new FileOutputStream("copiadeproverbiochines.txt");
        
        String linha = ",";
        while (true) {
            if (linha != null) {
            	//Crime
                System.out.println(linha);
 
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
	public static void mortesNov(String path) throws IOException
	{
	 
		Crime crime;
		
		crime.setData(leitor(path));
		
		crimes.add(leitor(path));
		leitor(path);
		 
	
		
	}
}
