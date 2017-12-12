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
    private ArrayList<Product> listProductOfCategory = new ArrayList<>();
    private Category category = new Category();

    public ArrayList<Category> getList() {
        return this.listCategory;
    }

    public ArrayList<Product> getListProductOfCategory() {
        return listProductOfCategory;
    }

    public Category findCategoryById(int id) {
        for (Category c : listCategory) {
            if (c.getCodeCat() == id) {
                return c;
            }
        }
        return null;
    }

    public void addCategory(Category category) {
        Category catFind = findCategoryById(category.getCodeCat());
        if (catFind != null) {
            System.err.println("Duplicate catID");
        } else {
            listCategory.add(category);
        }
        showAllCat();
    }

    public void addProductToCategory(int catId, int ProductId) {
        Category catFind = findCategoryById(catId);
        if (catFind != null) {
            Product productFind = catFind.findProductById(ProductId);
            if (productFind != null) {
                if (catFind.getListProductOfCategory().isEmpty()) {
                    listProductOfCategory.add(productFind);
                    catFind.setListProductOfCategory(listProductOfCategory);
                }
                for (Product p : catFind.getListProductOfCategory()) {
                    if (p.getCode() != ProductId) {
                        listProductOfCategory.add(productFind);
                        catFind.setListProductOfCategory(listProductOfCategory);
                    } else {
                        System.err.println("duplicate");
                    }
                }

            } else {
                System.err.println("can't find product");
            }
        } else {
            System.err.println("can't fint category");
        }
        if (catFind != null) {
            showAllProductOfCat(catFind);
        }
    }

    public void removeCategory(int id) {
        Category catFind = findCategoryById(id);
        if (catFind != null) {
            listCategory.remove(catFind);
        }
    }

    public void showAllCat() {
        for (Category cat : listCategory) {
            System.out.println(cat.getCodeCat() + " - " + cat.getCategoryName());
        }
    }

    public void showAllProductOfCat(Category cat) {
        for (Product p : cat.getListProductOfCategory()) {
            System.out.println(p.getCode() + " - " + p.getProductName() + " - hehe");
        }
    }
}
