import java.lang.reflect.Array;

public class Assignment {

    //Main function
    public static void main(String[] args) {

        Assignment obj = new Assignment();
        int Array[] = {5, 10, 40, 30, 20};
        obj.orderOfElements(Array);
    }


   /* function  for order of the element */
    void orderOfElements(int[] Array) {

        /* copying of array to sort in next process*/
        int[] copyArray = new int[Array.length];
        for (int indexoOFArray = 0; indexoOFArray < copyArray.length; indexoOFArray++) {
            copyArray[indexoOFArray] = Array[indexoOFArray];
        }



        //sorting the  for comparision copyArray in one loop for less complexity
        for (int indexoOFcopyArray = 0; indexoOFcopyArray < copyArray.length - 1; indexoOFcopyArray++) {
            if (copyArray[indexoOFcopyArray] > copyArray[indexoOFcopyArray + 1]) {
                int tempVal = copyArray[indexoOFcopyArray];
                copyArray[indexoOFcopyArray] = copyArray[indexoOFcopyArray + 1];
                copyArray[indexoOFcopyArray + 1] = tempVal;
                indexoOFcopyArray = -1;
            }
        }


          /* printing of the ordered index */
        for (int indexoOFArray = 0; indexoOFArray < Array.length; indexoOFArray++) {
            for (int indexoOFcopyArray = 0; indexoOFcopyArray < copyArray.length; indexoOFcopyArray++) {
                if (Array[indexoOFArray] == copyArray[indexoOFcopyArray]) {
                    System.out.print(indexoOFcopyArray);
                    break;

                }
            }
        }





    }
}
