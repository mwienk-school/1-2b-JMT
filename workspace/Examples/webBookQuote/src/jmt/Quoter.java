package jmt;

import java.util.HashMap;
import java.util.Map;

public class Quoter {
	private Map<String,Double> books;
	
	public Quoter() {
		books = new HashMap<String,Double>();
    	books.put("1", 10.0);
    	books.put("2", 45.0);
    	books.put("3", 20.0);
    	books.put("4", 35.0);
    	books.put("5", 50.0);
	}
	
    public double getBookPrice(String isbn) {
    	if (books.containsKey(isbn))
        	return books.get(isbn);
        else
        	return 0.0;
    }
}
