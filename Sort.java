class Sort {
	public static void  exchange(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public void sort(int[] arr,int[] pos, int start, int end) {
		if(start > end) {return;}
		int i = start, j = end;
		int base = arr[start];
		while(i<j) {			
			while(i<j && arr[j] >= base) {j--;}
			while(i<j && arr[i] <= base) {i++;}
			exchange(arr, i, j);
			exchange(pos, i, j);
		}
		exchange(arr, i, start);
		exchange(pos, i, start);
		sort(arr,pos, start, j-1);
		sort(arr,pos, j+1, end);
	}
