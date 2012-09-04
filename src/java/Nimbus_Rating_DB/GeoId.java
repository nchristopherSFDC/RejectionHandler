package Nimbus_Rating_DB;
// Generated 17-Oct-2011 13:36:04 by Hibernate Tools 3.2.1.GA



/**
 * GeoId generated by hbm2java
 */
public class GeoId  implements java.io.Serializable {


     private String numbertype;
     private Integer daytimeCalls;
     private Double daytimeDuration;
     private Double daytimeRevenue;
     private Integer eveningCalls;
     private Double eveningDuration;
     private Double eveningRevenue;
     private Integer wkdCalls;
     private Double wkdDuration;
     private Double wkdRevenue;
     private Integer totalCalls;
     private Double totalDuration;
     private Double totalRevenue;

    public GeoId() {
    }

    public GeoId(String numbertype, Integer daytimeCalls, Double daytimeDuration, Double daytimeRevenue, Integer eveningCalls, Double eveningDuration, Double eveningRevenue, Integer wkdCalls, Double wkdDuration, Double wkdRevenue, Integer totalCalls, Double totalDuration, Double totalRevenue) {
       this.numbertype = numbertype;
       this.daytimeCalls = daytimeCalls;
       this.daytimeDuration = daytimeDuration;
       this.daytimeRevenue = daytimeRevenue;
       this.eveningCalls = eveningCalls;
       this.eveningDuration = eveningDuration;
       this.eveningRevenue = eveningRevenue;
       this.wkdCalls = wkdCalls;
       this.wkdDuration = wkdDuration;
       this.wkdRevenue = wkdRevenue;
       this.totalCalls = totalCalls;
       this.totalDuration = totalDuration;
       this.totalRevenue = totalRevenue;
    }
   
    public String getNumbertype() {
        return this.numbertype;
    }
    
    public void setNumbertype(String numbertype) {
        this.numbertype = numbertype;
    }
    public Integer getDaytimeCalls() {
        return this.daytimeCalls;
    }
    
    public void setDaytimeCalls(Integer daytimeCalls) {
        this.daytimeCalls = daytimeCalls;
    }
    public Double getDaytimeDuration() {
        return this.daytimeDuration;
    }
    
    public void setDaytimeDuration(Double daytimeDuration) {
        this.daytimeDuration = daytimeDuration;
    }
    public Double getDaytimeRevenue() {
        return this.daytimeRevenue;
    }
    
    public void setDaytimeRevenue(Double daytimeRevenue) {
        this.daytimeRevenue = daytimeRevenue;
    }
    public Integer getEveningCalls() {
        return this.eveningCalls;
    }
    
    public void setEveningCalls(Integer eveningCalls) {
        this.eveningCalls = eveningCalls;
    }
    public Double getEveningDuration() {
        return this.eveningDuration;
    }
    
    public void setEveningDuration(Double eveningDuration) {
        this.eveningDuration = eveningDuration;
    }
    public Double getEveningRevenue() {
        return this.eveningRevenue;
    }
    
    public void setEveningRevenue(Double eveningRevenue) {
        this.eveningRevenue = eveningRevenue;
    }
    public Integer getWkdCalls() {
        return this.wkdCalls;
    }
    
    public void setWkdCalls(Integer wkdCalls) {
        this.wkdCalls = wkdCalls;
    }
    public Double getWkdDuration() {
        return this.wkdDuration;
    }
    
    public void setWkdDuration(Double wkdDuration) {
        this.wkdDuration = wkdDuration;
    }
    public Double getWkdRevenue() {
        return this.wkdRevenue;
    }
    
    public void setWkdRevenue(Double wkdRevenue) {
        this.wkdRevenue = wkdRevenue;
    }
    public Integer getTotalCalls() {
        return this.totalCalls;
    }
    
    public void setTotalCalls(Integer totalCalls) {
        this.totalCalls = totalCalls;
    }
    public Double getTotalDuration() {
        return this.totalDuration;
    }
    
