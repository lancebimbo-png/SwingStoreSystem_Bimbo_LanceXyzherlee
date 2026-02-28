# Store Management System Using Java Swing and Arrays 
**Project Name:** SwingStoreSystem  

## System Overview
This is a GUI-based Java Swing application that simulates a simple store checkout system. It allows users to process customer transactions, view a history of all purchases, and monitor real-time stock levels. Per the strict system requirements, this application does NOT use ArrayLists or the Java Collections Framework. All data persistence and manipulation are handled entirely through fixed-size arrays.

## Frame Responsibilities
The application is divided into three distinct JFrames to separate functionality:

1. **TransactionFrame (Store Transaction Frame):** - Acts as the main checkout screen. 
   - Allows the user to select products via a dropdown and input purchase quantities. 
   - Computes subtotals and validates data (prevents negative inputs and out-of-stock purchases).
   - Provides navigation to the other two frames.

2. **LogsFrame (Transaction Logs Frame):** - Displays a complete history of all successful transactions.
   - Automatically loads data upon opening to show the item name, quantity bought, and total cost of each purchase.

3. **InventoryFrame (Inventory Frame):** - Displays the current stock levels of all products in the store.
   - Automatically reflects deductions made from the TransactionFrame.

## How Arrays Are Used
To share data logically between the three JFrames, a centralized class (`StoreDatabase`) was created containing `public static` fixed-size arrays:
- **Inventory Arrays:** `String[] productList`, `double[] priceList`, and `int[] stockAvailable` are used to store the master list of items, their costs, and remaining quantities.
- **Transaction Arrays:** `String[] historyItems`, `int[] historyQuantities`, and `double[] historyTotals` are instantiated with a fixed size of 100 to act as a ledger.
- **Index Counter:** An integer `transactionCount` acts as a pointer. Every time a transaction succeeds, data is written to the history arrays at the index of `transactionCount`, and then the counter is incremented by 1.

## SCREENSHOTS
<img width="1919" height="1020" alt="Screenshot 2026-02-28 193415" src="https://github.com/user-attachments/assets/c5ffb458-118b-4da0-9b73-a1179742d1b2" />
