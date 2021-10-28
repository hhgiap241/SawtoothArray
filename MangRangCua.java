package vn.edu.hcmus.student.sv19127640.lab02.Exercise03;


import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise03
 * Created by ADMIN
 * Date 10/25/2021 - 10:05 PM
 * Description: class of MangRangCua
 */
public class MangRangCua {
    // attribute
    private int[][] arr;
    /**
     * default constructor
     */
    public MangRangCua(){
        this.arr = null;
    }

    /**
     * constructor with parameter
     * @param arr 2 dimensional array (can be full or sawtooth array)
     */
    public MangRangCua(int[][] arr) {
        int row = arr.length;
        this.arr = new int[row][];
        for (int i = 0; i < this.arr.length; i++){
            int col = arr[i].length;
            this.arr[i] = new int[col];
            for (int j = 0; j < this.arr[i].length; j++){
                this.arr[i][j] = arr[i][j];
            }
        }
    }

    /**
     * copy constructor
     * @param arr MangRangCua
     */
    public MangRangCua(MangRangCua arr){
        int row = arr.arr.length;
        this.arr = new int[row][];
        for (int i = 0; i < this.arr.length; i++){
            int col = arr.arr[i].length;
            this.arr[i] = new int[col];
            for (int j = 0; j < this.arr[i].length; j++){
                this.arr[i][j] = arr.arr[i][j];
            }
        }
    }

    /**
     * getter method
     * @return arr sawtooth array
     */
    public int[][] getArr() {
        return this.arr;
    }

    /**
     * setter method
     * @param arr 2 dimensional array (can be full or sawtooth array)
     */
    public void setArr(int[][] arr) {
        int row = arr.length;
        this.arr = new int[row][];
        for (int i = 0; i < this.arr.length; i++){
            int col = arr[i].length;
            this.arr[i] = new int[col];
            for (int j = 0; j < this.arr[i].length; j++){
                this.arr[i][j] = arr[i][j];
            }
        }
    }

    /**
     * getter method to get an element in specified index
     * @param indexOfRow integer
     * @param indexOfCol integer
     * @return value Integer
     */
    public Integer get(int indexOfRow, int indexOfCol){
        Integer value = null;
        if (indexOfRow >= 0 && indexOfRow < this.arr.length && indexOfCol >= 0 && indexOfCol < this.arr[indexOfRow].length)
            value = this.arr[indexOfRow][indexOfCol];
        return value;
    }

    /**
     * setter method to set an element at specified value to another value
     * @param indexOfRow integer
     * @param indexOfCol integer
     * @param value integer
     */
    public void set(int indexOfRow, int indexOfCol, int value){
        if (indexOfRow >= 0 && indexOfRow < this.arr.length && indexOfCol >= 0 && indexOfCol < this.arr[indexOfRow].length)
            this.arr[indexOfRow][indexOfCol] = value;
    }

    /**
     * getter method to get the number of row
     * @return integer
     */
    public int getNumberOfRow(){
        return this.arr.length;
    }

    /**
     * getter method to get the number of col following the index of row
     * @param indexOfRow integer
     * @return value integer
     */
    public int getNumberOfColumn(int indexOfRow){
        int value = -1;
        if (indexOfRow >= 0 && indexOfRow < this.arr.length) {
            value = this.arr[indexOfRow].length;
        }
        return value;
    }

