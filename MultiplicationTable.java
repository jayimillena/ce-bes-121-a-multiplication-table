public class MultiplicationTable
{
  public static void main(String[] args) 
  {
    System.out.println("      1  2  3  4  5  6  7  8  9  10  11   12");
    System.out.println("--------------------------------------------");

    for (int i = 1; i <= 12; i++)
    {
      if (i < 10)
      {
        System.out.print(" "+ i +" |");  
      }
      else
      {
        System.out.print(i +" |");
      }
      
      for (int j = 1; j <= 12; j++)
      {
        System.out.print(i*j);
      }
    }
      
  }
}