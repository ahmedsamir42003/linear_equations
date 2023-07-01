# linear_equations
This Java program is designed to solve a system of linear equations using Gaussian elimination. The user is prompted to enter the number of equations and the maximum number of unknowns in each equation. The program then prompts the user to enter the coefficients of each equation, which are stored in a 2D array.

The program then performs Gaussian elimination to transform the system of equations into an upper triangular matrix form. Once the matrix is in this form, the program can determine whether the system has a unique solution, no solution, or infinitely many solutions.

If the system has no solution, the program prints a message indicating that the system is inconsistent. If the system has infinitely many solutions, the program prints the matrix in its reduced row echelon form and suggests that the user solve it by back substitution.

If the system has a unique solution, the program uses back substitution to solve for the values of the unknowns. The solution is stored in an array, which is then printed to the console.

This program demonstrates the power of using programming to solve complex problems, such as systems of linear equations. By automating the process of Gaussian elimination and back substitution, this program can quickly and accurately solve systems of equations with any number of unknowns
