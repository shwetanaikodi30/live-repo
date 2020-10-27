package com.ecommerce;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

interface ProductDAO {
   @SqlQuery("SELECT * FROM PRODUCTS")
   @Mapper(ProductMapper.class)
   List<Product> productList();
}