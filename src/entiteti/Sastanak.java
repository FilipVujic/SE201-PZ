package entiteti;

/***********************************************************************
 * Module:  Sastanak.java
 * Author:  Filip
 * Purpose: Defines the Class Sastanak
 ***********************************************************************/

import java.util.*;

/** @pdOid d196d041-494a-49c2-9ee7-cfdf885d761f */
public class Sastanak {
   /** @pdOid 67e75c3e-e546-42c0-b371-8dd6dd305de8 */
   private java.util.Date datumSastanka;
   /** @pdOid 6390c1be-978e-4da1-9bfc-4e4a4dabc674 */
   private String nazivSastanka;
   /** @pdOid 38bb94c9-2346-4ee4-8e30-c536142c0c58 */
   private String tipSastanka;
   /** @pdOid 976a1c5e-826d-4ef9-8944-3132289bc887 */
   private String agendaSastanka;
   /** @pdOid f4ced8f2-c216-451b-81fe-9d0516e65df7 */
   private String ucesniciSastanka;
   
   /** @pdRoleInfo migr=no name=Korisnik assc=association8 mult=1..* */
   public Korisnik[] korisnik;
   
   /** @pdOid b3e4c1e6-3c64-4734-b110-c4a59893b745 */
   public java.lang.Object sastanak() {
      // TODO: implement
      return null;
   }

}