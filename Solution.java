class Solution {
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
	
    public int maxArea(int[] height) {
    	int res = 0;
    	int[] pos = new int[height.length];
    	for(int i=0; i<height.length;i++) {pos[i] = i;}
    	sort(height, pos,0, height.length-1);
    	for(int i=0;i<height.length;i++) 
    	{
    		for (int j=i;j<height.length;j++) {
    			res = Math.max(res,height[i]*(Math.abs(pos[j]-pos[i])));
    		}
    	}

    	return res;
    }
    public static void main(String arg[]) {
    	Solution a = new Solution();
    	int[] temp = {1,1};
    	System.out.println(a.maxArea(temp));
    }
}