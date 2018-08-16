import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\LAKSHMI NARAYANA\\Desktop\\FiletoRead.txt");
		Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
        {
            System.out.println("The integer read is "+ sc.nextLine());
            System.out.println("The floating point number read is "+ sc.nextLine());
            System.out.println("The string read is "+ sc.nextLine());
            

        }
        
        System.out.println("Hi! Peter, the sum of 12 and 33.34 is " +sc.nextDouble() );
        sc.close();
	}
}


