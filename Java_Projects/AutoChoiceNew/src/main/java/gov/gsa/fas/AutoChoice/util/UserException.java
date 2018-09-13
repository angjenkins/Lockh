package gov.gsa.fas.AutoChoice.util;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class UserException extends Exception
{
  public int userExType, userExCategoty, userExSubCategory, userExStructure;
  public String userExDetail, userExMsg;


  public UserException(){};
  
  public UserException (int userExType, String userExDetail)
  {
      this.userExType   = userExType;
      this.userExDetail = userExDetail;
      this.userExMsg 	= userExDetail;
  }

  public UserException (int userExType, String userExDetail, String userExMsg)
  {
    this.userExType   = userExType;
    this.userExDetail = userExDetail;
    this.userExMsg    = userExMsg;
    System.out.println("User Exception message 2 :" + this.userExType + " " 
  		  + " " + this.userExDetail + " " + this.userExMsg + " Time: " + new Date());
  }

  public UserException (int userExType, String userExDetail, String userExMsg, int userExStructure, int userExCategoty)
  {
    this.userExType      = userExType;
    this.userExDetail    = userExDetail;
    this.userExMsg       = userExMsg;
    this.userExCategoty  = userExCategoty;
    this.userExStructure = userExStructure;
    System.out.println("User Exception message 3 :" + this.userExType + " " 
    		  + " " + this.userExDetail + " " + this.userExMsg + " "
    		  + " " + this.userExCategoty + " " + this.userExStructure + " Time: " + new Date());
  }

  public String getUserExDetail()
       {
            return (userExDetail);
       }

  public String getUserExMsg()
  {
        return (userExMsg);
  }

  public int getUserExType()
  {
       return (userExType);
  }

  public int getUserExCategoty()
  {
         return (userExCategoty);
  }

  public int getUserExStructure()
  {
       return (userExStructure);
  }


}
