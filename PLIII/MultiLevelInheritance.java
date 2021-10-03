
class parent2                             //level-0
{
    String s1="Parent class";      
}
class child2 extends parent2              //level-1
{
    String s2="Child class";
}

public class MultiLevelInheritance extends child2    //level-2
{
    String s3="Sub-child";
    public static void main(String args[])
    {
        MultiLevelInheritance obj=new  MultiLevelInheritance();
        System.out.println(obj.s1);
        System.out.println(obj.s2);
        System.out.println(obj.s3);
    }
}