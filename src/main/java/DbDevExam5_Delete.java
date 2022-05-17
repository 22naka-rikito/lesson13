import java.sql.Connection;
import java.util.List;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbDevExam5_Delete{
	public static void main(String[] args) {
		Connection connection;
	    ProductDao productDao;
	    String updateProductName = "シャーペン";
	    
	    connection = DbUtil.getConnection();
	    
	    productDao = new ProductDao(connection);
	    productDao.delete(updateProductName);
	    
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
	
	public static void output(Product product) {
		System.out.print("product_id:");
        System.out.print(product.getProductId());
        System.out.print(",product_name:");
        System.out.print(product.getProductName());
        System.out.print(",price:");
        System.out.println(product.getprice());
	}
}