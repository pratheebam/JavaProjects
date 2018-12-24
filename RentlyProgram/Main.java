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
		findLongestCall(myMap);
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
			entry = Entry.parseEntry(phoneNumber, duration);
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
				System.out.println("Invalid entry : Ca'nt be added!");
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
	
	public static Entry findLongestCall(HashMap<String, Entry> map)
	{
		Entry e;
		String ph,max="";
		long max_time=-1;
	    for(Map.Entry m:map.entrySet())
		{  
			ph = (String)m.getKey();
			e = (Entry)m.getValue();
			if(e.dur_seconds > max_time)
			{
				max = e.phoneNumber;
				max_time = e.dur_seconds;
			}
			else if(e.dur_seconds == max_time)
			{
				long dur1 = Long.parseLong(max.replaceAll("-",""));
				long dur2 = Long.parseLong(e.phoneNumber.replaceAll("-",""));
				System.out.println("Max test : dur1 = " + dur1 + " dur2 = " + dur2);
			}
        }
		return null;
	}
}


