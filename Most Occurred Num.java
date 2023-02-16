public class tut1 {
    public static int findX(int[] arr) {
       
        int mostOccurredNum=0;
        int tempNum=0;
        int permNum=0;

        for(int i=0;i<arr.length;i++){
            tempNum=0;
            int ele=arr[i];

            for (int j=0;j<arr.length;j++){
                if(ele==arr[j]){
                    tempNum++;
                }
            }
            if (tempNum>permNum){
                permNum=tempNum;
                mostOccurredNum=ele;
            }
        }
        System.out.println(mostOccurredNum);
        return mostOccurredNum;
    }
    public static void main(String[] args) {
        int [] a={1,2,2,3,3,3};
        findX(a);
    }
}
