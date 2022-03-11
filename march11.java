public class march11 {
    // hasNextLine checks to see if you have another line of code going down

    // prerec
    method(array, var1, var2)
    // post recursion
    helper method

    // PRE-RECURSION
    3 1 5 2 6 9 4 12
    3 1 5 2 | 6 9 4 12
    3 1 | 5 2 | 6 9 | 4 12
    3 | 1 | 5 | 2 | 6 | 9 | 4 | 12 // base case
    // POST-RECURSION
    1 3 | 2 5 | 6 9 | 4 12
    1 2 3 5 | 4 6 9 12
    1 2 3 4 5 6 9 12

    30 11 35 23 0
    30 11 | 35 23 0
    30 | 11 | 35 | 23 0
    30 | 11 | 35 | 23 | 0
    30 | 11 | 35 | 0 23
    11 30 | 0 23 35
    0 11 23 30 35
    
}
