package com.ecommerce;

import java.util.List;
import java.util.Map;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.Query;

public class FluentAPI {
    public static void main(String[] args) {
        fluentAPI();
    }

    private static void fluentAPI() {
        // JDBI Fluent API
        // This represents a connection to the database system. It usually is a wrapper
        // around a JDBC Connection object.
        Handle handle = null;
        // Provides the access point for jDBI. Use it to obtain Handle instances.
        // Create a DBI which directly uses the DriverManager
        DBI dbi = new DBI("jdbc:mysql://localhost:3306/ecommerce?allowPublicKeyRetrieval=true&useSSL=false", "root",
                "mysql");
        String sql = "SELECT * FROM PRODUCTS";
        try {
            // Obtain a Handle to the data source wrapped by this DBI instance
            handle = dbi.open();
            // Return a default Query instance which can be executed later, as long as this
            // handle remains open.
            Query<Map<String, Object>> selectQuery = handle.createQuery(sql);
            // Executes the select and Will eagerly load all results
            List<Map<String, Object>> productsListOfMaps = selectQuery.list();
            // Display the products by iterating the list
            for (Map<String, Object> productMap : productsListOfMaps) {
                System.out.printf("%d ", productMap.get("PRODUCT_ID"));
                System.out.printf("%s ", productMap.get("PRODUCT_NAME"));
                System.out.println(productMap.get("PRICE"));
            }
        } finally {
            if (handle != null) {
                handle.close();
            }
        }
    }
}
