package Laba2;

public class Sort {

        public static void sort(int[] arr) {

            boolean sorted=false;
            while(!sorted) {
                sorted=true;
                for(int i=1; i < arr.length; i++) {
                    if(arr[i] < arr[i-1]) {
                        int temp=arr[i];
                        arr[i]= arr[i-1];
                        arr[i-1]=temp;
                        sorted=false;
                    }
                }
            } 
        }
    }