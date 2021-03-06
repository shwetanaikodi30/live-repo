package com.domain;

public class Actor {

   private int actorId;
   private String actorFirstName;
   private String actorLastName;
   private String actorLastUpdate;

   public Actor(){

   }

   public Actor(int actorId, String actorFirstName, String actorLastName, String actorLastUpdate) {
      this.actorId = actorId;
      this.actorFirstName = actorFirstName;
      this.actorLastName = actorLastName;
      this.actorLastUpdate = actorLastUpdate;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((actorFirstName == null) ? 0 : actorFirstName.hashCode());
      result = prime * result + actorId;
      result = prime * result + ((actorLastName == null) ? 0 : actorLastName.hashCode());
      result = prime * result + ((actorLastUpdate == null) ? 0 : actorLastUpdate.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Actor other = (Actor) obj;
      if (actorFirstName == null) {
         if (other.actorFirstName != null)
            return false;
      } else if (!actorFirstName.equals(other.actorFirstName))
         return false;
      if (actorId != other.actorId)
         return false;
      if (actorLastName == null) {
         if (other.actorLastName != null)
            return false;
      } else if (!actorLastName.equals(other.actorLastName))
         return false;
      if (actorLastUpdate == null) {
         if (other.actorLastUpdate != null)
            return false;
      } else if (!actorLastUpdate.equals(other.actorLastUpdate))
         return false;
      return true;
   }

   public int getActorId() {
      return actorId;
   }

   public void setActorId(int actorId) {
      this.actorId = actorId;
   }

   public String getActorFirstName() {
      return actorFirstName;
   }

   public void setActorFirstName(String actorFirstName) {
      this.actorFirstName = actorFirstName;
   }

   public String getActorLastName() {
      return actorLastName;
   }

   public void setActorLastName(String actorLastName) {
      this.actorLastName = actorLastName;
   }

   public String getActorLastUpdate() {
      return actorLastUpdate;
   }

   public void setActorLastUpdate(String actorLastUpdate) {
      this.actorLastUpdate = actorLastUpdate;
   }

   @Override
   public String toString() {
      return actorId + "\t" + actorFirstName + "\t" + actorLastName
            + "\t" + actorLastUpdate;
   }

}
