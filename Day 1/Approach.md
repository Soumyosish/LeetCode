Intuition
To solve this problem we need to look the edge cases to cover the given constraints.

(a) When the last element is not 9 in the array
(b) When the last digit is 9 and others are less than 9 in the array
(c) When all the elements are 9 in the array

Approach
we can simply solve by using the array concept through for loop.
At first we need to check whether the last element is greater than 9 or not.
If the last element of the array is less than 9 just simply increase the value by 1 and return the array.
If the last element of the array is greater than 9 then make the last element of the array to 0 and increase the second last element of the array to +1 of its initial value.
If all the elements of the array is greater than 9 then increase the length of the array by 1 and update the last element of the array to 0 and increase the second last element of the array to +1 of its initial value.
This solves the one edge cases

Complexity
Time complexity:
O(n)
Space complexity:
O(1)