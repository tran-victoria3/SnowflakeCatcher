SampleAssignment
================

A Sample Assignment that will go through the workflow of gi

In this assignment you will create a class to model a single snow flake. Then you will create an array of many snowflakes.
 
Steps to completing the program (These are just a suggested starting point. Feel free to adjust them anyway you'd like):
Clone and fork the SnowFlakeCatcher repository
Add the following to the SnowFlake class. 
2 member integer variables: x and y
1 member boolean variable: isMoving
The constructor should initialize the members as follows:
x: random integer from 0 to 300 (or whatever the width of the screen is)
y: random integer from 0 to 300 (or whatever the height of the screen is)
isMoving: true
void erase() which first, sets the fill to black and draws a black ellipse of size 7 at (x,y)
void move() which checks if the snow flake isMoving. If it is, increase y by one
void lookDown() checks if y is between the top and bottom of the screen, and the position just below (x,y) is not black. If so, set isMoving to false; otherwise set isMoving to true 
void show() which draws a white ellipse of size 5 at x,y
void wrap() which checks if the y coordinate is off the bottom of the screen. If it is, set y to 0 and generate a new random x coordinate
Now create an array of SnowFlakes. In draw write a loop that goes through the array and for each snow flake does the following:

