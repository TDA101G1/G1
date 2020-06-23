package com.product.model;

import java.sql.Connection;
import java.util.List;

public interface ProductDetailDAO {
	public ProductDetailVO insert(ProductDetailVO ProductDetailVO, ProductVO productVO);
	public Integer update(ProductDetailVO productDetailVO);
	public Integer delete(String productDetail_ID);
	public ProductDetailVO select(String productDetail_ID);
	public List<ProductDetailVO> getAll();
	public String getPriceRange(String product_ID);
	public void updateWithStock(ProductDetailVO productDetailVO, java.sql.Connection con);
	void update2(ProductDetailVO productDetailVO, Connection con);
}
