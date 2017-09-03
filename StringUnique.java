import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class StringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String name=s.next();

HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

for(int i=0;i<name.length();i++){
	if(hm.containsKey(name.charAt(i))){
		hm.put(name.charAt(i), hm.get(name.charAt(i))+1);
	}else{
		hm.put(name.charAt(i),1);
	}
}

Set set=hm.entrySet();
Iterator itr=set.iterator();

int count=0;
while(itr.hasNext()){
	Map.Entry e=(Map.Entry)itr.next();
	if((int)e.getValue()>1){
		System.out.println("No, all the characters are not unique");
		break;
	}else{
		count++;
	}
}

if(count==name.length()){
	System.out.println("All the characters are unique");
}

	}

}
