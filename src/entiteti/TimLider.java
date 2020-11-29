package entiteti;

/***********************************************************************
 * Module:  TimLider.java
 * Author:  Filip
 * Purpose: Defines the Class TimLider
 ***********************************************************************/

import java.util.*;

/** @pdOid 5a4896e1-863a-4339-9eec-7aec61e23861 */
public class TimLider extends Korisnik {
   /** @pdRoleInfo migr=no name=Tim assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Tim> tim;
   /** @pdRoleInfo migr=no name=Beleske assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Beleske> beleske;
   /** @pdRoleInfo migr=no name=StavkaBudzeta assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<StavkaBudzeta> stavkaBudzeta;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tim> getTim() {
      if (tim == null)
         tim = new java.util.HashSet<Tim>();
      return tim;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTim() {
      if (tim == null)
         tim = new java.util.HashSet<Tim>();
      return tim.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTim */
   public void setTim(java.util.Collection<Tim> newTim) {
      removeAllTim();
      for (java.util.Iterator iter = newTim.iterator(); iter.hasNext();)
         addTim((Tim)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTim */
   public void addTim(Tim newTim) {
      if (newTim == null)
         return;
      if (this.tim == null)
         this.tim = new java.util.HashSet<Tim>();
      if (!this.tim.contains(newTim))
         this.tim.add(newTim);
   }
   
   /** @pdGenerated default remove
     * @param oldTim */
   public void removeTim(Tim oldTim) {
      if (oldTim == null)
         return;
      if (this.tim != null)
         if (this.tim.contains(oldTim))
            this.tim.remove(oldTim);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTim() {
      if (tim != null)
         tim.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Beleske> getBeleske() {
      if (beleske == null)
         beleske = new java.util.HashSet<Beleske>();
      return beleske;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBeleske() {
      if (beleske == null)
         beleske = new java.util.HashSet<Beleske>();
      return beleske.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBeleske */
   public void setBeleske(java.util.Collection<Beleske> newBeleske) {
      removeAllBeleske();
      for (java.util.Iterator iter = newBeleske.iterator(); iter.hasNext();)
         addBeleske((Beleske)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBeleske */
   public void addBeleske(Beleske newBeleske) {
      if (newBeleske == null)
         return;
      if (this.beleske == null)
         this.beleske = new java.util.HashSet<Beleske>();
      if (!this.beleske.contains(newBeleske))
         this.beleske.add(newBeleske);
   }
   
   /** @pdGenerated default remove
     * @param oldBeleske */
   public void removeBeleske(Beleske oldBeleske) {
      if (oldBeleske == null)
         return;
      if (this.beleske != null)
         if (this.beleske.contains(oldBeleske))
            this.beleske.remove(oldBeleske);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBeleske() {
      if (beleske != null)
         beleske.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<StavkaBudzeta> getStavkaBudzeta() {
      if (stavkaBudzeta == null)
         stavkaBudzeta = new java.util.HashSet<StavkaBudzeta>();
      return stavkaBudzeta;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStavkaBudzeta() {
      if (stavkaBudzeta == null)
         stavkaBudzeta = new java.util.HashSet<StavkaBudzeta>();
      return stavkaBudzeta.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStavkaBudzeta */
   public void setStavkaBudzeta(java.util.Collection<StavkaBudzeta> newStavkaBudzeta) {
      removeAllStavkaBudzeta();
      for (java.util.Iterator iter = newStavkaBudzeta.iterator(); iter.hasNext();)
         addStavkaBudzeta((StavkaBudzeta)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStavkaBudzeta */
   public void addStavkaBudzeta(StavkaBudzeta newStavkaBudzeta) {
      if (newStavkaBudzeta == null)
         return;
      if (this.stavkaBudzeta == null)
         this.stavkaBudzeta = new java.util.HashSet<StavkaBudzeta>();
      if (!this.stavkaBudzeta.contains(newStavkaBudzeta))
         this.stavkaBudzeta.add(newStavkaBudzeta);
   }
   
   /** @pdGenerated default remove
     * @param oldStavkaBudzeta */
   public void removeStavkaBudzeta(StavkaBudzeta oldStavkaBudzeta) {
      if (oldStavkaBudzeta == null)
         return;
      if (this.stavkaBudzeta != null)
         if (this.stavkaBudzeta.contains(oldStavkaBudzeta))
            this.stavkaBudzeta.remove(oldStavkaBudzeta);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStavkaBudzeta() {
      if (stavkaBudzeta != null)
         stavkaBudzeta.clear();
   }

}