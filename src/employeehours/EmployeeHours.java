/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeehours;

/**
 *
 * @author me
 */
public class EmployeeHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] workHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
        
        System.out.println("Hello")
        int total = 0;
        int [] weeklyHours = new int[workHours.length];
        for (int i = 0 ; i < workHours.length; i++){
            for (int j = 0; j < workHours[i].length; j++){
                weeklyHours[i] += workHours[i][j];
            }
        
        }
        
        
        
        
    }
    
}
