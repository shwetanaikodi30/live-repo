package com.delms.persistence;
import org.skife.jdbi.v2.DBI;;

/**
 */
public class DbConnection {
  /**
   * Connecting to MYSQL DB.
   * @return database Connection.
   */
  public final DBI getConnect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      // String dbc = System.getenv("DB_CONNECTION");
      // if (dbc == null || dbc.equals("")) {
      //   dbc = "localhost:3306";
      // }
      // DBI dbi = new DBI("jdbc:mysql://" + dbc + "/MLPXX?allowPublicKeyRetrieval=true&useSSL=false", "MLPXX", "MLPXX");
      DBI dbi = new DBI("jdbc:mysql://localhost:3306/MLPXX?allowPublicKeyRetrieval=true&useSSL=false", "MLPXX", "MLPXX");

      //DBI dbi = new DBI("jdbc:mysql://" + dbc + "/MLPXX?useSSL=false", "MLPXX", "MLPXX");
      // dbi.setSQLLog(new PrintStreamLog());
      return dbi;
    } catch (ClassNotFoundException e) {
      //return null;
      throw new RuntimeException(e);
    }
  }
}

