import java.sql.Connection;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class DbDevExam5_Update{
	public static void main(String[] args) {
		Connection connection;
	    ProductDao productDao;
	    Integer searchProductId = 101;
	    String updateProductName = "シャープペンシル";
//	    String updateProductName = "鉛筆";
	    Integer updatePrice = 70;
	    
	    connection = DbUtil.getConnection();
	    
	    productDao = new ProductDao(connection);
	    
	    System.out.println("変更前");
	    output(productDao.fintdByProductId(searchProductId));
        
        Product product = new Product(searchProductId,updateProductName,updatePrice);
	    
	    productDao.update(product);
	    
	    System.out.println("変更前");
	    output(productDao.fintdByProductId(searchProductId));
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