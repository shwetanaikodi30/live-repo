package com.domain;

import java.util.List;

public class ActorService {



   private static ActorDAO dao(){
      final DbConnection db = new DbConnection();
      return db.getConnect().onDemand(ActorDAO.class);
   }


   public static Actor[] listAll() {
      final List<Actor> a = dao().listActors();
      return a.toArray(new Actor[a.size()]);
   }

   public static Actor listById(final int actorId) {
      Actor actor = null;
      actor =  dao().findActor(actorId);
      if(actor == null){
         // ActorNotFoundException actorNotFoundException = new ActorNotFoundException();
         ActorNotFoundException actorNotFoundException = new ActorNotFoundException("Actor Not found for Id : " + actorId);
         throw actorNotFoundException;
      }
      return actor;
   }

   public static Actor findByFirstName(final String firstName) {
      Actor actor = null;
      actor = dao().findActorByName(firstName);
      return actor;
   }

   public static int addActor(final String firstName, final String lastName, final String lastUpdate) {
      return dao().insertActor(firstName, lastName, lastUpdate);
   }

   public static int updateFirstName(final int actorId, final String firstName, final String lastUpdate) {
      return dao().updateActorFirstName(firstName, lastUpdate, actorId);
   }

   public static int updateLastName(final int actorId, final String lastName, final String lastUpdate)
   {
      return dao().updateActorLastName(lastName, lastUpdate, actorId);
   }


   public static int deleteActor(final int actorId) {
      return dao().deleteActor(actorId);
   }

}
