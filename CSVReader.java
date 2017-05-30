//import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;

public class CSVReader{

	public CSVReader(){}

	/* File folder = new File("/home/juliana/Documents/UFRN/2017.1/LP II/InsiderThreat");

	public void readfiles(){
		folder.listFiles();
	} */

	public static void main(String [] args){
		File folder = new File("/home/juliana/Documents/UFRN/2017.1/LP II/InsiderThreat");
		File[] listofFiles = folder.listFiles();

		for(int i = 0; i < listofFiles.length; i++){
			System.out.println(listofFiles[i].getName());
		}
	}
}