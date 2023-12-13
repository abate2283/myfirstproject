package org.bate.generical.boundtypegenerics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentInterviewQuestion {
    private String name;
    private LocalDate dateOfBirth;

    private int gradeLevel;

    @Override
    public String toString() {
        return "StudentInterviewQuestion{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gradeLevel=" + gradeLevel +
                '}';
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public StudentInterviewQuestion(String name, LocalDate dateOfBirth, int gradeLevel) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gradeLevel = gradeLevel;
    }

    public StudentInterviewQuestion() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static void main(String[] args) {
        List<StudentInterviewQuestion> studentList = new ArrayList<>();
        studentList.add(new StudentInterviewQuestion("Jane", LocalDate.of(1985,12, 05),5));
        studentList.add(new StudentInterviewQuestion("Bertha", LocalDate.of(1984,12, 05),5));
        studentList.add(new StudentInterviewQuestion("Candice", LocalDate.of(1983,12, 05),5));
        studentList.add(new StudentInterviewQuestion("Adam", LocalDate.of(1975,1, 04),4));
        studentList.add(new StudentInterviewQuestion("Zen", LocalDate.of(1976,1, 04),4));
        studentList.add(new StudentInterviewQuestion("Yves", LocalDate.of(1977,1, 04),4));
        studentList.add(new StudentInterviewQuestion("Mary", LocalDate.of(1954,2, 06),3));
        studentList.add(new StudentInterviewQuestion("Nancy", LocalDate.of(1953,2, 06),3));
        studentList.add(new StudentInterviewQuestion("Olivia", LocalDate.of(1951,2, 06),3));
        studentList.add(new StudentInterviewQuestion("Quin", LocalDate.of(1965,8, 20),2));
        studentList.add(new StudentInterviewQuestion("Roberta", LocalDate.of(1966,8, 20),2));
        studentList.add(new StudentInterviewQuestion("Sally", LocalDate.of(1967,8, 20),2));

        List<StudentInterviewQuestion> ListOfStudents = studentList.stream()
                .filter(studentInterviewQuestion -> studentInterviewQuestion.dateOfBirth.isAfter(LocalDate.of(1980, 12, 22))).collect(Collectors.toList());

        System.out.println(ListOfStudents);

        List<StudentInterviewQuestion> studentGradesLevels = studentList.stream()
                .filter(studentInterviewQuestion -> studentInterviewQuestion.gradeLevel <= 3).collect(Collectors.toList());
        studentGradesLevels.forEach(System.out::println);
    }
}
