package com.learn.jdk.algorithm;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

/**
 * @Author yuezp
 * @Date 2021/9/18 下午1:24
 * @Version v1.0
 */
public class FindNumberIn2DArray {

    //暴力双循环
    public boolean findNumberIn2DArray(int[][] matrix, int target){

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    //线性查找
    public boolean findNumberIn2DArray01(int[][] matrix, int target){

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        while (row < rows && column > 0){

            if (matrix[row][column] == target){
                return true;
            } else if (matrix[row][column] > target){
                column--;
            }else {
                row++;
            }
        }

        return false;
    }

}