    public void setTotalDuration(Double totalDuration) {
        this.totalDuration = totalDuration;
    }
    public Double getTotalRevenue() {
        return this.totalRevenue;
    }
    
    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GeoId) ) return false;
		 GeoId castOther = ( GeoId ) other; 
         
		 return ( (this.getNumbertype()==castOther.getNumbertype()) || ( this.getNumbertype()!=null && castOther.getNumbertype()!=null && this.getNumbertype().equals(castOther.getNumbertype()) ) )
 && ( (this.getDaytimeCalls()==castOther.getDaytimeCalls()) || ( this.getDaytimeCalls()!=null && castOther.getDaytimeCalls()!=null && this.getDaytimeCalls().equals(castOther.getDaytimeCalls()) ) )
 && ( (this.getDaytimeDuration()==castOther.getDaytimeDuration()) || ( this.getDaytimeDuration()!=null && castOther.getDaytimeDuration()!=null && this.getDaytimeDuration().equals(castOther.getDaytimeDuration()) ) )
 && ( (this.getDaytimeRevenue()==castOther.getDaytimeRevenue()) || ( this.getDaytimeRevenue()!=null && castOther.getDaytimeRevenue()!=null && this.getDaytimeRevenue().equals(castOther.getDaytimeRevenue()) ) )
 && ( (this.getEveningCalls()==castOther.getEveningCalls()) || ( this.getEveningCalls()!=null && castOther.getEveningCalls()!=null && this.getEveningCalls().equals(castOther.getEveningCalls()) ) )
 && ( (this.getEveningDuration()==castOther.getEveningDuration()) || ( this.getEveningDuration()!=null && castOther.getEveningDuration()!=null && this.getEveningDuration().equals(castOther.getEveningDuration()) ) )
 && ( (this.getEveningRevenue()==castOther.getEveningRevenue()) || ( this.getEveningRevenue()!=null && castOther.getEveningRevenue()!=null && this.getEveningRevenue().equals(castOther.getEveningRevenue()) ) )
 && ( (this.getWkdCalls()==castOther.getWkdCalls()) || ( this.getWkdCalls()!=null && castOther.getWkdCalls()!=null && this.getWkdCalls().equals(castOther.getWkdCalls()) ) )
 && ( (this.getWkdDuration()==castOther.getWkdDuration()) || ( this.getWkdDuration()!=null && castOther.getWkdDuration()!=null && this.getWkdDuration().equals(castOther.getWkdDuration()) ) )
 && ( (this.getWkdRevenue()==castOther.getWkdRevenue()) || ( this.getWkdRevenue()!=null && castOther.getWkdRevenue()!=null && this.getWkdRevenue().equals(castOther.getWkdRevenue()) ) )
 && ( (this.getTotalCalls()==castOther.getTotalCalls()) || ( this.getTotalCalls()!=null && castOther.getTotalCalls()!=null && this.getTotalCalls().equals(castOther.getTotalCalls()) ) )
 && ( (this.getTotalDuration()==castOther.getTotalDuration()) || ( this.getTotalDuration()!=null && castOther.getTotalDuration()!=null && this.getTotalDuration().equals(castOther.getTotalDuration()) ) )
 && ( (this.getTotalRevenue()==castOther.getTotalRevenue()) || ( this.getTotalRevenue()!=null && castOther.getTotalRevenue()!=null && this.getTotalRevenue().equals(castOther.getTotalRevenue()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNumbertype() == null ? 0 : this.getNumbertype().hashCode() );
         result = 37 * result + ( getDaytimeCalls() == null ? 0 : this.getDaytimeCalls().hashCode() );
         result = 37 * result + ( getDaytimeDuration() == null ? 0 : this.getDaytimeDuration().hashCode() );
         result = 37 * result + ( getDaytimeRevenue() == null ? 0 : this.getDaytimeRevenue().hashCode() );
         result = 37 * result + ( getEveningCalls() == null ? 0 : this.getEveningCalls().hashCode() );
         result = 37 * result + ( getEveningDuration() == null ? 0 : this.getEveningDuration().hashCode() );
         result = 37 * result + ( getEveningRevenue() == null ? 0 : this.getEveningRevenue().hashCode() );
         result = 37 * result + ( getWkdCalls() == null ? 0 : this.getWkdCalls().hashCode() );
         result = 37 * result + ( getWkdDuration() == null ? 0 : this.getWkdDuration().hashCode() );
         result = 37 * result + ( getWkdRevenue() == null ? 0 : this.getWkdRevenue().hashCode() );
         result = 37 * result + ( getTotalCalls() == null ? 0 : this.getTotalCalls().hashCode() );
         result = 37 * result + ( getTotalDuration() == null ? 0 : this.getTotalDuration().hashCode() );
         result = 37 * result + ( getTotalRevenue() == null ? 0 : this.getTotalRevenue().hashCode() );
         return result;
   }   


}

