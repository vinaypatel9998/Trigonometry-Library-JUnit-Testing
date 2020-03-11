<h1>User defined trigonometry functions and its testing using JUnit :</h1>

The project implements the trigonometric fucntion SIN,COS and TAN using the corresponding taylor series.
Testing has been implemented using Junit.

<h2>Functions included :</h2> 

1)  sin function
2)  cos function
3)  tan function

<h2>It also include's the other functions :</h2> 

1)  degreetoradian conversion function
2)  normalization function (i.e. converting angle between 0-2*PI) 
3)  factorial function 
4)  power function

<h2>Test Cases :</h2>

1)  Comparing the actual and expected values of trigonometry functions in radian
2)  Checking the further functionalities such as power and factorial
3)  Comparing the values further in degree by using degreetoradian conversion function 
4)  Normalizing the radian values between 0-2*PI using normalization function

<h2>Test Case Implementation in four phase of versions</h2>

<h3>Version 1.0</h3>

-   In the first version, we had checked the test cases of trigonometry functions to compare actual 
    and expected radian values. 
    ![](https://gitlab.cs.uwindsor.ca/ase-lab-group-3/triglibrary-junit-testing/-/blob/master/TrigLibrary-JUnit-Testing/Screenshots/Version%201.0.png)

<h3>Version 2.0</h3>

-   In the second version, we had checked the test cases of the other functionalities such as power and factorial 
    that are required to find the terms of the taylor series.

<h3>Version 3.0</h3>

-   In the third version, we had checked the test cases that whether the functions are giving the same expected and 
    actual values for the given degree input. For that, we had applied degree to radian function.

<h3>Version 4.0</h3>

-   In the fourth version, we had checked the test cases of the normalization function that is required to normalize 
    the radian values between 0 - 2*PI.  