The two roots of a quadratic equation <img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{ax^{2}%20%2B%20bx%20%2B%20c%20=%200}" /> can be obtained using the following formula:  
  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\huge%20\color{red}{r_{1}%20=%20\frac{-b%20%2B%20\sqrt{%20b^{2}%20-%204ac%20}}{2a}}" />   and    <img alt="formula" src="https://render.githubusercontent.com/render/math?math=\huge%20\color{red}{r_{2}%20=%20\frac{-b%20-%20\sqrt{%20b^{2}%20-%204ac%20}}{2a}}" />  
  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{b^{2}%20-%204ac}" /> is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.  
  
Write a program that prompts the user to enter values for *a*, *b*, and *c* and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is **0**, display one root. Otherwise, display "The equation has no real roots."  
  
Note you can use **Math.pow(x, 0.5)** to compute <img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{\sqrt{x}}" />. Here are some sample runs:  
  
<pre>
Enter a, b, c: 1.0   3   1
The equation has two roots -0.381966 and -2.61803
</pre>  
  
<pre>
Enter a, b, c: 1   2.0   1
The equation has one root -1.0
</pre>  
  
<pre>
Enter a, b, c: 1   2   3
The equation has no real roots
</pre>