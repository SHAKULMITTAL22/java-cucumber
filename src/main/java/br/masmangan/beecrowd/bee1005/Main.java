package br.masmangan.beecrowd.bee1005;


import java.util.Scanner;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        StudentGrade grade;
        Scanner in;

        grade = new StudentGrade();
        in = new Scanner(System.in);

        grade.setA(in.nextDouble());
        grade.setB(in.nextDouble());

        in.close();

        System.out.printf("MEDIA = %.5f%n", grade.getAverage());
    }
}