Write a program that prompts the user to enter a point (**x**, **y**) and checks whether the point is within the circle centered at (**0**, **0**) with radius **10**. For example, (**4**, **5**) is inside the circle and (**9**, **9**) is outside the circle.  
  
(*Hint:* A point is in the circle if its distance to (**0**, **0**) is less than or equal to **10**. The formula for computing the distance is <img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{\sqrt{\left(%20x_{2}%20-%20x_{1}%20\right)^{2}%20%2B%20\left(%20y_{2}%20-%20y_{1}%20\right)^{2}}}" />. Test your program to cover all cases.) Two sample runs are shown below:  
  
<pre>
Enter a point with two coordinates: 4   5
Point (4.0, 5.0) is in the circle
</pre>  
  
<pre>
Enter a point with two coordinates: 9   9
Point (9.0, 9.0) is not in the circle
</pre>