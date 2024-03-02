
class Calculator
{
    public int add(int n1, int n2) {
    return n1+n2;
    }
}
public class Overloading 
{
  public static void main(String[] args)
   {
    Calculator obj= new Calculator();
    int sum= obj.add(56, 35);
    System.out.println(sum);
  }  
}
