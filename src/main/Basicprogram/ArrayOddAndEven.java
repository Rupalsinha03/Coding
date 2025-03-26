//Print even and odd num from array
//a={1,2,3,4,5,6}

public class ArrayOddAndEven {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,0,-1};
        int evenCount=0;
        int oddCount=0;
        for (int i =0 ;i<=a.length-1;i++){
            if(a[i]%2==0){
                //System.out.println("even num :"+a[i]);
                evenCount++;


            }
            else{

                oddCount++;
            }

        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
