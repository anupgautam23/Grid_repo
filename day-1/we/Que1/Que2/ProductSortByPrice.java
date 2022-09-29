package Day1_HashMap.Assignment.Que2;

import java.util.Comparator;

public class ProductSortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return o2.getProductPrice() - o1.getProductPrice() ;
	}

}
