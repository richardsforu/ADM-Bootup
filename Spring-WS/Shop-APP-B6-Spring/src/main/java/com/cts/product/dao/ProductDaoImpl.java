package com.cts.product.dao;

import org.springframework.stereotype.Repository;

// dao logic
//dependency
@Repository
public class ProductDaoImpl implements ProductDao {

	public ProductDaoImpl() {
		System.out.println("-- ProductdaoImpl obj created..");
	}

	@Override
	public double getItemPrice(int itemCode) {
		// code to fetch item price from database for given itemCode
		return 100.00;

	}

}
