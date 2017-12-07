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
public class ListCategory {
    private ArrayList<Category> listCategory = new ArrayList<>();
    
    public ArrayList<Category> getList(){
        return this.listCategory;
    }
    public Category findCategoryById(int id){
        for(Category c : listCategory){
            if(c.getCodeCat() == id){
                return c;
            }
        }
        return null;
    }
    public void addCategory(Category category){
        Category catFind = findCategoryById(category.getCodeCat());
        if(catFind!= null){
            System.err.println("Duplicate catID");
        }else{
            listCategory.add(category);
        }
        showAllCat();
    }
    public void removeCategory(int id){
        Category catFind = findCategoryById(id);
        if(catFind!=null){
            listCategory.remove(catFind);
        }
    }

    public void showAllCat(){
        for(Category cat : listCategory){
            System.out.println(cat.getCodeCat() + " - " + cat.getCategoryName());
        }
    }
    
}
