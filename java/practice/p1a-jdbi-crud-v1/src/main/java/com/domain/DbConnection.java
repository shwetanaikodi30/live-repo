package com.domain;

import org.skife.jdbi.v2.DBI;
public class DbConnection {
  public final DBI getConnect() {

      try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        final DBI dbi = new DBI("jdbc:mysql://localhost:3306/sakiladb?allowPublicKeyRetrieval=true&useSSL=false", "root",
                    "mysql");
        return dbi;
      } catch (ClassNotFoundException e) {
          System.out.println("DB Connection Failed.");
          throw new RuntimeException();
      }
  }
}
