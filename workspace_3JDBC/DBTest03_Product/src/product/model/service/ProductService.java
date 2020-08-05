package product.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import product.model.dao.ProductDao;
import product.model.vo.Product;

import static common.JDBCTemplate.*;

public class ProductService {
	public List<Product> selectAll(){
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		
		ArrayList<Product> res = dao.selectAll(con);
		close(con);
		return res;
	}

	public Product selectOne(String id) {
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		Product res = dao.selectOne(con, id);
		close(con);
		return res;
	}

	public int insert(Product insert) {
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		int res = dao.insert(con, insert);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

	public int update(Product update) {
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		int res = dao.update(con, update);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}

	public int delete(String did) {
		ProductDao dao = new ProductDao();
		Connection con = getConnection();
		int res = dao.delete(con, did);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}
	
	
	
	
	
	
	
	
	
}
