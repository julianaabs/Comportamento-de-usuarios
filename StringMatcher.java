import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.io.BufferedReader;

class StringMatcher {
	private String _getString (String line, String pattern, int group) {
		try{
			Pattern thisPattern = Pattern.compile(pattern);
			Matcher thisM = thisPattern.matcher(line);
			if(thisM.find()){
				return thisM.group(group);
			}
		}catch(Exception e){
		}
		return "";
	}

	public String getString (String line, String pattern) {
		return this._getString(line, pattern, 1);
	}

	public String getString (String line, String pattern, int group) {
		return this._getString(line, pattern, group);
	}

}