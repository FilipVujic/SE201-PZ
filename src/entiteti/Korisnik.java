package entiteti;

/***********************************************************************
 * Module:  Korisnik.java
 * Author:  Filip
 * Purpose: Defines the Class Korisnik
 ***********************************************************************/

import java.util.*;
import lombok.Data;

/** @pdOid 12e07fc7-b396-40aa-a2ac-a07e41050baa */
@Data
public class Korisnik {
   /** @pdOid 48b210a3-f1dd-4729-99d1-0393d9270b96 */
   private String imeKorisnika;
   /** @pdOid 6a2c01a6-4380-404c-b4f9-ae3fb7a6eb32 */
   private String prezimeKorisnika;
   /** @pdOid 08888109-2c32-4063-9215-5a4bb108c624 */
   private String korisnickoIme;
   /** @pdOid e0039d4d-5e07-409b-8286-7fdc5451aea7 */
   private String korisnickaSifra;
   /** @pdOid 56f5e7dd-abfb-47d0-ae1f-84369afa8bc4 */
   private String emailKorisnika;
   
   /** @pdRoleInfo migr=no name=Zadatak assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Zadatak> zadatak;
   
   /** @pdOid bf48e696-7420-44f4-aca8-6b45ffcce664 */
   public java.lang.Object korisnik() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Zadatak> getZadatak() {
      if (zadatak == null)
         zadatak = new java.util.HashSet<Zadatak>();
      return zadatak;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorZadatak() {
      if (zadatak == null)
         zadatak = new java.util.HashSet<Zadatak>();
      return zadatak.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newZadatak */
   public void setZadatak(java.util.Collection<Zadatak> newZadatak) {
      removeAllZadatak();
      for (java.util.Iterator iter = newZadatak.iterator(); iter.hasNext();)
         addZadatak((Zadatak)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newZadatak */
   public void addZadatak(Zadatak newZadatak) {
      if (newZadatak == null)
         return;
      if (this.zadatak == null)
         this.zadatak = new java.util.HashSet<Zadatak>();
      if (!this.zadatak.contains(newZadatak))
         this.zadatak.add(newZadatak);
   }
   
   /** @pdGenerated default remove
     * @param oldZadatak */
   public void removeZadatak(Zadatak oldZadatak) {
      if (oldZadatak == null)
         return;
      if (this.zadatak != null)
         if (this.zadatak.contains(oldZadatak))
            this.zadatak.remove(oldZadatak);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllZadatak() {
      if (zadatak != null)
         zadatak.clear();
   }

}