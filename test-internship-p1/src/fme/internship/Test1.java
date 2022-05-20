/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads arguments from the command line 
 * and checks whether all numeric positive non-zero values appear in ascending order.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 7 8 
 *  Output:
 *      YES
 *______________________________________________________________________________________________________
 *      
 *______________________________________________________________________________________________________
 *  
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 4 7 8 
 *  Output:
 *      NO
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;
import java.util.Scanner;

/**
 * 
 * @author <Tocaciu Ioana Delia>
 * @email <tocaciu_ioana@yahoo.com>
 * 
 */
public class Test1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array[]=new int[10];
        int i=0;
        int ok=0;


        do {
            int num = scan.nextInt();
            if(num>0)
            array[i]=num;
            i++;

        } while (array[i]==(int)array[i]);

int j=0;
while(j<=i && ok==0)
    if (array[i] < array[i+1])
        j++;
        else
            ok=1;


if(ok==0)

    System.out.println("YES");
else
    System.out.println("NO");


    }

}