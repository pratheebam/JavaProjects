
public class Entry
{
    public String phoneNumber;
    public int hours;
    public int minutes;
    public int seconds;
	
	Entry(String num, int hr, int min, int sec)
	{
		phoneNumber = num;
		hours = hr;
		minutes = min;
		seconds = sec;
	}
	
	public String getDuration()
	{	
		return new String(""+Integer.toString(hours)+ ":" + Integer.toString(minutes) + ":" + Integer.toString(seconds));
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}