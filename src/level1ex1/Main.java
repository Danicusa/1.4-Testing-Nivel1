package level1ex1;

public class Main {

	public static void main(String[] args) {
		
		Library lib1 = new Library();
		
		//lib1.addNewBookToCollection();
		//lib1.addNewBookToCollection();
		
		System.out.println(lib1.bookCollection.get(0).toString());
		System.out.println(lib1.bookCollection.get(1).toString());
	}

}
