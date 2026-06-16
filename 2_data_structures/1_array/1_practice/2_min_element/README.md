## find minimum element

## Approach:
    - Initialize min with arr[0].
    - Traverse from index 1 to n - 1.
    - If arr[i] < min, update min.
    - After traversal, min contains the smallest element. 

## Time Complexity (TC): 
    - O(n) -> traversal of whole array at leat once.
## Space Complexity (SC): 
    - O(1) -> no extra memory is used only i, min variable are used so constant.

## Note: 
    - we can not find manimum element in O(log n) for an unsorted array.