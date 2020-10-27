package com.ecommerce;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class ProductMapper implements ResultSetMapper<Product> {

   @Override
   public Product map(int index, ResultSet resultSet, StatementContext ctx) throws SQLException {
      int productId = resultSet.getInt("PRODUCT_ID");
      String productName = resultSet.getString("PRODUCT_NAME");
      int price = resultSet.getInt("PRICE");

      Product product = new Product(productId, productName, price);
      return product;
   }
   
}
