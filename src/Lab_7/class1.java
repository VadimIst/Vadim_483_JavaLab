/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_7;

/**
 *
 * @author User
 */
public class class1 {

    private int a = 20;
    protected int b = 50;

    public int ukaz() {
        return this.a;
    }

    public static void main(String[] args) {
        class2 c2 = new class2();
        c2.com();
    }
}

public class class2 extends class1 {

    public void com() {
        System.out.println("Значение закрытого поля\r\n" + "private - a - " + ukaz());
        System.out.println("Значение защищенного поля\r\n" + "protected - b - " + this.b);
    }
}
