package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçapı girin : ");
        double r = scanner.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz (𝛼 derece cinsinden): ");
        double alpha = scanner.nextDouble();
        double pi = 3.14;
        double Circumference = 2*pi*r;
        double area = pi*r*r;

        // Dereceyi radyana çevirme
        double alphaRadian = Math.toRadians(alpha);

        // Daire dilimi alanını hesaplama
        double circlePieArea= (pi * r * r * alphaRadian) / 360;

        System.out.println("Daire dilimi alanı: " + circlePieArea);
    }
}