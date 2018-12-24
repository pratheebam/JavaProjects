
import java.util.HashMap;
import java.lang.Math;

public class Entry
{
    public String phoneNumber;
    public int hours;
    public int minutes;
    public int seconds;
	
	public float cost;
	public long dur_seconds;
	
	Entry(String num, int hr, int min, int sec)
	{
		phoneNumber = num;
		hours = hr;
		minutes = min;
		seconds = sec;
		this.durationInSeconds();
		this.calculateCost();
	}
	
	public void durationInSeconds()
	{
		this.dur_seconds = (long)this.seconds + ((long)this.minutes * 60) + ((long)this.hours * 3600);
	}
	
	public String getDuration()
	{	
		return new String(""+Integer.toString(hours)+ ":" + Integer.toString(minutes) + ":" + Integer.toString(seconds));
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public boolean isValid()
	{
		if(this.phoneNumber.length()==11)
		{
			if(this.hours>=0 && this.hours <= 99)
			{
				if(this.minutes>=0 && this.minutes<=59)
				{
					if(this.seconds>=0 && this.seconds<=59)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public Entry getEntryFromBook(HashMap<String, Entry> map)
	{
		Entry temp = (Entry) map.get(this.phoneNumber);
		String str = temp.getDuration();
		return parseEntry(this.phoneNumber, str);
	}
	
	public void add(Entry e)
	{
		this.seconds = this.seconds + e.seconds;
		if(this.seconds >= 60)
		{
			this.minutes += 1;
			this.seconds -= 60;
		}
		
		this.minutes = this.minutes + e.minutes;
		if(this.minutes >= 60)
		{
			this.hours += 1;
			this.minutes -= 60;
		}
		
		this.hours = this.hours + e.hours;
		this.dur_seconds = this.dur_seconds + e.dur_seconds;
		this.cost = this.cost + e.cost;
		
		
		//this.durationInSeconds();
		//this.calculateCost();
	}
	
	public void calculateCost()
	{	
		if(this.dur_seconds < 300)
		{
			this.cost = (float)( this.dur_seconds * 3.0f);
		}
		else
		{
			this.cost = (float)Math.ceil(this.dur_seconds / 60.0f) * 150;
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