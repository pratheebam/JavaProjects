import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
	public static void main(String[] args) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		HashMap<String, Entry> myMap;
		
		count = in.nextInt();
		
		myMap = createPhoneBook(count);
		showPhoneBook(myMap);
	}
	
	public static HashMap<String, Entry> createPhoneBook(int count)
	{
	    int i;
	    String phoneNumber, duration, input;
	    Scanner sc = new Scanner(System.in);
	    HashMap<String, Entry> hm = new HashMap<>();
		Entry entry;
	    
	    for(i=0;i<count;i++)
	    {
			input = sc.nextLine();
			int index = input.indexOf(",");
	        duration = input.substring(0,index);
	        phoneNumber = input.substring(index+1, input.length());
			//System.out.println("Test : " + duration + " - " + phoneNumber);
			entry = parseEntry(phoneNumber, duration);
			if(entry.isValid()==true)
			{
				if(!hm.containsKey(entry.phoneNumber))
					addEntry(hm, entry);
				else
				{
					Entry prev = entry.getEntryFromBook(hm);
					prev.add(entry);
					addEntry(hm, prev);
				}
			}
			else
				System.out.println("Invalid entry encountered!");
	    }
	    sc.close();
	    return hm;
	}
	
	public static void addEntry(HashMap<String, Entry> map, Entry entry)
	{
	    map.put(entry.getPhoneNumber(), entry);
	}
	
	public static void showPhoneBook(HashMap<String, Entry> map)
	{
		Entry e;
		String ph;
	    for(Map.Entry m:map.entrySet()){  
			ph = (String)m.getKey();
			e = (Entry)m.getValue();
			System.out.println(e.getPhoneNumber() + "\t" + e.getDuration() + "\t" + e.cost);    
          }  
	}
	
	public static Entry parseEntry(String phNum, String dur)
	{
		int hr, min, sec;
		String[] val = dur.split(":");
		
		if(phNum.length()==11 && val.length==3 )
		{
			hr = Integer.parseInt(val[0]);
			min = Integer.parseInt(val[1]);
			sec = Integer.parseInt(val[2]);
			//System.out.println("parseentry test : " + hr + " " + min + " " + sec);
			return new Entry(phNum,hr,min,sec);
		}
		else
			return null;
	}
}


