package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }

    public static int[][] CreateGrid(){
        int[][] board = new int[10][10];
        for (int[] row: board) {
            Arrays.fill(row,0);
        }
        return PlaceShips(board);

    }

    public static int[][] PlaceShips(int[][] board){
        return board;
    }
}