import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Csv{

	public Csv(){}

	public static void main(String [] args) throws Exception{
		BufferedReader fileLine = new BufferedReader(new FileReader("/home/juliana/Documents/UFRN/2017.1/LP II/InsiderThreat/device.csv"));
		ArrayList<String> arrayLine = new ArrayList<String>();
		String line = null;
		StringMatcher sM = new StringMatcher();

		while((line = fileLine.readLine()) !=null){
			arrayLine.add(fileLine.readLine());
		}
		// for(int i = 0; i < arrayLine.size(); i++){
		// 	System.out.println(arrayLine.get(i));
		// }
		for(int i = 0; i < arrayLine.size() -1; i++){
			String lineStr = arrayLine.get(i); //Linha Completa
			/*
				PADRÃO
			*/
			String logId = sM.getString(lineStr, "\\{(.*?)\\}"); // id do log
			String logDate = sM.getString(lineStr, "[0-9]{2}\\/[0-9]{2}\\/[0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2}", 0); // data
			String logUser = sM.getString(lineStr, "\\bDTAA\\/(.*?),", 0); //usuário
			String logPC = sM.getString(lineStr, "PC-[0-9]{4}", 0); //PC

			String tmpReplace = "{" + logId + "}," + logDate + "," + logUser + logPC + ",";
			String logActivity = lineStr.replace(tmpReplace, "");

			/*
				#################################
			*/

			System.out.println(logActivity.equals("Connect")); // atividade do dispositivo

			// System.out.println(sM.getString(lineStr, "PC-[0-9]+"));
			// System.out.println(sM.getString(lineStr, "Connect|Disconnect"));
			// System.out.println(this.stringMatcher(arrayLine.get(i), "\\{(.*?)\\}"));

			//String id = mId.group(1);

			/* Pattern datePattern = Pattern.compile("[0-9]+\\/[0-9]+\\/[0-9]+ [0-9]+:[0-9]+:[0-9]+");
			Matcher mDate = datePattern.matcher(arrayLine.get(i));
			String date = mDate.group(1);

			Pattern userPattern = Pattern.compile("DTAA\\/[A-Z]+[0-9]+");
			Matcher mUser = userPattern.matcher(arrayLine.get(i));
			String user = mUser.group(1);

			Pattern pcPattern = Pattern.compile("PC-[0-9]+");
			Matcher mPc = pcPattern.matcher(arrayLine.get(i));
			String pc = mPc.group(1);

			Pattern activityPattern = Pattern.compile("Connect|Disconnect");
			Matcher mActivity = activityPattern.matcher(arrayLine.get(i));
			String activity = mActivity.group(1); */
		}
	}
}