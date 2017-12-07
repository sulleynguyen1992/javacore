/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kytich.com.model;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class Category {

    private String code;
    private String catName;
    private ArrayList<Product> prList;

    public Category() {
        prList = new ArrayList<Product>();
    }

    public Category(String code, String catName) {
        this.code = code;
        this.catName = catName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setPrList(ArrayList<Product> prList) {
        this.prList = prList;
    }

    public String getCode() {
        return code;
    }

    public String getCatName() {
        return catName;
    }

    public ArrayList<Product> getPrList() {
        return prList;
    }

    public Product findProductByCode(String code) {
        for (Product pr : prList) {
            if (pr.getCode().equalsIgnoreCase(code)) {
                return pr;
            }
        }
        return null;
    }

    public boolean addProduct(Product p) {
        Product pFind = findProductByCode(p.getCode());
        if (pFind != null) {
            System.err.println("The product code is exist");
            return false;
        }
        prList.add(p);
        showAllProduct();
        return true;
    }

    public void removeProductByCode(String code) {
        Product pFind = findProductByCode(code);
        if (pFind != null) {
            prList.remove(pFind);
        }
    }

    public int totalProduct() {
        return prList.size();
    }

    public void showAllProduct() {
        if (prList.size() > 0) {
            for (Product pr : prList) {
                System.out.println(pr.getCode() + " - " + pr.getName() + " - "
                        + pr.getUnitPrice() + " - " + pr.getMadeIn());
            }
        }else{
            System.out.println("No product item");
        }
    }
}
