package com.learn.jdk.algorithm;

/**
 * @Author yuezp
 * @Date 2021/9/19 下午1:03
 * @Version v1.0
 */
public class SpiralOrder {

    public int[] spiralOrder(int[][] matrix) {
    //  l   r
    //  1 2 3   u
    //  4 5 6
    //  7 8 9   d
    // l->r: dir=↓  u++
    // u->d: dir=←  r--
    // r->l: dir=↑  d--
    // d->u: dir=→  l++
    int row = matrix.length;
        if(row == 0){
        return new int[0];
    }
    int col = matrix[0].length;
    int[] ret = new int[row * col];
    int left = 0;
    int right = col - 1;
    int upper = 0;
    int down = row - 1;
    int index = 0;
        while(index < ret.length){
        for(int i = left; i <= right; i++){
            ret[index++] = matrix[upper][i];
            if(index == ret.length){
                return ret;
            }
        }
        upper++;
        for(int i = upper; i <= down; i++){
            ret[index++] = matrix[i][right];
            if(index == ret.length){
                return ret;
            }
        }
        right--;
        for(int i = right; i >= left; i--){
            ret[index++] = matrix[down][i];
            if(index == ret.length){
                return ret;
            }
        }
        down--;
        for(int i = down; i >= upper; i--){
            ret[index++] = matrix[i][left];
            if(index == ret.length){
                return ret;
            }
        }
        left++;
    }
        return ret;
}
}
