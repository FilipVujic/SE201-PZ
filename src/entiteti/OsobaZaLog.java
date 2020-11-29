package entiteti;

/***********************************************************************
 * Module:  OsobaZaLog.java
 * Author:  Filip
 * Purpose: Defines the Class OsobaZaLog
 ***********************************************************************/

import java.util.*;

/** @pdOid 6d3521a1-0c7e-4d71-bf92-2e06b2429be3 */
public class OsobaZaLog extends Korisnik {
   /** @pdRoleInfo migr=no name=StavkaLogistike assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<StavkaLogistike> stavkaLogistike;
   /** @pdRoleInfo migr=no name=Stejkholder assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Stejkholder> stejkholder;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<StavkaLogistike> getStavkaLogistike() {
      if (stavkaLogistike == null)
         stavkaLogistike = new java.util.HashSet<StavkaLogistike>();
      return stavkaLogistike;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStavkaLogistike() {
      if (stavkaLogistike == null)
         stavkaLogistike = new java.util.HashSet<StavkaLogistike>();
      return stavkaLogistike.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStavkaLogistike */
   public void setStavkaLogistike(java.util.Collection<StavkaLogistike> newStavkaLogistike) {
      removeAllStavkaLogistike();
      for (java.util.Iterator iter = newStavkaLogistike.iterator(); iter.hasNext();)
         addStavkaLogistike((StavkaLogistike)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStavkaLogistike */
   public void addStavkaLogistike(StavkaLogistike newStavkaLogistike) {
      if (newStavkaLogistike == null)
         return;
      if (this.stavkaLogistike == null)
         this.stavkaLogistike = new java.util.HashSet<StavkaLogistike>();
      if (!this.stavkaLogistike.contains(newStavkaLogistike))
         this.stavkaLogistike.add(newStavkaLogistike);
   }
   
   /** @pdGenerated default remove
     * @param oldStavkaLogistike */
   public void removeStavkaLogistike(StavkaLogistike oldStavkaLogistike) {
      if (oldStavkaLogistike == null)
         return;
      if (this.stavkaLogistike != null)
         if (this.stavkaLogistike.contains(oldStavkaLogistike))
            this.stavkaLogistike.remove(oldStavkaLogistike);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStavkaLogistike() {
      if (stavkaLogistike != null)
         stavkaLogistike.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Stejkholder> getStejkholder() {
      if (stejkholder == null)
         stejkholder = new java.util.HashSet<Stejkholder>();
      return stejkholder;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStejkholder() {
      if (stejkholder == null)
         stejkholder = new java.util.HashSet<Stejkholder>();
      return stejkholder.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStejkholder */
   public void setStejkholder(java.util.Collection<Stejkholder> newStejkholder) {
      removeAllStejkholder();
      for (java.util.Iterator iter = newStejkholder.iterator(); iter.hasNext();)
         addStejkholder((Stejkholder)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStejkholder */
   public void addStejkholder(Stejkholder newStejkholder) {
      if (newStejkholder == null)
         return;
      if (this.stejkholder == null)
         this.stejkholder = new java.util.HashSet<Stejkholder>();
      if (!this.stejkholder.contains(newStejkholder))
         this.stejkholder.add(newStejkholder);
   }
   
   /** @pdGenerated default remove
     * @param oldStejkholder */
   public void removeStejkholder(Stejkholder oldStejkholder) {
      if (oldStejkholder == null)
         return;
      if (this.stejkholder != null)
         if (this.stejkholder.contains(oldStejkholder))
            this.stejkholder.remove(oldStejkholder);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStejkholder() {
      if (stejkholder != null)
         stejkholder.clear();
   }

}