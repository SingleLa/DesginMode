package iterator;

public class BookShelfIterator implements Iterator{
	private BookShelf bookshelf;
	private int index;
	
	
	public BookShelfIterator(BookShelf bookshelf) {		
		this.bookshelf = bookshelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < bookshelf.getLength()){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}

}
