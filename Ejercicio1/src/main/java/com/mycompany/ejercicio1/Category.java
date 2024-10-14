package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Category {
  private int idCategory;
  private String categoryName;
  private List<Product> productList = new ArrayList<>();
  
  public int getIdCategory() {
    return idCategory;
  }
  public List<Product> getProductList() {
    return productList;
  }
  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }
  public void setIdCategory(int idCategory) {
    this.idCategory = idCategory;
  }
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  
  @Override
  public String toString() {
    return 
    "Id Categoria: "+getIdCategory()+"\n"+
    "Nombre Categoria: "+getCategoryName()+"\n"+
    "Lista de Productos: "+getProductList()+"\n";
  }
}
