// Program to demonstrate different access modifiers
package in.metbkc.library;

public class Library {
	
	// Different access modifiers
	public String libraryName;
	private long userId;
	private String bookName;
			
	
			// public method
			public void displayPublic()
			{
				System.out.println("LibraryName: " + libraryName);
				
			}
			
			// private method
			private void displayPrivate() 
			{
				System.out.println("UserID: " + userId);
			}
			
			// default method
			void displayDefault()
			{
				System.out.println("BookName is : "+ bookName);
			}
			

		

	}


