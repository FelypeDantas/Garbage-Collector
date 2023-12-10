
public class Garbage {
  public static void main(String args[]) {
	  
	  Runtime rt = Runtime.getRuntime();
	  int MB = 1_048_576;
	  double total = rt.maxMemory()/MB;
	  System.out.println(total +" MB");
  }
}
