public class level1q5 {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        int pen_per_student=pens/students;
        int remaining=pens%students;
        System.out.println("The pen per student is "+pen_per_student+" and the remaining pens not distributed is "+remaining+".");
    }
}