public class jpe08{
    public static void main(String[] args){

        int[] numbers = {5, -5, 15, -15, -20, 6, -2, -3, -10, -100};
        int oldSum = 0;

        // int oldSum1= numbers[0] +  numbers[1] +  +  numbers[2] +  numbers[3] +  numbers[4] +  numbers[5] +  numbers[6] +  numbers[7] +  numbers[8] + numbers[9];
        // System.out.println("old  "+oldSum1);

        System.out.print("Old Numbers: ");

        for (int oldNumber: numbers){
            oldSum  += oldNumber;
            System.out.printf("%d ," ,oldNumber);
        }
        System.out.printf("Sum: %d\n\n", oldSum);

        int[] newArray = new int[10];
        int newSum = 0;
        for (int i = 0 ; i < (numbers.length -1); i++){
            if (numbers[i] < 0){
                numbers[i] = 0;
            }else{
                newArray[i] = numbers[i];
                newSum+=numbers[i];
            }
           
        }
                    System.out.print("New Numbers: ");

        for(int newNumber: numbers){
            System.out.printf(" %d,",newNumber);
        }
        System.out.printf("Sum: %d", newSum);

      
        // for(int newNumber : numbers){
        //     System.out.println(newNumber);
        // }

    }
}