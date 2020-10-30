package com.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class ActorMapper implements ResultSetMapper<Actor> {

   @Override
   public Actor map(int index, ResultSet r, StatementContext ctx) throws SQLException {

      return new Actor(r.getInt("ACTOR_ID"), r.getString("FIRST_NAME"), r.getString("LAST_NAME"), r.getString("LAST_UPDATE"));
   }

   //IMPLEMENT STUFF
}
