import java.sql.Connection;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbDevExam5_Select{
	public static void main(String[] args) {
		Connection connection;
	    ProductDao productDao;
	    Integer searchProductId = 103;
	    
	    connection = DbUtil.getConnection();
	    
	    productDao = new ProductDao(connection);
	    
	    Product product = productDao.fintdByProductId(searchProductId);
	    
	    System.out.print("product_id:");
        System.out.print(product.getProductId());
        System.out.print(",product_name:");
        System.out.print(product.getProductName());
        System.out.print(",price:");
        System.out.println(product.getprice());
	    
	}
}