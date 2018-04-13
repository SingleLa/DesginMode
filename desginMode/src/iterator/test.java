package iterator;

public class test {
	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.addBook(new Book("��1��"));
		bookshelf.addBook(new Book("��2��"));
		bookshelf.addBook(new Book("��3��"));
		bookshelf.addBook(new Book("��4��"));
		Iterator it = bookshelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
			
		}
	}
}
