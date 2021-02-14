//AsciiChars.
public class AsciiChars 
{
  public static void printNumbers()
  {
	for (int asciiValue = 48; asciiValue <= 57; asciiValue++){
	char number = (char) asciiValue;
	System.out.println("The number " + number + " is asciivalue " + asciiValue );
	
	}
	
  }

  public static void printLowerCase()
  {
	  for (int asciiValue = 97; asciiValue <= 122; asciiValue++){
			char number = (char) asciiValue;
			System.out.println("The number " + number + " is asciivalue " + asciiValue );
			
			}
  }

  public static void printUpperCase()
  {
	  for (int asciiValue = 65; asciiValue <= 90; asciiValue++){
			char number = (char) asciiValue;
			System.out.println("The number " + number + " is asciivalue " + asciiValue );
			
			}
	  }
}
