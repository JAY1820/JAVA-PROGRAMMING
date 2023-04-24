class NoMatchException extends Exception
{
	NoMatchException(String msg)
 	{
 	      super(msg);
 	}
}

public class l7p3 {
    public static void main(String[] args) {
        String str = "jay";
        try {
            if (!str.equals("jaymin")) {
                throw new NoMatchException(str);
            }
        } catch (NoMatchException e) {
            System.out.println("string does not match");
        }
    }
}