/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myswingstore;

/**
 *
 * @author Lance
 */
public class StoreDatabase {
    
    // ==========================================
    // 1. INVENTORY ARRAYS (The sample data)
    // ==========================================
    // Your activity requires Rice, Sugar, Coffee, Milk starting with 20 units.
    public static String[] productList = {"Rice", "Sugar", "Coffee", "Milk"}; 
    public static double[] priceList = {50.0, 65.0, 120.0, 85.0}; 
    public static int[] stockAvailable = {20, 20, 20, 20}; 

    // ==========================================
    // 2. TRANSACTION LOG ARRAYS
    // ==========================================
    // Since we cannot use ArrayList, we create fixed-size arrays. 
    // Let's assume a maximum of 100 transactions can happen.
    public static String[] historyItems = new String[100]; 
    public static int[] historyQuantities = new int[100]; 
    public static double[] historyTotals = new double[100]; 
    
    // ==========================================
    // 3. INDEX COUNTER
    // ==========================================
    // This tracks exactly how many transactions have been completed.
    // It starts at 0 and goes up by 1 every time a customer buys something.
    public static int transactionCount = 0; 
}