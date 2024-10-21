package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mycompany.ejercicio1.Utils.Methods;

public class Category {
  private int idCategory;
  private String categoryName;
  private List<Product> productList = new ArrayList<>();
  
  public Category(){}

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

  // Metodos Dinamicos
  public static void addProduct(){
    Scanner userScan = new Scanner(System.in);
    Methods.cleanScreen();
    Methods.putLine();
    Category newCategory = new Category();
    System.out.println("Añadir productos");
    Methods.putLine();
    System.out.print("Nombre de la categoria: ");
    newCategory.setCategoryName(userScan.nextLine());
    
    System.out.println("Producto añadido a la categoria!");
    userScan.close();
  }
  
  @Override
  public String toString() {
    return 
    "Id Categoria: "+getIdCategory()+"\n"+
    "Nombre Categoria: "+getCategoryName()+"\n"+
    "Lista de Productos: "+getProductList()+"\n";
  }
}
