/**
 *  Program 1
 *  1-2 Line Description of class/program
 *  CS108-1
 *  May 27 2019
 *  @author  Will Rodrigues
  */


public class GetId {
	
	public static String progId() 
    {
        int progId = 1;
        String sName = "Will Rodrigues";
		return "Program " + progId + ", " + sName;	
    }
	
	public static String progId(int prog) 
    {
        int progId = prog;
        String sName = "Will Rodrigues";
        return "Program " + progId + ", " + sName;	
    }
	
	public static String progId(String name, int prog) 
    {
        int progId = prog;
        String sName = name;
        return "Program " + progId + ", " + sName;	
    }

	public static void main(String[] args) {
		
		System.out.println(GetId.progId());
        System.out.println(GetId.progId(1));
        System.out.println(GetId.progId("Will Rodrigues", 1));

	}

}
