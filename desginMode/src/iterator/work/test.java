package iterator.work;



public class test {
	public static void main(String[] args) {
		BooKShelf bookshelf = new BooKShelf(4);
		bookshelf.append(new Book("��1��"));
		bookshelf.append(new Book("��2��"));
		bookshelf.append(new Book("��3��"));
		bookshelf.append(new Book("��4��"));
		Iterator it = bookshelf.iterator();
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
			
		}
	}
}
