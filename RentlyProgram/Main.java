import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
	public static void main(String[] args) {
		int count = 0;
		Entry max;
		Scanner in = new Scanner(System.in);
		HashMap<String, Entry> myMap;
		
		count = in.nextInt();
		
		myMap = createPhoneBook(count);
		max = findLongestCall(myMap);
		max.cost=0;
		addEntry(myMap, max);
		showPhoneBook(myMap);
		System.out.println("Total Bill Amount : " + calculateTotalBill(myMap));
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
		Entry e, result=null;
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
				result = e;
			}
			else if(e.dur_seconds == max_time)
			{
				long dur1 = Long.parseLong(max.replaceAll("-",""));
				long dur2 = Long.parseLong(e.phoneNumber.replaceAll("-",""));
				
				if(dur2 < dur1)
				{
					max = e.phoneNumber;
					max_time = e.dur_seconds;
					result = e;
				}
				
				//System.out.println("Max test : dur1 = " + dur1 + " dur2 = " + dur2);
			}
        }
		//System.out.println("Max call : phnmbr = " + max + " durn = " + max_time);
		return result;
	}
	
	public static float calculateTotalBill(HashMap<String, Entry> map)
	{
		Entry e;
		float cost=0;
	    for(Map.Entry m:map.entrySet())
		{  
			e = (Entry)m.getValue();
			cost += e.cost;    
        }
		return cost;
	}
	
}


