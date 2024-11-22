import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < student.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            boolean e = sc.nextBoolean();
            student[i] = new Student(a, b, c, d, e);
        }
        int cnt = findCountOfDayscholarStudents(student);
        if (cnt > 0) {
            System.out.println("Ans: " + cnt);
        } else {
            System.out.println("There are no such dayscholar students");
        }
        Student ans2 = findStudentwithSecondHighestScore(student);
        if (ans2 == null) {
            System.out.println("No student found");
        } else {
            System.out.println(ans2.getRoll() + "#" + ans2.getName() + "#" + ans2.getScore());
        }
    }

    public static int findCountOfDayscholarStudents(Student[] s) {
        int cnt = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].getDayScholar() && s[i].getScore() > 80) {
                cnt++;
            }
        }
        return cnt;
    }

    public static Student findStudentwithSecondHighestScore(Student[] s) {
        double max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < s.length; i++) {
            if (s[i].getScore() > max) {
                max = s[i].getScore();
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i].getScore() > max2 && s[i].getScore() < max) {
                max2 = s[i].getScore();
            }
        }
        for (int i = 0; i < s.length; i++) {
            if ((!s[i].getDayScholar()) && (s[i].getScore() == max2)) {
                return s[i];
            }
        }
        return null;
    }

}

class Student {
    private int rollNo;
    private String name, branch;
    private double score;
    private boolean dayScholar;

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    public void setRoll(int rollno) {
        this.rollNo = rollno;
    }

    public int getRoll() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }

    public boolean getDayScholar() {
        return dayScholar;
    }

}
