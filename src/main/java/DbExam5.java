import java.sql.Connection;
import java.util.List;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbExam5{
	public static void main(String[] args) {
		Connection connection;
	    ProductDao productDao;
	    
	    connection = DbUtil.getConnection();
	    
	    productDao = new ProductDao(connection);
	    Product addProduct = new Product("ボールペン",200);
	    
	    productDao.register(addProduct);
	    
	    List<Product> list = productDao.findAll();
	    
	    for (Product product : list) {
	    	System.out.print("product_id:");
            System.out.print(product.getProductId());
            System.out.print(",product_name:");
            System.out.print(product.getProductName());
            System.out.print(",price:");
            System.out.println(product.getprice());
        }
	}
}