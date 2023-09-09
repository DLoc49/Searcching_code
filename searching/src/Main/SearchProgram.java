/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import View.MenuView;
import Controller.Algorithm;

/**
 *
 * @author Loki
 */
public class SearchProgram {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        Algorithm searchController = new Algorithm();

        int[] arr = {2, 4, 6, 8, 10, 12, 142, 16, 18, 20}; 

        while (true) {
            int choice = menuView.showMainMenu();

            switch (choice) {
                case 1:
                    int target1 = menuView.getInputValue();
                    int binarySearchResult = searchController.binarySearch(arr, target1);
                    if (binarySearchResult != -1) {
                        System.out.println("Tìm thấy giá trị " + target1 + " tại vị trí " + binarySearchResult);
                    } else {
                        System.out.println("Không tìm thấy giá trị " + target1);
                    }
                    break;

                case 2:
                    int target2 = menuView.getInputValue();
                    int linearSearchResult = searchController.linearSearch(arr, target2);
                    if (linearSearchResult != -1) {
                        System.out.println("Tìm thấy giá trị " + target2 + " tại vị trí " + linearSearchResult);
                    } else {
                        System.out.println("Không tìm thấy giá trị " + target2);
                    }
                    break;

                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ. Chọn chọn lại!1"
                            + "");
            }
        }
    }
}
    

