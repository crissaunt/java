import java.util.Random;
import java.util.Scanner;
public class Jpe_09{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int user;

        String[] date = {"11-04-2003", "12-03-1992", "04-01-1854","01-01-2025","09-11-2001"};
        String randomDate;
        String[] objects = {
            "bag",
            "pencil",
            "t-shirt",
            "short",
            "TV",
            "mouse"
        };

        System.out.println("Choose obejcts: ");
        for (int i = 0; i < objects.length; i++) {
            System.out.printf("[%d] Object: %s\n", i+1, objects[i]);
        }
        System.out.print("Type here: ");
        user = input.nextInt();

        for (String object: objects) {
            if (objects[user-1].equals(object)){
                System.out.printf("%s", objects[user-1]);
                randomDate = date[rand.nextInt(date.length)];
                System.out.printf(" purchased on %s",randomDate);
            }
        }


        








    }
}