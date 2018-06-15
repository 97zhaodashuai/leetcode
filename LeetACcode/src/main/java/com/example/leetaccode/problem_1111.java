package com.example.leetaccode;

public class problem_1111 {

    public void main(){
        firstBadVersion(2);
    }
    public int firstBadVersion(int n) {
        if(n == 1){
            return 0;
        }
        return findBadVersion(0, n-1);
    }

    public int findBadVersion(int beg, int end){
        int index = (beg + end)/2;
        if(isBadVersion(index)){
            return index;
        }else{
            return findBadVersion(index + 1, end);
        }
    }


    public boolean isBadVersion(int index){
        if(index == 1) return true;
        return false;
    }



}
