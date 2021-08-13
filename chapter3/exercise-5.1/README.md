Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is  
  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\huge%20\color{red}{h%20=%20\left(q%20%2B%20\frac{26\left(m%20%2B%201\right)}{10}%20%2B%20k%20%2B%20\frac{k}{4}%20%2B%20\frac{j}{4}%20%2B%205j\right)%20\bmod%207}" />  
  
where  
  
* **h** is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).  
* **q** is the day of the month.  
* **m** is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.  
* **j** is <img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{\frac{year}{100}}" />  
* **k** is the year of the century (i.e., year % 100).  
  
Note all divisions in this exercise perform an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. Here are some sample runs:  
  
<pre>
Enter year: (e.g., 2012): 2015
Enter month: 1-12: 1
Enter the day of the month: 1-31: 25
Day of the week is Sunday
</pre>  
  
<pre>
Enter year: (e.g., 2012): 2012
Enter month: 1-12: 5
Enter the day of the month: 1-31: 12
Day of the week is Saturday
</pre>