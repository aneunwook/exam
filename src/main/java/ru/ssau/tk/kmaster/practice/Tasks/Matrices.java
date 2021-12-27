package ru.ssau.tk.kmaster.practice.Tasks;

public class Matrices {

    public static Matrix sumOfMatrices(Matrix matrixOne, Matrix matrixTwo) {
        if (matrixOne.getColumns() != matrixTwo.getColumns() || matrixOne.getLines() != matrixTwo.getLines()) {
            return null;
        }
        Matrix sum = new Matrix(matrixOne.getColumns(), matrixTwo.getLines());
        for (int column = 0; column < sum.getColumns(); column++) {
            for (int line = 0; line < sum.getLines(); line++) {
                double sumElements = matrixOne.getAt(column, line) + matrixTwo.getAt(column, line);
                sum.setAt(column, line, sumElements);
            }
        }
        return sum;
    }

    public static Matrix matrixMultiplication(Matrix matrixOne, Matrix matrixTwo) {
        if (matrixOne.getLines() != matrixTwo.getColumns()) {
            return null;
        }
        Matrix multiplication = new Matrix(matrixOne.getLines(), matrixTwo.getColumns());
        for (int line = 0; line < multiplication.getLines(); line++) {
            for (int column = 0; column < multiplication.getColumns(); column++) {
                double newElement = 0;
                for (int element = 0; element < matrixTwo.getLines(); element++) {
                    newElement += matrixOne.getAt(element, line) * matrixTwo.getAt(column, element);
                    multiplication.setAt(column, line, newElement);
                }
            }
        }
        return multiplication;
    }

    public static Matrix multiplicationByNumber(Matrix matrixOne, double number) {
        Matrix multiplication = new Matrix(matrixOne.getColumns(), matrixOne.getLines());
        for (int column = 0; column < multiplication.getColumns(); column++) {
            for (int line = 0; line < multiplication.getLines(); line++) {
                double element = matrixOne.getAt(column, line) * number;
                multiplication.setAt(column, line, element);
            }
        }
        return multiplication;
    }
}