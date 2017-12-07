/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

import java.util.ArrayList;

/**
 *
 * @author sulleynguyen
 */
public class Category {
    private int codeCat;
    private String categoryName;
    private ArrayList<Product> listProduct = new ArrayList<>();
    
    public Category(){
        super();
    }
    public Category(int codeCat,String categoryName){
        this.codeCat = codeCat;
        this.categoryName = categoryName;
    }

    public void setCodeCat(int codeCat){
        this.codeCat = codeCat;
    }
    public int getCodeCat(){
        return this.codeCat;
    }
    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }
    public String getCategoryName(){
        return this.categoryName;
    }
    public Product findProductById(int id){
        for(Product pr : listProduct){
            if(pr.getCode() == id){
                return pr;
            }
        }
        return null;
    }
    public ArrayList<Product> getListProduct(){
        return this.listProduct;
    }
    public boolean addProduct(Product p){
        Product pFind = findProductById(p.getCode());
        if(pFind!=null){
            System.err.println("Duplicate productID");
            return false;
        }
        listProduct.add(p);
        showAllProduct();
        return true;
    }
    public void showAllProduct(){
        for(Product pr : listProduct){
            System.out.println(pr.getCode()+ " - " + pr.getProductName() 
                    + " - " + pr.getPrice() + " - " + pr.getMadeIn());
        }
    }
}
