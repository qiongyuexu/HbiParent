package hbi.core.apply.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
@ExtensionAttribute(disable=true)
@Table(name = "z_vacation_apply")
public class VacationApply extends BaseDTO {

     public static final String FIELD_ID = "id";
     public static final String FIELD_BUSINESS_KEY = "businessKey";
     public static final String FIELD_USER = "user";
     public static final String FIELD_TYPE = "type";
     public static final String FIELD_STARTTIME = "starttime";
     public static final String FIELD_ENDTIME = "endtime";
     public static final String FIELD_REASON = "reason";


     @Id
     @GeneratedValue
     private Long id;

     @NotEmpty
     @Length(max = 255)
     private String businessKey;

     @NotEmpty
     @Length(max = 255)
     private String user;

     @NotEmpty
     @Length(max = 30)
     private String type;

     private Date starttime;

     private Date endtime;

     @Length(max = 255)
     private String reason;


     public void setId(Long id){
         this.id = id;
     }

     public Long getId(){
         return id;
     }

     public void setBusinessKey(String businessKey){
         this.businessKey = businessKey;
     }

     public String getBusinessKey(){
         return businessKey;
     }

     public void setUser(String user){
         this.user = user;
     }

     public String getUser(){
         return user;
     }

     public void setType(String type){
         this.type = type;
     }

     public String getType(){
         return type;
     }

     public void setStarttime(Date starttime){
         this.starttime = starttime;
     }

     public Date getStarttime(){
         return starttime;
     }

     public void setEndtime(Date endtime){
         this.endtime = endtime;
     }

     public Date getEndtime(){
         return endtime;
     }

     public void setReason(String reason){
         this.reason = reason;
     }

     public String getReason(){
         return reason;
     }

     }
