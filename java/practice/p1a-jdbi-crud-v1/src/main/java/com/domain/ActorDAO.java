package com.domain;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface ActorDAO {

   @SqlQuery("SELECT * FROM ACTOR;")
   @Mapper(ActorMapper.class)
   List<Actor> listActors();

   @SqlQuery("SELECT * FROM ACTOR WHERE ACTOR_ID = :actorId;")
   @Mapper(ActorMapper.class)
   Actor findActor(@Bind("actorId") int actorId);

   @SqlQuery("SELECT * FROM ACTOR WHERE FIRST_NAME = :firstName;")
   @Mapper(ActorMapper.class)
   Actor findActorByName(@Bind("firstName") String firstName);

   @SqlUpdate("INSERT INTO ACTOR(FIRST_NAME, LAST_NAME, LAST_UPDATE) VALUES (:firstName, :lastName, :lastUpdate);")
   int insertActor(@Bind("firstName") String firstName, @Bind("lastName") String lastName, @Bind("lastUpdate") String lastUpdate ); //ADD ALL THE OTHER FIELDS

   @SqlUpdate("UPDATE ACTOR SET FIRST_NAME = :firstName, LAST_UPDATE = :lastUpdate WHERE ACTOR_ID = :actorId;")
   int updateActorFirstName(@Bind("firstName") String firstName, @Bind("lastUpdate") String lastUpdate, @Bind("actorId") int actorId);

   @SqlUpdate("UPDATE ACTOR SET LAST_NAME = :lastName, LAST_UPDATE = :lastUpdate WHERE ACTOR_ID = :actorId;")
   int updateActorLastName(@Bind("lastName") String lastName,  @Bind("lastUpdate") String lastUpdate, @Bind("actorId") int actorId);

   @SqlUpdate("DELETE FROM ACTOR WHERE ACTOR_ID = :actorId")
   int deleteActor(@Bind("actorId") int actorId);
}
