package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 3;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';
    private static final int TO_WIN = 3;

    static final String HEADER_FIRST_SYMBOL = "♥";
    static final String SPACE_MAP = " ";

    static final char[][] MAP = new char[SIZE][SIZE];
    static final Random random = new Random();
    static final Scanner in = new Scanner(System.in);

    static int turnsCount;

    public static void turnGame() {
        do {
            System.out.println("\n\nИГРА НАЧИНАЕТСЯ!");
            initMap();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }

    }

    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = getValidNumber() - 1;
            columnNumber = getValidNumber() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            } else {
                System.out.println("\nВы выбрали занятую ячейку!");
            }
        } while (true);

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int getValidNumber() {
        do {
            System.out.print("Введите координату: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    System.out.println("Координата " + n + " принята\n");
                    return n;
                }
                System.out.println("\nПроверьте значение координаты. Должны быть от 1 до " + SIZE);
            } else {
                System.out.println("\nВвод допускает лишь целые числа!");
                in.next();
            }
        } while (true);
    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("\nУРА!!! ВЫ ПОБЕДИЛИ!!!!!");
            } else {
                System.out.println("\nВосстание близко. ИИ победил...");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("\nНичья!");
            return true;
        }

        return false;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, symbol)) return true;
                if (checkLine(i, j, 1, 1, symbol)) return true;
                if (checkLine(i, j, 1, 0, symbol)) return true;
                if (checkLine(i, j, -1, 1, symbol)) return true;
            }
        }
        return false;
    }

    private static boolean checkLine(int y, int x, int yDirection, int xDirection, char symbol) {
        int wayX = x + (TO_WIN - 1) * xDirection;
        int wayY = y + (TO_WIN - 1) * yDirection;
        if (wayX < 0 || wayY < 0 || wayX > SIZE - 1 || wayY > SIZE - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            if (MAP[y + i * yDirection][x + i * xDirection] != symbol) return false;
        }
        return true;
    }

    private static boolean checkDraw() {
        return turnsCount == SIZE * SIZE;
    }

    private static void aiTurn() {
        System.out.println("\nХОД КОМПУКТЕРА!");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "yes", "+", "да", "торжественно подтверждаю", "конечно" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("Ты заходи если что");
    }
}
