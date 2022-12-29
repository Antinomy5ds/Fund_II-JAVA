import java.util.ArrayList;

public class Grader {
    private String courseName;
    private ArrayList<Double> scores = new ArrayList<Double>();

    public Grader(String name) { // ให้ชื่อวิชาที่รับมาอยู่ใน Coursename
        courseName = name;
    }

    public void addScore(double score) { // รับค่า score จากคีย์บอร์ดแล้วให้นำค่าเข้า arraylist
        scores.add(score);
    }

    public int countStudents() { // นับจำนวนนักเรียนทั้งหมด
        return scores.size();
    }

    public double mean() { // หาค่าเฉลี่ยคะแนนนักเรียนทั้งหมด
        double sum = 0;
        for (double i : scores) {
            sum += i;
        }
        return sum / countStudents();
    }

    public int belowMean() { // ตรวจสอบว่ามีกี่คนที่คะแนนไม่ผ่านค่าเฉลี่ย
        int countBelow = 0;
        for (double below : scores) {
            if (below < mean()) {
                countBelow++;
            }
        }
        return countBelow;
    }

    public int aboveMean() { // ตรวจสอบว่ามีกี่คนที่คะแนนมากกว่าค่าเฉลี่ย
        int countAbove = 0;
        for (double above : scores) {
            if (above > mean()) {
                countAbove++;
            }
        }
        return countAbove;
    }

    public void showGrade() { // แสดงผลว่ามีคนได้เกรดอะไรบ้างอย่างละเท่าไหร่
        int a = 0, bPlus = 0, b = 0, cPlus = 0, c = 0, dPlus = 0, d = 0, f = 0;
        for (double grade : scores) {
            if (grade >= 80) {
                a++;
            } else if (grade >= 75) {
                bPlus++;
            } else if (grade >= 70) {
                b++;
            } else if (grade >= 65) {
                cPlus++;
            } else if (grade >= 60) {
                c++;
            } else if (grade >= 55) {
                dPlus++;
            } else if (grade >= 50) {
                d++;
            } else {
                f++;
            }
        }
        System.out.printf("Grade : A %d, B+ %d, B %d, C+ %d, C %d, D+ %d , D %d, F %d", a, bPlus, b, cPlus, c, dPlus, d,
                f);
    }

    public String getCourseName() { // เรียกค่าชื่อวิชา
        return this.courseName;
    }
}
