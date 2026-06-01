public class miss {
public static void main(String[] args) {
int[] arr = {1,2,3,5};
int n = 5;
int exceptedSum = n * (n + 1) /2;

int actualSum = 0;

for(int num : arr) {
actualSum += num;
}
int missing = exceptedSum - actualSum;
System.out.println("Missing number = " + missing);
}
}