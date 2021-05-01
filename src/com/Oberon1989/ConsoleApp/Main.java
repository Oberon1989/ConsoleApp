package com.Oberon1989.ConsoleApp;

import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double STEP_IN_SPAN = 10;
        final double SPAN_IN_FLOOR = 2;
        double floor, liveInStep;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floor");
        floor = scanner.nextDouble();
        System.out.println("Enter live seconds in step");
        liveInStep = scanner.nextDouble();

        result = floor * STEP_IN_SPAN * SPAN_IN_FLOOR * liveInStep;
        System.out.println(result);

    }
}
