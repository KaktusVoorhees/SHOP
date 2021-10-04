package com.company;

public class Main {

    public static void main(String[] args) {
        int cifra = 0;
        if (args.length != 0) {
            for (String i : args) {
                switch (i) {
                    case "0":
                        System.out.println("Rizek");
                        cifra += 600;
                        break;
                    case "1":
                        System.out.println("Chleba");
                        cifra += 100;
                        break;

                    case "2":
                        System.out.println("Jitrnice");
                        cifra += 1;
                        break;

                    case "3":
                        System.out.println("Erteple");
                        cifra += 900;
                        break;

                    case "4":
                        System.out.println("Pivko");
                        cifra += 2;
                        break;

                    case "5":
                        System.out.println("Absinth");
                        cifra += 5;
                        break;

                    case "6":
                        System.out.println("Krkovice");
                        cifra += 600;
                        break;

                    case "7":
                        System.out.println("Kondomy");
                        cifra += 10;
                        break;

                    case "8":
                        System.out.println("Kostici");
                        cifra += 9;
                        break;
                    case "9":
                        System.out.println("Pribináček");
                        cifra += 12;
                        break;

                    default:
                        break;
                }
            }
            System.out.println("\n-------------------------\n"+cifra+" CZK");
        } else {
            System.out.println("0 = Rizek (600 CZK)");
            System.out.println("1 = Chleba (100 CZK)");
            System.out.println("2 = Jitrnice (1 CZK)");
            System.out.println("3 = Erteple (900 CZK)");
            System.out.println("4 = Pivko (2 CZK)");
            System.out.println("5 = Absinth (5 CZK)");
            System.out.println("6 = Krkovice (600 CZK)");
            System.out.println("7 = Kondomy (10 CZK)");
            System.out.println("8 = Kostici (9 CZK)");
            System.out.println("9 = Pribinacek (12 CZK)");
        }
    }
}
