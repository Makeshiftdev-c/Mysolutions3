How cold is it outside? The temperature alone is not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using temperature and wind speed. The formula is  
  
<img alt="formula" src="https://render.githubusercontent.com/render/math?math=\huge%20\color{red}{t_{wc}%20=%2035.74%20%2B%200.6215%20t_{a}%20-%2035.75%20v^{0.16}%20%2B%200.4275%20t_{a}%20v^{0.16}%20}" />  
  
where *t*<sub>*a*</sub> is the outside temperature measured in degrees Fahrenheit, *v* is the speed measured in miles per hour, and *t*<sub>*wc*</sub> is the wind-chill temperature. The formula cannot be used for wind speeds below **2 mph** or temperatures below **-58°F** or above **41°F**.  
  
Write a program that prompts the user to enter a temperature between **-58°F** and **41°F** and a wind speed greater than or equal to **2** then displays the wind-chill temperature. Use **Math.pow(a, b)** to compute *v*<sup>0.16</sup>. Here is a sample run:  
  
<pre>
Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
Enter the wind speed (>= 2) in miles per hour: 6
The wind chill index is -5.56707
</pre>