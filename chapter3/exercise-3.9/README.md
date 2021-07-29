An ISBN-10 (International Standard Book Number) consists of 10 digits: d<sub>1</sub>d<sub>2</sub>d<sub>3</sub>d<sub>4</sub>d<sub>5</sub>d<sub>6</sub>d<sub>7</sub>d<sub>8</sub>d<sub>9</sub>d<sub>10</sub>. The last digit, d<sub>10</sub> is a checksum, which is calculated from the other 9 digits using the following formula:  
  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\large%20\color{red}{\left(%20d_{1}%20\times%201%20%2B%20d_{2}%20\times%202%20%2B%20d_{3}%20\times%203%20%2B%20d_{4}%20\times%204%20%2B%20d_{5}%20\times%205%20%2B%20d_{6}%20\times%206%20%2B%20d_{7}%20\times%207%20%2B%20d_{8}%20\times%208%20%2B%20d_{9}%20\times%209%20\right)%20\bmod%2011}" />  
  
If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read the input as an integer. Here are sample runs:  
  
<pre>
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
</pre>  
  
<pre>
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X
</pre>