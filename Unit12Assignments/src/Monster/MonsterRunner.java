package Monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
                
		//ask for name and size
                System.out.print("Enter the 1st monster's name: ");
                String name1 = keyboard.nextLine();
                System.out.print("Enter the 1st monster's size: ");
                int size1 = keyboard.nextInt();
                keyboard.nextLine();
		
		//instantiate monster one
                Skeleton monster1 = new Skeleton(name1, size1);
		
		//ask for name and size
                System.out.print("Enter the 2nd monster's name: ");
                String name2 = keyboard.nextLine();
                System.out.print("Enter the 2nd monster's size: ");
                int size2 = keyboard.nextInt();
                keyboard.nextLine();
                
                System.out.println(" Monster 1 - " + name1 + " "+ size1);
                System.out.println(" Monster 2 - " + name2 + " "+ size2);
		
		//instantiate monster two
                Skeleton monster2 = new Skeleton(name2, size2);
                
                if(monster1.isBigger(monster2)){
                    System.out.println("Monster one is bigger than Monster two.");
                }
                else if(monster1.isSmaller(monster2)){
                    System.out.println("Monster one is smaller than Monster two.");
                }
                else{
                    System.out.println("Monster one is the same size as Monster two");
                }
                
                if(monster1.namesTheSame(monster2)){
                    System.out.println("Monster one has the same name as Monster two");
                }
                else{
                    System.out.println("Monster one doesn't have the same name as Monster two");
                }
                
	}
}