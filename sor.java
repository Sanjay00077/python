import java.util.Arrays;
public class sor{
public static void main(String[] args){
int[] arr = {5,2,1,8,9};
Arrays.sort(arr);
for(int i = arr.length-1; i>=0; i--)
{
System.out.println(arr[i]);
}
}
}