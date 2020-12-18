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
public class fclass1 {

    public static void main(String[] args) {
        fclass2 f2 = new fclass2();
        fclass3 f3 = new fclass3();
        f2.srt();
        f3.srt();
    }
}

public class fclass2 extends fclass3 {
    public void srt() {
        System.out.println("Класс 2 наследуем от класса 3");
    }
}

public class fclass3 extends fclass1 {
    public void srt() {
        System.out.println("Класс 3 наследуем от класса 1");
    }
}
