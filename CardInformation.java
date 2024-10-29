 /**
  * @ Brittney Oeur
  * @ June 7, 2019
  */

// ONLY ACCEPT VISA CREDIT CARD NETWORKS:
// Visa only has 16 numbers

public class CardInformation {
   private String fullName;
   private String totalDigits;
   private int expireMonth;
   private int expireYear;
   private int securityCode;
   
   public CardInformation() {
      fullName = "none";
      totalDigits = "none";
      expireMonth = 0;
      expireYear = 0;
      securityCode = 0;
   }
   
   public void setName(String Name) {
      fullName = Name;
   }
   
   public void setNumber(String Number) {
      totalDigits = Number;
   }
   
   public void setExpMonth(int Month) {
      expireMonth = Month;
   }
   
   public void setExpYear(int Year) {
      expireYear = Year;
   }
   
   public void setCode(int Code) {
      securityCode = Code;
   }
}

