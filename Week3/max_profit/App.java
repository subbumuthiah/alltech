package max_profit;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class App {

//	public static void main(int[] category, int[] price, int n) {
		// TODO Auto-generated method stub
	public static void main(String [] args) {
		
		int[] category = {3,1,2,3};
		int[] price = {2,1,4,4}; 
		int n=3;
		int ret1 = approach_1(category, price, n);
		int ret2 = approach_2(category, price, n);
		if(ret1 > ret2) {
			System.out.println(ret1);
		} else {
			System.out.println(ret2);
		}
		
		
		
	}
	
	
	public static int total(int[] cat, int[] price, int n) {
		int sum = 0;
		for(int i = 0; i < cat.length; i++) {
			if(cat[i] == n) {
				sum += price[i];
			}
		}
		if(sum <= 0) {
			return 0;
		} else {
			return sum;
		}
	}
	
	public static int approach_1(int[]category, int[]price, int n) {
		//finding # of unique categories
		int sum = 0;
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			if(!a.contains(category[i])) {
				sum++;
				a.add(category[i]);
			}
		}
		
		//finding sum of each category
		int[][] location = new int[sum][2];
		for(Integer x : a) {
			for(int i = 0; i < sum; i++) {
				if(category[i] == x) {
					location[i][0] = total(category, price, x);
					location[i][1] = x;
				}
			}
		}
		//sort array
		int min = 1000000001;
		int ind = -1;
		int cat_ind = -1;
		int q = 0;
		while(q < location.length){
			min = 1000000001;
			for(int i = location.length-1; i >= q; i--) {
				if(location[i][0] < min) {
					min = location[i][0];
					ind = i;
					cat_ind = location[i][1];
				}
			}
			location[ind][0] = location[q][0];
			location[ind][1] = location[q][1];
			location[q][0] = min;
			location[q][1] = cat_ind;
			q++;
		}
		
		int ret = 0;
		sum = 0;
		for(int i = 0; i < location.length; i++) {
			sum += (i+1) * location[i][0];
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int approach_2(int [] category, int [] price, int n) {
		int sum = 0;
		int min = 1000000001;
		int ind = -1;
		int cat_ind = -1;
		int q = 0;
		while(q < n){
			min = 1000000001;
			for(int i = n-1; i >= q; i--) {
				if(price[i] < min) {
					min = price[i];
					ind = i;
					cat_ind = category[i];
				}
			}
			price[ind] = price[q];
			category[ind] = category[q];
			price[q] = min;
			category[q] = cat_ind;
			q++;
		}
		List<Integer> li = new ArrayList<Integer>();
		sum = 0;
		int multiplier = 0;
		for(int i = 0; i < price.length; i++) {
			if(li.contains(category[i]) == false){
				li.add(category[i]);
				multiplier++;
				sum += price[i]*multiplier;
			} else {
				sum+= price[i]*multiplier;
			}
		}
		return sum;
	}
}
