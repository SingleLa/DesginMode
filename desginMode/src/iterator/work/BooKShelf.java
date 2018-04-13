package iterator.work;

public class BooKShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	public BooKShelf(int maxSize) {		
		this.books = new Book[maxSize];
	}
	public void append(Book book){
		this.books[last] = book;
		this.last++;
	}
	public Book getBookAt(int index){
		return books[index];
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
