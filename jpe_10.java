import java.util.Scanner;
public class Jpe_10{
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array1 = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 303};
        String user_input;
        System.out.println();

        while (true){
            System.out.println("{23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 303}");
            System.out.print("[1]Ascending\n[2]Descending\n[3]Palindrome \n[E]Exit\n ");
            user_input = input.nextLine().toLowerCase();
            if(user_input.equals("e")){
                System.out.println("Thank you");
                break;
            }
            
            System.out.println();

            switch(user_input.toLowerCase()){
                case "1":
               
                    ascend(array1);
                    System.out.println();
                    break;
                case "2":
                    descend(array1);
                    System.out.println();
                    break;
                case "3":
               
                    System.out.print("Type a word: ");
                    String word = input.nextLine();
                    if(isPalindorme(word.toLowerCase())){
                        System.out.println("This word is Palindrome");
                    }else{
                        System.out.println("This word is not a Palindrome");
                    }
                    break;
                case "e":
                        break;
                default:
                    break;    
            }


        }

    }

    public static boolean isPalindorme(String word){
        
        int start = 0;
        int end = word.length() - 1;

        
        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                
                return false;
            }
            start++;
            end--;
        }

        return true;



    }

    public static int[] ascend(int[] array1){

        int[] temp_array = array1;
        
       

        System.out.println();
        for(int i=0 ; i<temp_array.length;i++){
            if(temp_array[i] < 0){
                temp_array[i] = 0;
            }

        }


       for (int i = 0; i < temp_array.length - 1; i++) {
            for (int j = 0; j < temp_array.length - 1 - i; j++) {
                if (temp_array[j] > temp_array[j + 1]) {
                    // Swap
                    int temp = temp_array[j];
                    temp_array[j] = temp_array[j + 1];
                    temp_array[j + 1] = temp;
                }
            }
        }

                System.out.print("Ascending ");
         for (int i=0; i < temp_array.length; i++){
            System.out.print(temp_array[i]+ ", ");

        }

     
        return temp_array;
    }


    public static int[] descend(int[] array1){

        int[] temp_array = array1;
        
       

        System.out.println();
        for(int i=0 ; i<temp_array.length;i++){
            if(temp_array[i] < 0){
                temp_array[i] = 0;
            }

        }


       for (int i = 0; i < temp_array.length - 1; i++) {
            for (int j = 0; j < temp_array.length - 1 - i; j++) {
                if (temp_array[j] < temp_array[j + 1]) {
                    // Swap
                    int temp = temp_array[j];
                    temp_array[j] = temp_array[j + 1];
                    temp_array[j + 1] = temp;
                }
            }
        }


        System.out.print("Descending ");
         for (int i=0; i < temp_array.length; i++){
            System.out.print(temp_array[i]+ ", ");

        }

     
        return temp_array;
    }





}