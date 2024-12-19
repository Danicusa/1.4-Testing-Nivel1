package level1ex1;

import java.util.Objects;

public class Book {
	String title;
	String editorial;
	
	public Book (String title, String editorial) {
		this.title = title;
		this.editorial = editorial;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getEditorial() {
		return this.editorial;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
	
	public String toString() {
		
		return "Book tittle: " + this.getTitle() + "\n Book editorial: " + this.getEditorial();
	}
}

