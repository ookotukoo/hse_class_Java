import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        /*Задача 4 (вариант 5).
        Определить матрицу (двумерный массив) и ее заполнить случайными значениями.
        Построить вектор В, которой возвращает – номер максимального значения в i-й строке.*/

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int MatrixLength = 0;
        int MatrixDepth = 0;
        int iString = 0;

        //Ввод длинны матрицы
        System.out.printf("Введите длинну матрицы: ");
        while (true) {
            try {
                MatrixLength = Integer.parseInt(input.nextLine());
                if (MatrixLength > 1) {
                    break;
                } else {
                    throw new Exception("Число должно быть больше 0.");
                }
            } catch (NumberFormatException e ) {
                System.out.println("Нужно ввести целове число. Попробуй ещё раз.");
                System.out.printf("Введите длинну матрицы: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.printf("Введите длинну матрицы: ");
            }
        }

        //Ввод глубины матрицы
        System.out.printf("Введите глубину матрицы: ");
        while (true) {
            try {
                MatrixDepth = Integer.parseInt(input.nextLine());
                if (MatrixDepth > 1) {
                    break;
                } else {
                    throw new Exception("Число должно быть больше 0.");
                }
            } catch (NumberFormatException e ) {
                System.out.println("Нужно ввести целове число. Попробуй ещё раз.");
                System.out.printf("Введите глубину матрицы: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.printf("Введите глубину матрицы: ");
            }
        }

        Vector matrix = new Vector<>();
        for (int i = 0; i < MatrixDepth; i++) {
            Vector newVector = new Vector<>();
            for (int j = 0; j < MatrixLength; j++) {
                newVector.add(random.nextInt(1, 10));
            }
            matrix.add(newVector);
        }
        System.out.println(matrix);

        //Ввод i-той строки
        System.out.printf("В какой строке искать: ");
        while (true) {
            try {
                iString = Integer.parseInt(input.nextLine());
                if (iString > 1) {
                    if (iString <= MatrixDepth) {
                        break;
                    } else {
                        throw new Exception("Число должно быть меньше " + MatrixDepth);
                    }
                } else {
                    throw new Exception("Число должно быть меньше 0.");
                }
            } catch (NumberFormatException e ) {
                System.out.println("Нужно ввести целове число. Попробуй ещё раз.");
                System.out.printf("Введите глубину матрицы: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.printf("В какой строке искать: ");
            }
        }
        Vector<Integer> B = new Vector<>();
        B.add(maxVal(matrix, iString));
        System.out.println(B);

    }
    public static int maxVal (Vector<Vector<Integer>> matrix, int iString) {
        Vector vec1 = new Vector<>();
        vec1 = (Vector<Integer>) matrix.get(iString-1);
        return (int) Collections.max(vec1);
    }
}
