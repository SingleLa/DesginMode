package iterator;


public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		super();
		this.books = new Book[maxSize];
		
	}
	public Book getBookAt(int index){
		return books[index];
	}
	public void addBook(Book book){
		books[last] = book;
		last++;
	}
	public int getLength(){
		return last;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
