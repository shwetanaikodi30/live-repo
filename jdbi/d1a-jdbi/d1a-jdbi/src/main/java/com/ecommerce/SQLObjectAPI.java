package com.ecommerce;

import org.skife.jdbi.v2.DBI;

public class SQLObjectAPI {
   public static void main(String[] args) {
      // insertProduct();
      //updateProduct();
      deleteProduct();
      displayProducts();
   }

   private static void displayProducts() {
      // try {
      // Loading the driver
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // Create a DBI which directly uses the DriverManager
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/ecommerce?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");

      // ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      // List<Product> productList = productDAO.productList();
      // System.out.println("LIST OF OBJECTS : " + productList);
      // System.out.println("ARRAY OF OBJECTS ");
      // Product[] product = productList.toArray(new Product[productList.size()]);
      // for (Product product1 : productList) {
      // System.out.println(product1);
      // }

      // short hand
      System.out.println(dbi.onDemand(ProductDAO.class).productList());
      // } catch (Exception e) {
      // System.out.println("Error Connecting to Database!" + e);
      // }
   }

   private static void insertProduct() {
      // try {
      // Loading the driver
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // Create a DBI which directly uses the DriverManager
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/ecommerce?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      // int retval = productDAO.insertProduct(105, "The Power Of Habit", 700);
      int rowsInserted = productDAO.insertProduct(106, "The Power Of Now", 700);
      System.out.println("No of Rows Inserted : " + rowsInserted);
   }

   private static void updateProduct() {
      // try {
      // Loading the driver
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // Create a DBI which directly uses the DriverManager
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/ecommerce?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      int rowsUpdated = productDAO.updateProduct(100, "START WITH WHY NOT?");
      System.out.println("No of Rows Updated : " + rowsUpdated);
   }

   private static void deleteProduct() {
      // try {
      // Loading the driver
      // Class.forName("com.mysql.cj.jdbc.Driver");
      // Create a DBI which directly uses the DriverManager
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/ecommerce?allowPublicKeyRetrieval=true&useSSL=false", "root",
            "mysql");
      ProductDAO productDAO = dbi.onDemand(ProductDAO.class);
      int rowsDeleted = productDAO.deleteProduct(100);
      System.out.println("No of Rows Deleted : " + rowsDeleted);
   }
}
