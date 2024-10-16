package com.mycompany.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author bbotelho42
 */
public class User extends Person{
  private String userName;
  private String password;
  private String role;

  public User(String name, String email, String tel, String userName, String password){ // nome, email y telefono
    super(name, email, userName);
    this.userName = userName;
    this.password = password;
}
  
  public User(int idPerson, String name, String email, String tel, boolean isIndividualPerson, LocalDate startDate,
      LocalDate deactivationDate, boolean active, String userName, String password, String role) {
    super(idPerson, name, email, tel, isIndividualPerson, startDate, deactivationDate, active);
    this.userName = userName;
    this.password = password;
    this.role = role;
  }
  public User(String userName, String password, String role) {
    this.userName = userName;
    this.password = password;
    this.role = role;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  @Override

  public String toString(){
    return 
          "\nInformacion usuario:\n---------------------"+
          "UserName: "+getUserName()+"\n"+
          "Rol: "+getRole()+"\n";
  }
  
  
}