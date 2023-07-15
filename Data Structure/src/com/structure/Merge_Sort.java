package com.structure;

import java.util.Arrays;

class Merge_Sort {
   static int[] mergeSort(int[] array) {
      if (array.length == 1) {
         return array;
      }
      int mid = array.length / 2;
      int[] first = mergeSort(Arrays.copyOfRange(array, 0, mid));
      int[] second = mergeSort(Arrays.copyOfRange(array, mid, array.length));
      return merge(first, second);
   }

   static int[] merge(int[] first, int[] second) {
      int[] result = new int[first.length + second.length];
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < first.length && j < second.length) {
         if (first[i] <= second[j]) {
            result[k] = first[i];
            i++;
         } else {
            result[k] = second[j];
            j++;
         }
         k++;
      }
      while (i < first.length) {
         result[k] = first[i];
         i++;
         k++;
      }
      while (j < second.length) {
         result[k] = second[j];
         j++;
         k++;
      }
      return result;
   }

   public static void main(String[] args) {
      int[] arr = { 2, 6, 3, 1, 4, 7 };
      int[] brr = mergeSort(arr);
      System.out.println(Arrays.toString(arr));
      System.out.println(Arrays.toString(brr));
   }
}