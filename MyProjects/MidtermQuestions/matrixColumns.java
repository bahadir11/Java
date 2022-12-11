public class matrixColumns {
    public static void main(String[] args){
        int[] array1 = {5,1,6,46,7,8,5,4,6};
        leftRotate(array1);
    }
    public static void leftRotate(int[] array){
        int mesafe = array.length;
        int[] array2 = new int[mesafe];
        int i = 0;
        while(i < mesafe -1){
            if(i <= 1){
                array2[i] = array[mesafe - 1 + i];
            }else{
               array2[i] = array[i + 2];   
            }
           i++;
        }
        System.out.print(array2);
    }
}
