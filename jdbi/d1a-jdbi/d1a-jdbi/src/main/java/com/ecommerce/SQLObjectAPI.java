package com.ecommerce;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

public class SQLObjectAPI {
   public static void main(String[] args) {
      try {
         // Loading the driver
         Class.forName("com.mysql.cj.jdbc.Driver");
         // Create a DBI which directly uses the DriverManager
         DBI dbi = new DBI("jdbc:mysql://localhost:3306/ecommerce?allowPublicKeyRetrieval=true&useSSL=false", "root",
               "mysql");

      //   ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      //   List<Product> productList = productDAO.productList();
      //   System.out.println(productList);

      // short hand
      System.out.println(dbi.onDemand(ProductDAO.class).productList());
      } catch (ClassNotFoundException e) {
         System.out.println("Error Connecting to Database!" + e);
      }
   }
}

