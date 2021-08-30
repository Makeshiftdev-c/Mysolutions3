Two points on line 1 are given as (**x1**, **y1**) and (**x2**, **y2**) and on line 2 as (**x3**, **y3**) and (**x4**, **y4**).  
The intersecting point of the two lines can be found by solving the following linear equations:  
  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{\left(%20y_{1}%20-%20y_{2}%20\right)x%20-%20\left(%20x_{1}%20-%20x_{2}%20\right)y%20=%20\left(%20y_{1}%20-%20y_{2}%20\right)%20x_{1}%20-%20\left(%20x_{1}%20-%20x_{2}%20\right)%20y_{1}%20}" />  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{\left(%20y_{3}%20-%20y_{4}%20\right)x%20-%20\left(%20x_{3}%20-%20x_{4}%20\right)y%20=%20\left(%20y_{3}%20-%20y_{4}%20\right)%20x_{3}%20-%20\left(%20x_{3}%20-%20x_{4}%20\right)%20y_{3}%20}" />  
  
This linear equation can be solved using Cramer's rule (see Programming Exercise 3.3). If the equation has no solutions, the two lines are parallel.  
  
Write a program that prompts the user to enter four points and displays the intersecting point. Here are sample runs:  
  
<pre>
Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
The intersecting point is at (2.88889, 1.1111)
</pre>  
  
<pre>
Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
The two lines are parallel
</pre>