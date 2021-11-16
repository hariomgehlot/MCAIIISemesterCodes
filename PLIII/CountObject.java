
public class CountObject  
{  
//variable to keep track of objects  
private static int count;  
//constructor of the class  
public CountObject()   
{  
// increase the count variable by 1  
count++;  
}  
public static void main(String args[])   
{  
//creating objects  
CountObject ob1 = new CountObject();  
CountObject ob2 = new CountObject();  
CountObject ob3 = new CountObject();  
CountObject ob4 = new CountObject();  
CountObject ob5 = new CountObject();  
//prints number of objects  
System.out.print("Total Number of Objects: " + CountObject.count);  
}  
}  