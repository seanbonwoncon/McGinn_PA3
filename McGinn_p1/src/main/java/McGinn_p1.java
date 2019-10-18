import java.util.Scanner;
import java.security.SecureRandom;

public class McGinn_p1 {

    public static int questions(int a, int b, int counter, int rightAns, int diff, int type){
        Scanner scnr = new Scanner(System.in);

        double response;
        int s = 0;
        double c = questionType(a, b, type);

        response = scnr.nextInt();

        if(Double.compare(response, c) == 0){
            s = 1;
            String correct = switchStatements(s);
            System.out.println(correct);
            counter = counter + 1;
            rightAns = rightAns + 1;
        }
        else{
            String incorrect = switchStatements(s);
            System.out.println(incorrect);
            counter = counter + 1;
        }
        if (counter == 11) {
            int wrong = 10 - rightAns;
            if(rightAns < 8){
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("You got " + rightAns +" questions right and " + wrong + " questions wrong.");
            }
            if(rightAns >= 8){
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("You got " + rightAns +" questions right and " + wrong + " questions wrong.");
            }
            return 0;
        }
        else {
            System.out.println("question " + counter);
            int num1 = difficulty(diff);
            int num2 = difficulty(diff);
            questions(num1, num2, counter, rightAns, diff, type);
        }
        return 0;
    }

    public static double questionType(int a, int b, int type){
        SecureRandom Random = new SecureRandom();
        double ans = 0;
        if(type == 5){
            type = Random.nextInt(4) +1;
        }
        if(type == 1){
            System.out.println("How much is " + a + " plus " + b + "?");
            ans = a + b;
            return ans;
        }
        if(type == 2){
            System.out.println("How much is " + a + " times " + b + "?");
            ans = a * b;
            return ans;
        }
        if(type == 3){
            System.out.println("How much is " + a + " minus " + b + "?");
            ans = a - b;
            return ans;
        }
        if(type == 4){
            System.out.println("How much is " + a + " divided by " + b + "?");
            ans = a / b;
            return ans;
        }
        return 0;

    }

    public static String switchStatements(int s) {
        SecureRandom Random = new SecureRandom();
        int i = Random.nextInt(4) + 1;
        String str = "";
        if (s == 1) {
            switch (i) {
                case 1:
                    str = "Very good!";
                    break;
                case 2:
                    str = "Excellent!";
                    break;
                case 3:
                    str = "Nice work!";
                    break;
                case 4:
                    str = "Keep up the good work!";
                    break;
            }
            return str;
        }
        else {
            switch (i) {
                case 1:
                    str = "No. Please try again.";
                    break;
                case 2:
                    str = "Wrong. Try once more.";
                    break;
                case 3:
                    str = "Don’t give up!";
                    break;
                case 4:
                    str = "No. Keep trying.";
                    break;
            }
            return str;
        }

    }

    public static int programLoop(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter a difficulty 1-4");
        int diff = scnr.nextInt();

        int num1 = difficulty(diff);
        int num2 = difficulty(diff);

        System.out.println("enter a problem type 1-5");
        System.out.println("1 for addition, 2 for multiplication, 3 for subtraction 4 for division and 5 for all");
        int type = scnr.nextInt();
        int counter = 1;
        int right = 0;
        System.out.println("question " + counter);
        questions(num1,num2, counter, right, diff, type);

        System.out.println("type 1 to continue or 0 to exit");
        int i = scnr.nextInt();
        if(i == 1){
            programLoop();
        }
        return 0;
    }

    public static int difficulty(int diff){
        SecureRandom Random = new SecureRandom();
        if(diff == 1) {
            return Random.nextInt(9) +1;
        }
        if(diff == 2){
            return Random.nextInt(89) + 10;
        }
        if(diff == 3){
            return Random.nextInt(899) + 100;
        }
        if(diff == 4){
            return Random.nextInt(8999) + 1000;
        }
        else
            return 1;
    }
    public static void main(String[] args) {
        programLoop();

        return;
    }
}
