package readfiles;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class CsvReader {
	
	private BufferedReader bf; 
	private ArrayList<String> arrayLine;
	private ArrayList<String> logId;
	private ArrayList<String> logDate;
	private ArrayList<String> logUser;
	private ArrayList<String> logPC;
	private ArrayList<String> logActivity;
	
	
	public CsvReader(String path) throws FileNotFoundException{
		bf = new BufferedReader(new FileReader(new File(path)));
		arrayLine = new ArrayList<String>();
	}
	
	public void regexSplit(){
		String lineStr = arrayLine.get(i); //Linha Completa
		logId = new ArrayList<>();
		logDate = new ArrayList<>();
		logUser = new ArrayList<>();
		logPC = new ArrayList<>();
		logActivity = new ArrayList<>();
		String tmpReplace;
		for(int i = 0; i < arrayLine.size(); i++){
			/*
				PADRÃO
			*/
			logId.add(sM.getString(lineStr, "\\{(.*?)\\}")); // id do log
			logDate.add(sM.getString(lineStr, "[0-9]{2}\\/[0-9]{2}\\/[0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2}", 0)); // data
			logUser.add(sM.getString(lineStr, "\\bDTAA\\/(.*?),", 0)); //usuário
			logPC.add(sM.getString(lineStr, "PC-[0-9]{4}", 0)); //PC	
			
			tmpReplace = "{" + logId.get(i) + "}," + logDate.get(i) + "," + logUser.get(i) + logPC.get(i) + ",";
			logActivity.add(lineStr.replace(tmpReplace, ""));
		}
	}
}
