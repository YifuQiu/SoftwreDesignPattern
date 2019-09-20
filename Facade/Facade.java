package Facade;

public class Facade {
    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();
 
    public void Method()
    {
        obj1.MethodA();
        obj2.MethodB();
        obj3.MethodC();
    }
}


class SubSystemA
{
    public void MethodA()
    {
        
    }
}
 
class SubSystemB
{
    public void MethodB()
    {
        
     }
}
 
class SubSystemC
{
    public void MethodC()
    {
        
    }
}