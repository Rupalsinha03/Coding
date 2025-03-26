public class BasicBubblesort {
    public static void main(String[] args) {
        int a[]={11,3,1,7,5,7,2,6};
        int temp=0;
        for(int i=0;i<=a.length-1;i++){
            for (int j=i+1;j<=a.length-1;j++){
                if(a[i]>a[j]){ //3,11,1
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }
        for (int k=0;k<=a.length-1;k++){
            System.out.println(a[k]);
        }
    }
}
