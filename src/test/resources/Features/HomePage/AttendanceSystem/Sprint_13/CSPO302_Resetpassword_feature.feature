
@Resetpassowrd
Feature: As a user, I want to be able to click on the unique reset password link 
         through my email, so that I can reset my password
 


  @validpassworword_verification
  Scenario Outline: TC_CSPO302_01 User want to reset password ,by entering valid old 
      and valid new passowrd
 
       Given User is password resert page
       When  User enters "<new_password>" and "<confirmnew_password>"
       Then Verify if the password is rest by login in CSPO portal

   Examples: 
      |new_password      | confirmnew_password|
      | QAfdmgroup1234!  |  QAfdmgroup1234!    | 

  
  
  
  @Invalidpassworword_verification    
  Scenario Outline: TC_CSPO302_02 Verify User is not able to reset password ,by entering invalid old 
      and invalid new passowrd
    
    
      Given User is password resert page
      When  User enters "<invalid_new_password>" and "<invalid_confirmnew_password>"
      Then Verify if the password is rest by login in CSPO portal

   Examples: 
      |new_password     | confirmnew_password|
      | Fdmgrup12345!   |Fdmgroup2345!       |
      | QAfadmgroup!    |QAfadmgroup!        | 
      | fadmgroup!      |fadmgroup!          |