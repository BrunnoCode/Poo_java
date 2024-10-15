package com.mycompany.ejercicio1;

import java.time.LocalDate;

public class Supplier extends Person {
  private Category category;

  public Supplier(int idPerson, String name, String email, String tel, boolean isIndividualPerson, LocalDate startDate,
      LocalDate deactivationDate, boolean active, Category category) {
    super(idPerson, name, email, tel, isIndividualPerson, startDate, deactivationDate, active);
    this.category = category;
  }

  public Supplier(Category category) {
    this.category = category;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
  
}
