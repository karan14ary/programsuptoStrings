package SumOfElementOfArray;

public class SumArray {
static int  sumArrayElement(int[]arr) {
	int sum=0;
	for(int i=0;i<=arr.length-1;i++) {
		sum+=arr[i];
	}
	return sum;
}

}
