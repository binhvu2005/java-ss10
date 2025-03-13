import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai7 {
    public static class Student{
        private String name;
        private String id;
        private double gpa;

        public Student(String name, String id, double gpa){
            this.name = name;
            this.id = id;
            this.gpa = gpa;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
        public void getDetails(){
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("GPA: " + gpa);
        }

    }
    public static class GraduateStudent extends Student{
        private String researchTopic ;
        private String supervisorName ;
        public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName){
            super(name, id, gpa);
            this.researchTopic = researchTopic;
            this.supervisorName = supervisorName;
        }
        public String getSupervisorName() {
            return this.supervisorName;
        }
        public void setSupervisorName(String supervisorName) {
            this.supervisorName = supervisorName;
        }
        public String getResearchTopic() {
            return this.researchTopic;
        }
        public void setResearchTopic(String researchTopic) {
            this.researchTopic = researchTopic;
        }
        @Override
        public void getDetails(){
            super.getDetails();
            System.out.println("Research Topic: " + this.researchTopic);
            System.out.println("Supervisor Name: " + this.supervisorName);
        }
      public static void main(String[] args){
            List<GraduateStudent> students = new ArrayList<GraduateStudent>();
            students.add(new GraduateStudent("John Doe", "12345", 3.8, "Artificial Intelligence", "Dr. Smith"));
            students.add(new GraduateStudent("Jane Smith", "67890", 3.5, "Machine Learning", "Dr. Johnson"));
            for(GraduateStudent student : students){
                student.getDetails();
            }
      }

    }
}
