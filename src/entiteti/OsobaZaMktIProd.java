package entiteti;

/***********************************************************************
 * Module:  OsobaZaMktIProd.java
 * Author:  Filip
 * Purpose: Defines the Class OsobaZaMktIProd
 ***********************************************************************/

import java.util.*;

/** @pdOid 65078e12-553b-4e0d-941e-5bb34fe93c22 */
public class OsobaZaMktIProd extends Korisnik {
   /** @pdRoleInfo migr=no name=Stejkholder assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Stejkholder> stejkholder;
   
   
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