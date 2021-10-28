package vn.edu.hcmus.student.sv19127640.lab02.Exercise03;


import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise03
 * Created by ADMIN
 * Date 10/25/2021 - 10:04 PM
 * Description: main
 */
public class Exercise03 {
    /**
     * main function
     * @param argv console parameters
     */
    public static void main(String[] argv){
        Integer chosse = null;
        do{
            System.out.println("===================================================================");
            System.out.println("0. Exit");
            System.out.println("1. Using constructor methods");
            System.out.println("2. Using get/set methods");
            System.out.println("3. Using input/output methods");
            System.out.println("4. Using sort matrix ascending in each row method");
            System.out.println("5. Using calculate sum of all elements method");
            System.out.println("6. Using calculate product of all elements method");
            System.out.println("7. Using find the largest element method");
            System.out.println("8. Using find the smallest positive integer number method");
            System.out.println("9. Using find the largest negative integer number method");
            System.out.println("10. Using find the row that has biggest sum value method");
            System.out.println("11. Using add a new row to front of matrix method");
            System.out.println("12. Using add a new row to back of matrix method");
            System.out.println("13. Using add a new row to row K of matrix method");
            System.out.println("14. Using delete row K from matrix method");
            System.out.println("15. Using static method parseMangRangCuaHaiChieu");
            System.out.println("16. Using static methods");
            System.out.println("17. Using overload methods");
            System.out.println("===================================================================");
            System.out.print("Input your choose: ");
            Scanner scan = new Scanner(System.in);
            chosse = scan.nextInt();
            switch (chosse){
                case 0: return;
                case 1: {
                    // use default constructor
                    MangRangCua obj_1 = new MangRangCua();
                    // use constructor with parameters
                    int[][] a_1 = {
                            { 1, 2 },
                            { 3, 4, 5 },
                            { 5, 6 , 7, 8 },
                            { 7, 8 ,9 ,10 }
                    };
                    MangRangCua obj_2 = new MangRangCua(a_1);
                    System.out.println("Using constructor with parameter: ");
                    obj_2.output();
                    // use copy constructor
                    System.out.println("Using copy constructor: ");
                    MangRangCua obj_3 = new MangRangCua(obj_2);
                    obj_3.output();
                    break;
                }
                case 2: {
                    // use getter and setter
                    int n, m;
                    MangRangCua obj_3 = MangRangCua.createRandomMatrix(3,-10,10);
                    System.out.println("Matrix");
                    obj_3.output();
                    System.out.println("Using getter: ");
                    System.out.println("Number of row: " + obj_3.getNumberOfRow());
                    System.out.print("Input the row to get the number of element at that row: ");
                    n = scan.nextInt();
                    System.out.println("Number of col at row " + n +": " + obj_3.getNumberOfColumn(n));
                    System.out.print("Input row of element to get: ");
                    n = scan.nextInt();
                    System.out.print("Input column of element to get: ");
                    m = scan.nextInt();
                    Integer value = obj_3.get(n,m);
                    obj_3.output();
                    if (value != null){
                        System.out.println("The value at row = " + n + " and column = " + m + " of matrix above is " + value);
                    }else{
                        System.out.println("Value doesnt exist.");
                    }
                    System.out.println("Using setter: ");
                    MangRangCua obj_4 = new MangRangCua();
                    int[][] a_1 = {
                            { 1, 2 },
                            { 3, 4, 5 },
                            { 5, 6 , 7, 8 },
                            {10 }
                    };
                    obj_4.setArr(a_1);
                    System.out.println("Sawtooth array after using setter method:");
                    obj_4.output();
                    System.out.println("Using setter at element has row = 1 and column = 2 of matrix above: ");
                    obj_4.set(1,1,100);
                    obj_4.output();
                    break;
                }
                case 3:{
                    // use input and output method
                    MangRangCua obj_1 = new MangRangCua();
                    System.out.println("Using input and output method: ");
                    obj_1.input();
                    obj_1.output();
                    break;
                }
                case 4:{
                    // use sort all row of matrix in ascending order
                    int[][] a_2 = {
                            {10, 23, -43},
                            {30, 12},
                            {55, 12, 5, -1, 7, 9},
                            {8, 9, 33, -1, -12}
                    };
                    MangRangCua obj_5 = new MangRangCua(a_2);
                    System.out.println("Sawtooth array before sort all row in ascending order:");
                    obj_5.output();
                    System.out.println("Sawtooth array after sort all row in ascending order:");
                    obj_5.sortRowAscending();
                    obj_5.output();
                    break;
                }
                case 5:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use calculate sum of all element in sawtooth array
                    System.out.println("Sum of sawtooth array above is " + obj_5.sum());
                    break;
                }
                case 6: {
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use calculate product of all element in sawtooth array
                    System.out.println("Product of sawtooth array above is " + obj_5.product());
                    break;
                }
                case 7: {
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use find the largest element in sawtooth array
                    System.out.println("The largest element in sawtooth array above is " + obj_5.largestElement());
                    break;
                }
                case 8: {
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use find the smallest positive integer element in sawtooth array
                    System.out.println("The smallest positive integer element in sawtooth array above is " + obj_5.smallestPositiveInteger());
                    break;
                }
                case 9:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use find the largest negative integer element in sawtooth array
                    System.out.println("The largest negative integer element in sawtooth array above is " + obj_5.largestNegativeInteger());
                    break;
                }
                case 10:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use find the row that have the biggest sum value in sawtooth array
                    System.out.println("The row that have the biggest sum value in sawtooth array above is row number " + obj_5.biggestSumRow());
                    break;
                }
                case 11:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use add a row to front of sawtooth array
                    System.out.println("Sawtooth array after add new row to the front:");
                    int[] a_3 = {1, -2, -100};
                    obj_5.addRowToFront(a_3);
                    obj_5.output();
                    break;
                }
                case 12:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use add a row to back of sawtooth array
                    System.out.println("Sawtooth array after add new row to the back:");
                    int[] a_4 = {0, 1, 3, 4};
                    obj_5.addRowToBack(a_4);
                    obj_5.output();
                    break;
                }
                case 13:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use add a row to row K of sawtooth array
                    System.out.print("Input row k to add new row: ");
                    int k = scan.nextInt();
                    System.out.println("Sawtooth array after add new row to row " + k + ":");
                    int[] a_5 = {5, -4, 12, 12};
                    obj_5.addRowToRowK(k, a_5);
                    obj_5.output();
                    break;
                }
                case 14:{
                    MangRangCua obj_5 = MangRangCua.createRandomMatrix(4,-50,50);
                    System.out.println("Matrix");
                    obj_5.output();
                    // use delete row K of sawtooth array
                    System.out.print("Input row k to delete: ");
                    int k = scan.nextInt();
                    System.out.println("Sawtooth array after delete row " + k + ":");
                    obj_5.deleteRowK(k);
                    obj_5.output();
                    break;
                }
                case 15:{
                    // use static method to parse String to sawtooth array, each line separate from \n character
                    System.out.println("Using static method to parse String to sawtooth array, each line separate from \\n character");
                    MangRangCua obj_6 = MangRangCua.parseMangRangCuaHaiChieu("4/5/6%3\n7/5\n3&5*4/12/3\n12#-1");
                    obj_6.output();
                    break;
                }
                case 16:{
                    System.out.println("Using static method to create Zero sawtooth array: ");
                    MangRangCua obj_7 = MangRangCua.createZeroMatrix(2, 3);
                    obj_7.output();
                    System.out.println("Using static method to create Random sawtooth array: ");
                    MangRangCua obj_8 = MangRangCua.createRandomMatrix(5, -5,10);
                    obj_8.output();
                    System.out.println("Using static method to create row sorted in ascending sawtooth array: ");
                    MangRangCua obj_9 = MangRangCua.sort(obj_8);
                    obj_9.output();
                    break;
                }
                case 17:{
                    // use overload method
                    MangRangCua obj_6 = MangRangCua.createRandomMatrix(5, -5,10);
                    System.out.println("First matrix:");
                    obj_6.output();
                    MangRangCua obj_7 = MangRangCua.createRandomMatrix(3, -5,10);
                    System.out.println("First matrix:");
                    obj_7.output();
                    System.out.println("Using overload method: ");
                    int sum = obj_6.sum(obj_7);
                    System.out.println("Sum of 2 matrix is " + sum);
                    long product = obj_6.product(obj_7);
                    System.out.println("Product of 2 matrix is " + product);
                    break;
                }
                default: return;
            }
            System.out.print("Press enter to continue...");
            try{System.in.read();}
            catch(Exception e){}
        }while(0 < chosse && chosse <= 17);
    }
}
