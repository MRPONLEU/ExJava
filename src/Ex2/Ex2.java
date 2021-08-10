package Ex2;

public class Ex2 {
    public static void main(String[] args) {
        int[] num=new int[10];
        int min,max;
        num[0]=99;
        num[1]=-10;
        num[2]=100123;
        num[3]=18;
        num[4]=-978;
        num[5]=5623;
        num[6]=463;
        num[7]=-9;
        num[8]=278;
        num[9]=49;
        min=max=num[0];
        for(int i=0;i<9;i++){
            if(num[i]<min){min=num[i];}
            if(num[i]>max){max=num[i];}
        }
        System.out.println("max is:"+ max);
        System.out.println("min is:"+ min);
    }
}
