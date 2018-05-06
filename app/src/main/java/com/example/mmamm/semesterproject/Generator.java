package com.example.mmamm.semesterproject;

import java.util.Random;

public class Generator {
    private int[][] rows = new int[9][9];
    private int[][] columns = new int[9][9];
    private int[][] areas = new int[9][9];

    public void main() {
        populateArrays();
    }

    public void populateArrays() {
        Random random = new Random();
        int area = 0;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (i <= 2 && j <= 2) {
                    area = 0;
                } else if (i <=2 && (j >=3 && j <=5)) {
                    area = 1;
                } else if (i <=2 && j >= 6) {
                    area = 2;
                } else if ((i >= 3 && i <= 5) && j <=2) {
                    area = 3;
                } else if ((i >= 3 && i <= 5) && (j >=3 && j <=5)) {
                    area = 4;
                } else if ((i >= 3 && i <= 5) && j >= 6) {
                    area = 5;
                } else if (i >= 6 && j <= 2) {
                    area = 6;
                } else if (i >= 6 && (j >=3 && j <=5)) {
                    area = 7;
                } else if (i >= 6 && j >= 6) {
                    area = 8;
                }
                int num = random.nextInt(9) + 1;
                while (intInArray(num, rows[i]) || intInArray(num, columns[j]) || intInArray(num, areas[area])) {
                    num = random.nextInt(9) + 1;
                }
                rows[i][j] = num;
                columns[j][i] = num;
                setAreas(i, j, num);
            }
        }
    }

    private boolean intInArray(int num, int[] arr) {
        boolean inArray = true;
        for (int i=0; i<9; i++) {
            if (arr[i] == num) {
                inArray = true; // number in array
                break;
            }
            else if (i == 8) {
                inArray = false;
            }
        }
        return inArray;
    }

    private void setAreas(int row, int column, int num) {
        if (row==0) {
            if (column==0) { // area 0_0
                areas[0][0] = num;
            }
            else if (column==1) { // area 0_1
                areas[0][1] = num;
            }
            else if (column==2) { // area 0_2
                areas[0][2] = num;
            }
            else if (column==3) { // area 1_0
                areas[1][0] = num;
            }
            else if (column==4) { // area 1_1
                areas[1][1] = num;
            }
            else if (column==5) { // area 1_2
                areas[1][2] = num;
            }
            else if (column==6) { // area 2_0
                areas[2][0] = num;
            }
            else if (column==7) { // area 2_1
                areas[2][1] = num;
            }
            else if (column==8) { // area 2_2
                areas[2][2] = num;
            }
        }
        else if (row==1) {
            if (column==0) { // area 0_3
                areas[0][3] = num;
            }
            else if (column==1) { // area 0_4
                areas[0][4] = num;
            }
            else if (column==2) { // area 0_5
                areas[0][5] = num;
            }
            else if (column==3) { // area 1_3
                areas[1][3] = num;
            }
            else if (column==4) { // area 1_4
                areas[1][4] = num;
            }
            else if (column==5) { // area 1_5
                areas[1][5] = num;
            }
            else if (column==6) { // area 2_3
                areas[2][3] = num;
            }
            else if (column==7) { // area 2_4
                areas[2][4] = num;
            }
            else if (column==8) { // area 2_5
                areas[2][5] = num;
            }
        }
        else if (row==2) {
            if (column==0) { // area 0_6
                areas[0][6] = num;
            }
            else if (column==1) { // area 0_7
                areas[0][7] = num;
            }
            else if (column==2) { // area 0_8
                areas[0][8] = num;
            }
            else if (column==3) { // area 1_6
                areas[1][6] = num;
            }
            else if (column==4) { // area 1_7
                areas[1][7] = num;
            }
            else if (column==5) { // area 1_8
                areas[1][8] = num;
            }
            else if (column==6) { // area 2_6
                areas[2][6] = num;
            }
            else if (column==7) { // area 2_7
                areas[2][7] = num;
            }
            else if (column==8) { // area 2_8
                areas[2][8] = num;
            }
        }
        else if (row==3) {
            if (column==0) { // area 3_0
                areas[3][0] = num;
            }
            else if (column==1) { // area 3_1
                areas[3][1] = num;
            }
            else if (column==2) { // area 3_2
                areas[3][2] = num;
            }
            else if (column==3) { // area 4_0
                areas[4][0] = num;
            }
            else if (column==4) { // area 4_1
                areas[4][1] = num;
            }
            else if (column==5) { // area 4_2
                areas[4][2] = num;
            }
            else if (column==6) { // area 5_0
                areas[5][0] = num;
            }
            else if (column==7) { // area 5_1
                areas[5][1] = num;
            }
            else if (column==8) { // area 5_2
                areas[5][2] = num;
            }
        }
        else if (row==4) {
            if (column==0) { // area 3_3
                areas[3][3] = num;
            }
            else if (column==1) { // area 3_4
                areas[3][4] = num;
            }
            else if (column==2) { // area 3_5
                areas[3][5] = num;
            }
            else if (column==3) { // area 4_3
                areas[4][3] = num;
            }
            else if (column==4) { // area 4_4
                areas[4][4] = num;
            }
            else if (column==5) { // area 4_5
                areas[4][5] = num;
            }
            else if (column==6) { // area 5_3
                areas[5][3] = num;
            }
            else if (column==7) { // area 5_4
                areas[5][4] = num;
            }
            else if (column==8) { // area 5_5
                areas[5][5] = num;
            }
        }
        else if (row==5) {
            if (column==0) { // area 3_6
                areas[3][6] = num;
            }
            else if (column==1) { // area 3_7
                areas[3][7] = num;
            }
            else if (column==2) { // area 3_8
                areas[3][8] = num;
            }
            else if (column==3) { // area 4_6
                areas[4][6] = num;
            }
            else if (column==4) { // area 4_7
                areas[4][7] = num;
            }
            else if (column==5) { // area 4_8
                areas[4][8] = num;
            }
            else if (column==6) { // area 5_6
                areas[5][6] = num;
            }
            else if (column==7) { // area 5_7
                areas[5][7] = num;
            }
            else if (column==8) { // area 5_8
                areas[5][8] = num;
            }
        }
        else if (row==6) {
            if (column==0) { // area 6_0
                areas[6][0] = num;
            }
            else if (column==1) { // area 6_1
                areas[6][1] = num;
            }
            else if (column==2) { // area 6_2
                areas[6][2] = num;
            }
            else if (column==3) { // area 7_0
                areas[7][0] = num;
            }
            else if (column==4) { // area 7_1
                areas[7][1] = num;
            }
            else if (column==5) { // area 7_2
                areas[7][2] = num;
            }
            else if (column==6) { // area 8_0
                areas[8][0] = num;
            }
            else if (column==7) { // area 8_1
                areas[8][1] = num;
            }
            else if (column==8) { // area 8_2
                areas[8][2] = num;
            }
        }
        else if (row==7) {
            if (column==0) { // area 6_3
                areas[6][3] = num;
            }
            else if (column==1) { // area 6_4
                areas[6][4] = num;
            }
            else if (column==2) { // area 6_5
                areas[6][5] = num;
            }
            else if (column==3) { // area 7_3
                areas[7][3] = num;
            }
            else if (column==4) { // area 7_4
                areas[7][4] = num;
            }
            else if (column==5) { // area 7_5
                areas[7][5] = num;
            }
            else if (column==6) { // area 8_3
                areas[8][3] = num;
            }
            else if (column==7) { // area 8_4
                areas[8][4] = num;
            }
            else if (column==8) { // area 8_5
                areas[8][5] = num;
            }
        }
        else if (row==8) {
            if (column==0) { // area 6_6
                areas[6][6] = num;
            }
            else if (column==1) { // area 6_7
                areas[6][7] = num;
            }
            else if (column==2) { // area 6_8
                areas[6][8] = num;
            }
            else if (column==3) { // area 7_6
                areas[7][6] = num;
            }
            else if (column==4) { // area 7_7
                areas[7][7] = num;
            }
            else if (column==5) { // area 7_8
                areas[7][8] = num;
            }
            else if (column==6) { // area 8_6
                areas[8][6] = num;
            }
            else if (column==7) { // area 8_7
                areas[8][7] = num;
            }
            else if (column==8) { // area 8_8
                areas[8][8] = num;
            }
        }
    }

    public int[][] getRows() {
        return rows;
    }
}
