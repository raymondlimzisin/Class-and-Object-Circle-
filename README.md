Problem Description

A class named Circle is defined as follows.

Private instance variable named radius that represents the radius of the circle.
The constructor Circle()that initialized radius to 0.0.
setRadius(double) method to set a new radius value
getRadius() method that returns the radius
getArea() method that returns the area of the circle.
getCircumference() method to returns the circumference of the circle.
 

The UML Class Diagram for class Circle is as the following.

Circle

-radius: double

+Circle()

+setRadius(radius:double): void

+getRadius(): double

+getArea(): double

+getCircumference(): double

 

Write the code for Circle class and a test program named CircleApp that reads the input and prints the output as described below.

Input

The first line contains an integer n (1 ≤ n ≤ 50) which determines the number of test cases. Each of the following n lines contains a positive real number r (0.0 ≤ r ≤ 500.00) which represents the radius of the circle.

 

Output

For each test case, the output contains a line in the format "Case #x: ", where x is the case number (starting from 1) follows by the radius, area, and circumference of the circle. Format the output in 2 decimal places.

 

Sample Input Output

Sample Input

2

9.0

5.5

Sample Output

Case #1: 9.00 254.47 56.55

Case #2: 5.50 95.03 34.56

