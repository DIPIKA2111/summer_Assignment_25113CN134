public class LinearSearch {
    public static int LinearSearch(int arr[],int temp){
        for(int i=0;i < arr.length;i++){
            if(arr[i]==temp){
                return i;

            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={12,14,5,6,7,8,-7};
        int tempValue=6;
        int resultIndex=LinearSearch(numbers,tempValue);
        if(resultIndex!=-1){
            System.out.print("Element"+tempValue+"found at index:"+resultIndex);
        }
        else{
            System.out.print("Element"+tempValue +"was not found in array");
        }
        }
    }
