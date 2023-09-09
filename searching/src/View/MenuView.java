/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import  java.util.Scanner;

/**
 *
 * @author Loki
 */
public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("1. Tìm kiếm bằng sắp xếp nhị phân");
        System.out.println("2. Tìm kiếm bằng tìm kiếm tuyến tính");
        System.out.println("3. Thoát");
        return scanner.nextInt();
    }

    public int getInputValue() {
        System.out.print("Nhập giá trị cần tìm: ");
        return scanner.nextInt();
    }
}
