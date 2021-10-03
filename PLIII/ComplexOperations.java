import java.util.*;

class ComplexNum {

	int real, imaginary;
	ComplexNum(){

	};


	ComplexNum(int real, int imaginary)
	{
		this.real = real;
		this.imaginary =imaginary;
	}

	ComplexNum addComplex(ComplexNum cmp1, ComplexNum cmp2)
	{
		
		ComplexNum temp = new ComplexNum();

		temp.real = cmp1.real + cmp2.real;

		temp.imaginary = cmp1.imaginary + cmp2.imaginary;

		return temp;
	}

	
	ComplexNum subtractComplex(ComplexNum cmp1, ComplexNum cmp2)
	{
	
		ComplexNum temp = new ComplexNum();
		
		temp.real =cmp1.real -cmp2.real;
		
		temp.imaginary =cmp1.imaginary -cmp2.imaginary;
		return temp;
	}

	ComplexNum multiplyComplex(ComplexNum cmp1 ,ComplexNum cmp2){
		ComplexNum temp = new ComplexNum();
		temp.real = (cmp1.real*cmp2.real - cmp1.imaginary*cmp2.imaginary);
		temp.imaginary = (cmp1.real*cmp2.imaginary + cmp1.imaginary*cmp2.real);
		return temp;
	}

	
	void tostring()
	{
		System.out.println("Complex number: "
						+ real + " + "
						+ imaginary + "i");
	}
}


class ComplexOperations{

	
	public static void main(String[] args)
	{

		ComplexNum cmp1 = new ComplexNum(5, 9);

		cmp1.tostring();

		ComplexNum cmp2 = new ComplexNum(1, 6);

		cmp2.tostring();
		
		Scanner sc = new Scanner(System.in);
		ComplexNum temp = new ComplexNum();
		int choice ;
		do{
		System.out.println("Enter Your Choice : \n1. Addition.\n2. Subtraction. \n3. Multiplication \n0. Exit : ");
		choice = sc.nextInt();
		switch(choice){
			case 0:  break;
			case 1 : temp =temp.addComplex(cmp1, cmp2);
					temp.tostring();	
			break;
			case 2: temp = temp.subtractComplex(cmp1, cmp2);
					temp.tostring();
			break;

			case 3 : temp= temp.multiplyComplex(cmp1, cmp2);
					temp.tostring();
			break;
			default: System.out.println("Enter Correct choice!");
			break;
		}
		
		}while(choice!=0);
			sc.close();
	}
}
