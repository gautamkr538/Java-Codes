public class BubbleSort {
    public static void main(String args[])
    {
        int array[]= {6,5,4,2,5,3,4};
        int size= array.length;
        int temp=0;

        System.out.println("Before Sorting");

        for(int num: array)
       {
        System.out.print(num+ " ");
       }
        for(int i=0; i< size; i++)
        {
            for(int j=0; j< size- i- 1; j++)
            {
                if (array[i] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } 
            }
            System.out.println();
            for( int num : array )
        {
            System.out.print(num + " ");
        }
        }
        
        System.out.println();
        
        System.out.println("After Sorting");

        for( int num : array )
        {
            System.out.print(num + " ");
        }
    }

        
}
