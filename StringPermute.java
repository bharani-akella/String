import java.util.Scanner;
import java.util.Set;
import java.util.zip.Checksum;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class StringPermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter first string");
String name1=s.next();
System.out.println("Enter second string");
String name2=s.next();

HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();

for(int i=0;i<name1.length();i++){
	if(hm1.containsKey(name1.charAt(i))){
		hm1.put(name1.charAt(i), hm1.get(name1.charAt(i))+1);
	}else{
		hm1.put(name1.charAt(i),1);
	}
}

for(int i=0;i<name2.length();i++){
	if(hm2.containsKey(name2.charAt(i))){
		hm2.put(name2.charAt(i), hm2.get(name2.charAt(i))+1);
	}else{
		hm2.put(name2.charAt(i),1);
	}
}

Set set=hm2.entrySet();
Iterator itr=set.iterator();

int count=0;
while(itr.hasNext()){
	Map.Entry e=(Map.Entry)itr.next();
	if(hm1.containsKey(e.getKey())){
		if(hm1.get(e.getKey())==e.getValue()){
			count++;
		}else{
			System.out.println("Not a permutation");
			break;
		}
	}else{
		System.out.println("Not a permutation");
		break;
	}
}

if(count==hm1.size() && count==hm2.size()){
	System.out.println("Permutation");
}


	}
	
}
