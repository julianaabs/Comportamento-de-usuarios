import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;

public class CsvReader{

	public CsvReader(){}

	public static void main(String [] args) throws Exception{
		BufferedReader fileLine = new BufferedReader(new File("/home/juliana/Documents/UFRN/2017.1/LP II/InsiderThreat/device.csv"));
		ArrayList<String> arrayLine = new ArrayList<String>();
		String line;

		while((line = fileLine.readLine()) !=null){
			arrayLine.add(line);
		}
		for(int i = 0; i < fileLine.size(); i++){
			System.out.println(fileLine.get(i));
		}
	}
}