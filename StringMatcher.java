import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.io.BufferedReader;

class StringMatcher {
	public String getString (String line, String pattern) {
		try{
			Pattern idPattern = Pattern.compile(pattern);
			Matcher mId = idPattern.matcher(line);
			if(mId.find()){
				return mId.group(1);
			}
		}catch(Exception e){
		}
		return "";
	}
}