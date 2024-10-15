package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
  private int idStock;
  private List<Category> category = new ArrayList<>();

  
  public int getIdStock() {
    return idStock;
  }
 public Stock(int idStock, List<Category> category) {
  this.idStock = idStock;
  this.category = category;
}
 public void setIdStock(int idStock) {
    this.idStock = idStock;
  }
  public List<Category> getCategory() {
    return category;
  }
  public void setCategory(List<Category> category) {
    this.category = category;
  }
  }
