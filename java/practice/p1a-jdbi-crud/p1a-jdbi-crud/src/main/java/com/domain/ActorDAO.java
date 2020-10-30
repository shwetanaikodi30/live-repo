package com.domain;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;

public interface ActorDAO {
   List<Actor> listActors();
   Actor findActor(@Bind("empID") int actorID);
   Actor findActorByName(@Bind("firstName") String firstName);
   int insertActor(@Bind("actorID") int actorID); //ADD ALL THE OTHER PARAMS
   int updateActor(); //ADD THE NECESSARY PARAMS
   int deleteActor(); //ADD THE NECESSARY PARAMS
}
