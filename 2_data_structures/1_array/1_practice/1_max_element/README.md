## find maximum element


## Approach:
    - Initialize max with arr[0].
    - Traverse from index 1 to n - 1.
    - If arr[i] > max, update max.
    - After traversal, max contains the largest element. 

## Time Complexity (TC): 
    - O(n) -> traversal of whole array at leat once.
## Space Complexity (SC): 
    - O(1) -> no extra memory is used only i, max variable are used so constant.


## Note: 
    - we can not find maximum element in O(log n) for an unsorted array.