import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pos1 = 1;
        String strPos1 = "1";
        int check1 = 1;

        int pos2 = 2;
        String strPos2 = "2";
        int check2 = 2;

        int pos3 = 3;
        String strPos3 = "3";
        int check3 = 3;

        int pos4 = 4;
        String strPos4 = "4";
        int check4 = 4;

        int pos5 = 5;
        String strPos5 = "5";
        int check5 = 5;

        int pos6 = 6;
        String strPos6 = "6";
        int check6 = 6;

        int pos7 = 7;
        String strPos7 = "7";
        int check7 = 7;

        int pos8 = 8;
        String strPos8 = "8";
        int check8 = 8;

        int pos9 = 9;
        String strPos9 = "9";
        int check9 = 9;


        System.out.println("WELCOME TO TIC TAC TOE");
        System.out.println("~ ~ ~ ~ ~");
        System.out.println("");

        // board
        System.out.println(strPos1 + " | " + strPos2 + " | " + strPos3);
        System.out.println("---------");
        System.out.println(strPos4 + " | " + strPos5 + " | " + strPos6);
        System.out.println("---------");
        System.out.println(strPos7 + " | " + strPos8 + " | " + strPos9);

        int counter = 0;
        boolean player1 = false;
        boolean player2 = false;

        while ((!(check1 == check2 && check2 == check3) && !(check4 == check5 && check5 == check6) &&
                !(check7 == check8 && check8 == check9) && !(check1 == check4 && check4 == check7) &&
                !(check2 == check5 && check5 == check8) && !(check3 == check6 && check6 == check9) &&
                !(check1 == check5 && check5 == check9) && !(check3 == check5 && check5 == check7)) && counter < 9) {

            System.out.println("Pick your position");
            System.out.println("Player 1: ");
            int play1pos1 = scanner.nextInt();
            scanner.nextLine();

            if (play1pos1 == pos1) {
                strPos1 = "X";
                check1 = 11;
            } else if (play1pos1 == pos2) {
                strPos2 = "X";
                check2 = 11;
            } else if (play1pos1 == pos3) {
                strPos3 = "X";
                check3 = 11;
            } else if (play1pos1 == pos4) {
                strPos4 = "X";
                check4 = 11;
            } else if (play1pos1 == pos5) {
                strPos5 = "X";
                check5 = 11;
            } else if (play1pos1 == pos6) {
                strPos6 = "X";
                check6 = 11;
            } else if (play1pos1 == pos7) {
                strPos7 = "X";
                check7 = 11;
            } else if (play1pos1 == pos8) {
                strPos8 = "X";
                check8 = 11;
            } else if (play1pos1 == pos9) {
                strPos9 = "X";
                check9 = 11;
            }

            System.out.println(strPos1 + " | " + strPos2 + " | " + strPos3);
            System.out.println("---------");
            System.out.println(strPos4 + " | " + strPos5 + " | " + strPos6);
            System.out.println("---------");
            System.out.println(strPos7 + " | " + strPos8 + " | " + strPos9);

            counter++;

            if ((((check1 == check2 || check2 == check3) || (check4 == check5 && check5 == check6) ||
                    (check7 == check8 && check8 == check9) || (check1 == check4 && check4 == check7) ||
                    (check2 == check5 && check5 == check8) || (check3 == check6 && check6 == check9) ||
                    (check1 == check5 && check5 == check9) || (check3 == check5 && check5 == check7))) && (check1 == 11 ||
                    check3 == 11 || check5 == 11 || check7 == 11 || check9 == 11)) {
                System.out.println("Player 1 WINS");
                player1 = true;
            }

            if (player1)
                break;

            if (counter < 9) {

                System.out.println("Pick your position");
                System.out.println("Player 2: ");
                int play2pos1 = scanner.nextInt();
                scanner.nextLine();

                if (play2pos1 == pos1) {
                    strPos1 = "O";
                    check1 = 22;
                } else if (play2pos1 == pos2) {
                    strPos2 = "O";
                    check2 = 22;
                } else if (play2pos1 == pos3) {
                    strPos3 = "O";
                    check3 = 22;
                } else if (play2pos1 == pos4) {
                    strPos4 = "O";
                    check4 = 22;
                } else if (play2pos1 == pos5) {
                    strPos5 = "O";
                    check5 = 22;
                } else if (play2pos1 == pos6) {
                    strPos6 = "O";
                    check6 = 22;
                } else if (play2pos1 == pos7) {
                    strPos7 = "O";
                    check7 = 22;
                } else if (play2pos1 == pos8) {
                    strPos8 = "O";
                    check8 = 22;
                } else if (play2pos1 == pos9) {
                    strPos9 = "O";
                    check9 = 22;
                }

                System.out.println(strPos1 + " | " + strPos2 + " | " + strPos3);
                System.out.println("---------");
                System.out.println(strPos4 + " | " + strPos5 + " | " + strPos6);
                System.out.println("---------");
                System.out.println(strPos7 + " | " + strPos8 + " | " + strPos9);

                counter++;
            }
            if ((((check1 == check2 || check2 == check3) || (check4 == check5 && check5 == check6) ||
                    (check7 == check8 && check8 == check9) || (check1 == check4 && check4 == check7) ||
                    (check2 == check5 && check5 == check8) || (check3 == check6 && check6 == check9) ||
                    (check1 == check5 && check5 == check9) || (check3 == check5 && check5 == check7)) && (check1 == 11 ||
                    check3 == 22 || check5 == 22 || check7 == 22 || check9 == 22))) {
                System.out.println("Player 2 WINS");
                player2 = true;
            }
            if (player2)
                break;

        }

        if(!player1 && !player2)
        {
            System.out.println("STALEMATE");
        }



    }
}