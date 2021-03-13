package leetproblems;

import java.util.*;

class MaximumPoints{
    public static void main(String args[]){
        int cardPoints[]={1,79,80,1,1,1,200,1};
        int k=3;

        ArrayList<Integer> lis1= new ArrayList<Integer>();
        ArrayList<Integer> lis2= new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            lis1.add(cardPoints[i]);
            lis2.add(cardPoints[ cardPoints.length-i-1 ] );
        }
        int sum1=MaxSum(lis1);
        int sum2=MaxSum(lis2);
        int maxValue = sum1>sum2?sum1:sum2;
        for(int i=0;i<k-1;i++){
            ArrayList<Integer> lis3= new ArrayList<Integer>();
            lis3.addAll(lis1.subList(0, lis1.size() -i -1 ));
            lis3.addAll(lis2.subList(0, i+1));
            int temSum = MaxSum(lis3);
            maxValue= maxValue>temSum?maxValue:temSum;
        }
        System.out.println(maxValue);

    }
    public static int MaxSum(ArrayList<Integer> lis){
        int sum=0;
        for(int i=0;i<lis.size();i++){
            sum+=lis.get(i);
        }
        return sum;
    }
}