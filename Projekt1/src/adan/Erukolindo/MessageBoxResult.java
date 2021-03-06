package adan.Erukolindo;

public enum MessageBoxResult {
	Abort ("Przerwij"),
	Retry ("Ponów"),
	Ignore ("Ignoruj"), 
	OK ("OK"),
	Cancel ("Anuluj"), 
	Yes ("Tak"),
	No ("Nie"); 
	
	private String text;
	
	MessageBoxResult(String msg) 
	{
		text = msg;
	}
	
	@Override
	public String toString()
	{
		return text;
	}
	
	public static MessageBoxResult getResult(String text) 
	{
		for(MessageBoxResult result : MessageBoxResult.values())
			if( result.toString() == text)
				return result;
		return Cancel;
	}
	

}
