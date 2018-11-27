# Reverse an Array
This program takes an array as an input, reverses the order of its values, and returns the new array to the user.

## Challenge
The function must accept an array of any length as a parameter.

## Approach & Efficiency
I took the approach of creating a temporary variable to hold the value at each index of the array and then reassigns
the value at the opposite end of the array to the temporarily held value's location. The temporarily held value is
then assigned to it's opposite's previous location.  This loop runs until it reaches the middle of the array.

## Solution
![alt text](../assets/array_reverse.jpg)
