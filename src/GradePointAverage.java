import java.util.Scanner;

public class GradePointAverage {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music, total = 0, divide = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math grade = ");
        math = input.nextInt();
        if (!(math < 0 || math > 100)) {
            total += math;
            divide++;
        }

        System.out.print("Enter your physics grade = ");
        physics = input.nextInt();
        if (!(physics < 0 || physics > 100)) {
            total += physics;
            divide++;
        }

        System.out.print("Enter your turkish grade = ");
        turkish = input.nextInt();
        if (!(turkish < 0 || turkish > 100)) {
            total += turkish;
            divide++;
        }

        System.out.print("Enter your chemistry grade = ");
        chemistry = input.nextInt();
        if (!(chemistry < 0 || chemistry > 100)) {
            total += chemistry;
            divide++;
        }

        System.out.print("Enter your music grade = ");
        music = input.nextInt();
        if (!(music < 0 || music > 100)) {
            total += music;
            divide++;
        }

        double average = (total / divide);

        if (average >= 55) {
            System.out.println("Congratulations! you passed the class");
            System.out.println("Your average " + average);
        } else {
            System.out.println("Sorry you missed the class");
            System.out.println("Your average " + average);
        }
    }
}