    /**
     * input sawtooth array
     */
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of row: ");
        int n = scan.nextInt();
        this.arr = new int[n][];
        for (int i = 0; i < this.arr.length; i++){
            System.out.print("Input the number of column at row " + i + ": ");
            int m = scan.nextInt();
            this.arr[i] = new int[m];
            for (int j = 0; j < this.arr[i].length; j++){
                System.out.print("arr[" + i + "][" + j + "] = ");
                this.arr[i][j] = scan.nextInt();
            }
        }
    }
    /**
     * output sawtooth array (dont print the number of elements at each row here to make it more friendly)
     */
    public void output(){
        System.out.println("Number of rows: " + this.arr.length);
        for (int i = 0; i < this.arr.length; i++){
            // print the number of elements at each row, comment here to make it more friendly
            // System.out.println("Number of column at row " + i + " is " + this.arr[i].length);
            for (int j = 0; j < this.arr[i].length; j++){
                System.out.print(this.arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * sort all row of sawtooth array in ascending order
     */
    public void sortRowAscending(){
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length - 1; j++){
                for (int k = j + 1; k < this.arr[i].length; k++){
                    if (this.arr[i][j] > this.arr[i][k]){
                        int temp = this.arr[i][j];
                        this.arr[i][j] = this.arr[i][k];
                        this.arr[i][k] = temp;
                    }
                }
            }
        }
    }
    /**
     * Calculate sum of all element in sawtooth array
     * @return sum integer
     */
    public int sum(){
        int sum = 0;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                sum += this.arr[i][j];
            }
        }
        return sum;
    }
    /**
     * Calculate product of all element in sawtooth array
     * @return product long
     */
    public long product(){
        long product = 1;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                product *= this.arr[i][j];
            }
        }
        return product;
    }
    /**
     * find the largest element in sawtooth array
     * @return value integer
     */
    public int largestElement(){
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] > value)
                    value = this.arr[i][j];
            }
        }
        return value;
    }

    /**
     * find the smallest positive integer in sawtooth array
     * @return value integer
     */
    public int smallestPositiveInteger(){
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] > 0 && this.arr[i][j] < value)
                    value = this.arr[i][j];
            }
        }
        return value;
    }
    /**
     * find the largest negative integer in sawtooth array
     * @return value integer
     */
    public int largestNegativeInteger(){
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] < 0 && this.arr[i][j] > value)
                    value = this.arr[i][j];
            }
        }
        return value;
    }
    /**
     * find the row has biggest sum value in sawtooth array
     * @return index integer
     */
    public int biggestSumRow(){
        int value = Integer.MIN_VALUE;
        int sum;
        int index = -1;
        for (int i = 0; i < this.arr.length; i++){
            sum = 0;
            for (int j = 0; j < this.arr[i].length; j++) {
                sum += this.arr[i][j];
            }
            if (sum > value){
                index = i;
                value = sum;
            }
        }
        return index;
    }
    /**
     * add a row to front of sawtooth array
     * @param a integer array
     */
    public void addRowToFront(int[] a){
        int row = this.arr.length;
        MangRangCua old_matrix = new MangRangCua(this);
        this.arr = new int[row + 1][];
        for (int i = 0; i < this.arr.length; i++){
            if (i == 0){
                this.arr[i] = new int[a.length];
                for (int j = 0; j < this.arr[i].length; j++){
                    this.arr[i][j] = a[j];
                }
            }else{
                this.arr[i] = new int[old_matrix.arr[i - 1].length];
                for (int j = 0; j < this.arr[i].length; j++){
                    this.arr[i][j] = old_matrix.arr[i - 1][j];
                }
            }
        }
    }
    /**
     * add a row to back of sawtooth array
     * @param a integer array
     */
    public void addRowToBack(int[] a) {
        int row = this.arr.length;
        MangRangCua old_matrix = new MangRangCua(this);
        this.arr = new int[row + 1][];
        for (int i = 0; i < this.arr.length; i++) {
            if (i == this.arr.length - 1) { // if it's the last row
                this.arr[i] = new int[a.length];
                for (int j = 0; j < this.arr[i].length; j++) {
                    this.arr[i][j] = a[j];
                }
            } else {
                this.arr[i] = new int[old_matrix.arr[i].length];
                for (int j = 0; j < this.arr[i].length; j++) {
                    this.arr[i][j] = old_matrix.arr[i][j];
                }
            }
        }
    }
    /**
     * add a row to row K of sawtooth array
     * @param a integer array
     * @param k integer
     */
    public void addRowToRowK(int k, int[] a) {
        int row = this.arr.length;
        MangRangCua old_matrix = new MangRangCua(this);
        this.arr = new int[row + 1][];
        for (int i = 0; i < this.arr.length; i++) {
            if (i < k) {
                this.arr[i] = new int[old_matrix.arr[i].length];
                for (int j = 0; j < this.arr[i].length; j++) {
                    this.arr[i][j] = old_matrix.arr[i][j];
                }
            } else if (i == k){
                this.arr[i] = new int[a.length];
                for (int j = 0; j < this.arr[i].length; j++) {
                    this.arr[i][j] = a[j];
                }
            } else{
                this.arr[i] = new int[old_matrix.arr[i - 1].length];
                for (int j = 0; j < this.arr[i].length; j++){
                    this.arr[i][j] = old_matrix.arr[i - 1][j];
                }
            }
        }
    }
    /**
     * delete row K from sawtooth array
     * @param k integer
     */
    public void deleteRowK(int k) {
        int row = this.arr.length;
        MangRangCua old_matrix = new MangRangCua(this);
        this.arr = new int[row - 1][];
        for (int i = 0; i < this.arr.length; i++) {
            if (i < k) {
                this.arr[i] = new int[old_matrix.arr[i].length];
                for (int j = 0; j < this.arr[i].length; j++) {
                    this.arr[i][j] = old_matrix.arr[i][j];
                }
            } else{
                this.arr[i] = new int[old_matrix.arr[i + 1].length];
                for (int j = 0; j < this.arr[i].length; j++){
                    this.arr[i][j] = old_matrix.arr[i + 1][j];
                }
            }
        }
    }

    /**
     * static method to parse String to sawtooth array, each line separate from \n character
     * @param s String
     * @return result MangRangCua
     */
    public static MangRangCua parseMangRangCuaHaiChieu(String s){
        MangRangCua result = new MangRangCua();
        String[] arrStr = s.split("\n");
        int row = arrStr.length;
        result.arr = new int[row][];
        for (int i = 0; i < arrStr.length; i++){
            String[] subStr = arrStr[i].split("[^0-9-]");
            result.arr[i] = new int[subStr.length];
            for (int j = 0; j < subStr.length; j++){
                result.arr[i][j] = Integer.parseInt(subStr[j]);
            }
        }
        return result;
    }
    /**
     * static method to create matrix has MxN and set all element to 0
     * @param numberOfRow integer
     * @param numberOfCol integer
     * @return result MangRangCua
     */
    public static MangRangCua createZeroMatrix(int numberOfRow, int numberOfCol){
        MangRangCua result = new MangRangCua();
        result.arr = new int[numberOfRow][];
        for (int i = 0; i < result.arr.length; i++){
            result.arr[i] = new int[numberOfCol];
            for (int j = 0; j < result.arr[i].length; j++){
                result.arr[i][j] = 0;
            }
        }
        return result;
    }

    /**
     * static method to create Random Sawtooth array
     * @param numberOfRow integer
     * @param maxValue integer
     * @param minValue integer
     * @return result MangRangCua
     */
    public static MangRangCua createRandomMatrix(int numberOfRow, int maxValue, int minValue){
        MangRangCua result = new MangRangCua();
        result.arr = new int[numberOfRow][];
        for (int i = 0; i < result.arr.length; i++){
            int numberOfCol = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
            result.arr[i] = new int[numberOfCol];
            for (int j = 0; j < result.arr[i].length; j++){
                result.arr[i][j] = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }
        return result;
    }

    /**
     * static method to create a row sorted sawtooth array
     * @param object MangRangCua
     * @return result MangRangCua
     */
    public static MangRangCua sort(MangRangCua object){
        MangRangCua result = new MangRangCua();
        result.arr = new int[object.arr.length][];
        for (int i = 0; i < result.arr.length; i++){
            int numberOfCol = object.arr[i].length;
            result.arr[i] = new int[numberOfCol];
            for (int j = 0; j < result.arr[i].length; j++){
                result.arr[i][j] = object.arr[i][j];
            }
        }
        result.sortRowAscending();
        return result;
    }
    /**
     * Calculate sum of 2 sawtooth array
     * @param object MangRangCua
     * @return sum integer
     */
    public int sum(MangRangCua object){
        int sum = this.sum() + object.sum();
        return sum;
    }
    /**
     * Calculate product of 2 sawtooth array
     * @param object MangRangCua
     * @return product long
     */
    public long product(MangRangCua object){
        long product = this.product() * object.product();
        return product;
    }
}
