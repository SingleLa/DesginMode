package iterator.work;

public class BookShelfIterator implements Iterator{
	private BooKShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BooKShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override	
	public boolean hasNext() {
		if(index < bookShelf.getLength()){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
