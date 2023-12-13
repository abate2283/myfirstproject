package org.bate.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DatabaseStudents {
    public static List<Student> getStudents(){
        return Stream.of(new Student("Angel Bate", "angel@emails.com", Arrays.asList("Chemistry", "Physics", "Software Engineering"))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> studentList = DatabaseStudents.getStudents();
        var stringList = studentList.stream()
                .map(student -> student.getName()).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("******USING FLATMAP******");
        var studentFlatMap = studentList.stream()
                .flatMap(student -> student.getCourses().stream()).collect(Collectors.toList());
        System.out.println(studentFlatMap);

        System.out.println("*****USING FILTER AND MAP*****");

        var studentMapFilter = studentList.stream()
                .map(student -> student.getEmail())
                .filter(s -> s.equalsIgnoreCase("angel bate")).collect(Collectors.toList());
        System.out.println(studentMapFilter);
    }

}
