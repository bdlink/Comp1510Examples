package ca.bcit.comp1510.ch08;

/**
 * Two dimensional matrix of double.  Size of matrix is fixed on creation.
 * @author blink
 * @version 1.0
 */
public class Matrix {
    /** number of rows in the matrix. */
    public final int rows;
    
    /** number of columns in the matrix. */
    public final int columns;
    
    /** holds coefficients of the matrix. */
    private double[][] coefs;
    
    /**
     * Creates a matrix with a defined number of rows and columns, with zero 
     * coefficients.  All columns must have a non-null row.  All rows must 
     * have the same length.
     * @param rows number of rows, >= 0
     * @param columns number of columns, >= 0
     */
    public Matrix(int rows, int columns) {
        if (rows < 0 || columns < 0) {
            throw new IllegalArgumentException("rows and columns must be >= 0");
        }
        coefs = new double[rows][columns];
        
        this.rows = rows;
        this.columns = columns;
    }
    
    /**
     * Adds b to this matrix and returns the result.  
     * Both matrices must have same number of rows and columns.
     * @param b matrix to add
     * @return this + b
     */
    public Matrix add(Matrix b) {
        if (this.rows != b.rows
                || this.columns != b.columns) {
            throw new IllegalArgumentException(
                    "matrices must have same number of rows and columns");
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setCoef(i, j, coefs[i][j] + b.getCoef(i, j));
            }
        }
        return result;
    }
    
    
    /**
     * Subtracts b from this matrix and returns the result.  
     * Both matrices must have same number of rows and columns.
     * @param b matrix to subtract
     * @return this + b
     */
    public Matrix sub(Matrix b) {
        if (this.rows != b.rows
                || this.columns != b.columns) {
            throw new IllegalArgumentException(
                    "matrices must have same number of rows and columns");
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setCoef(i, j, coefs[i][j] - b.getCoef(i, j));
            }
        }
        return result;
    }
    
    
    /**
     * Multiplies this matrix times b and returns the result.  
     * this.columns must equal b.rows.
     * @param b matrix to multiply
     * @return this * b
     */
    public Matrix mul(Matrix b) {
        if (this.rows != b.columns) {
            throw new IllegalArgumentException(
                    "the number of columns of the first matrix must equal the "
                    + "number of columns of the second matrix");
        }
        Matrix result = new Matrix(this.rows, b.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < b.columns; j++) {
                double z = coefs[i][0] * b.getCoef(0, j);
                for (int k = 1; k < this.rows; k++) {
                    z += coefs[i][k] * b.getCoef(k, j);
                }
                result.setCoef(i, j, z);
            }
        }
        return result;
    }

    /**
     *  Returns the coefficient for a row, column.
     * @param row the row index, >= 0
     * @param col the column index >= 0
     * @return the coefficient
     */
    public double getCoef(int row, int col) {
        validateDimensions(row, col);
        return coefs[row][col];
    }
    
    /**
     * Set coefficient at row, col to value.
     * @param row row index
     * @param col column index
     * @param value new value.
     */
    public void setCoef(int row, int col, double value) {
        validateDimensions(row, col);
        coefs[row][col] = value;
        
    }
    
    private void validateDimensions(int row, int col) {
        if (row < 0 || row > this.rows || col < 0 || col < this.columns) {
            throw new IllegalArgumentException("out of range row or column");
        }
    }

}
