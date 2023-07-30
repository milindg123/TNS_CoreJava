// Program to demonstrate the access modifiers
// driver class
package in.kkwagh.library;
import in.metbkc.library.Library;
//import in.bkcmet.library.*;

public class FacultyExecutor {

	public static void main(String[] args) {
		
		Library l = new Library();
		l.libraryName = "Bhujbal Library";
		l.displayPublic();
		
		
		/*userId and displayPrivate() method is private, 
		 * so we can't access into another package or class 
		 * only we can access inside the same class 
		 */
		
//		l.userId = 123456L;
		
//		l.displayPrivate();
		
		
		/*
		 * booksName and displayDefault() method is default, 
		 * we can't access into another package, only
		 * we can access it within the same package
		 */
//		l.booksName = "Data Science";
//		l.displayDefault();
		

	}

}
