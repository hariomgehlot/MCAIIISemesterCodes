
import java.util.Scanner;

public class MatrixOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char squared = ' ';
        boolean square=false;
        int m,n,p,q;
        
        System.out.println("Are they both an square matrix ?:(y/n) : ");
        squared = sc.next().charAt(0);
        if(!(squared =='y' || squared =='Y')){
            System.out.println("Enter the size of Array 1 rows (m):");
            m =sc.nextInt();
            System.out.println("Enter the size of Array 1 columns (n):");
            n =sc.nextInt();
    
    
            System.out.println("Enter the size of Array 2 rows (p):");
            p =sc.nextInt();
            System.out.println("Enter the size of Array 2 columns (q):");
            q =sc.nextInt();
        }else{
            System.out.println("Enter side of Square Matrix  :");
            m=n=p=q= sc.nextInt();
            square =true;
        }
       

        if(n!=p){
            System.out.println("Matrix operations can't be performed as they have different dimensions row1 != col2 :("+m+") X ("+n+")"+ " "+ "("+p+") X ("+q+")!");
            sc.close();
            return;
        }
        int [][]arrA = new int[m][n];
        int [][]arrB = new int[p][q];
    

        int choice=0;
        
        System.out.println("Enter Array A :");
        for(int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("["+i+"]["+j+"]+["+i+"]["+j+"] =");
                arrA[i][j] = sc.nextInt();
            }
        }

            System.out.println("Enter Array B :");
            for(int i =0;i<p;i++){
                for (int j=0;j<q;j++){
                    System.out.print("["+i+"]["+j+"]+["+i+"]["+j+"] =");
                    arrB[i][j] = sc.nextInt();
                }
            }
        
        System.out.print("Choose the operation you want to perform :(1-3):\n 1. Addition\n 2. Subtraction \n 3. Multiplication \n ");
        choice= sc.nextInt();
        switch(choice){
            case 1 : if(square) addition(arrA,arrB);
                    else System.out.print("Can't perform dimension error must be a square matrix!");
            break;

            case 2: if(square) subtraction(arrA,arrB);
                     else System.out.print("Can't perform dimension error must be a square matrix!");
            break;

            case 3: multiplication(arrA,arrB);
            break;

            default:
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        sc.close();
    }



    




    static void addition(int [][]arrA,int [][]arrB){
        int m  = arrA.length;
        int n = arrA[0].length;

        for(int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arrA[i][j]+" + "+arrB[i][j]+"= " +(arrA[i][j]+arrB[i][j])+"  ");
            }
            System.out.println();
        }
    }



    static void subtraction(int [][]arrA,int [][]arrB){
        int m  = arrA.length;
        int n = arrA[0].length;

        for(int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arrA[i][j]+" - "+arrB[i][j]+"= "+ (arrA[i][j] - arrB[i][j])+"  ");
            }
            System.out.println();
        }
    }


    static void multiplication(int [][] arrA,int [][]arrB){
        int m = arrA.length;
        int n = arrA[0].length;
        int p = arrB.length;
        int q = arrB[0].length;
        
        if(n!=p){
            System.out.println("Matrix operations can't be performed as they have different dimensions row1 != col2 :("+m+") X ("+n+")"+ " "+ "("+p+") X ("+q+")!");
            return;
        }
        int arrC[][] = new int[m][q];
        int c,d,k,sum=0;     
        for (c = 0; c < m; c++) {
            for (d = 0; d < q; d++){
                for (k = 0; k < p; k++){
                    sum += arrA[c][k]*arrB[k][d];
                }
                arrC[c][d] = sum;
                sum = 0;
             }
       }
       System.out.println("Multiplication is :");
       for(int[] arr : arrC){
           for (int num :arr){
               System.out.print(num+" ");
           }
           System.out.println();
           
       }



    }

}