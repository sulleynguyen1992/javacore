/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author nguye
 */
public class UsingJoinMethod extends Thread{

    public UsingJoinMethod(String name) {
        super(name);
    }
    
    

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(this.getName());
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(i + " - ");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }
    
    
    public static void main(String[] args) {
        UsingJoinMethod thread1 = new UsingJoinMethod("Ho Chi Minh");
        UsingJoinMethod thread2 = new UsingJoinMethod("Ha Noi");
        thread1.start();
        try {
            thread1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
