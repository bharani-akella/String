import java.util.Scanner;
import java.util.Set;
import java.util.zip.Checksum;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class StringUnique2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String name=s.next();

StringUnique2 obj=new StringUnique2();
boolean result=obj.checkUnique(name);

if(result==true){
	System.out.println("All unique characters");
}else{
	System.out.println("Not all characters are unique");
}

	}
	
	public boolean checkUnique(String str){
		if(str.length()>128){
			return false;
		}
		boolean charset[]=new boolean[128];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(charset[val]){
				return false;
			}
			charset[val]=true;
		}
		return true;
	}

}
