import java.util.*;
abstract interface math
{
    void print();
}
class d implements math
    {
    public void print()
        {
            System.out.println("hello");
        }
    }
    public class Abstract
    {
        public static void main(String[] args)
        {
            d f=new d();
            f.print();
        }
    }