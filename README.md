1. Create an ArrayList called `originalList` with some duplicate values.
   - Add "Apple", "Banana", "Cherry", "Date", "Banana", "Apple" to `originalList`.

2. Print the original list:
   - Output: "Original List: " + `originalList`

3. Create an empty ArrayList called `listWithoutDuplicates`.

4. Iterate through each item in `originalList`:
   - If `listWithoutDuplicates` does not contain the current item:
     - Add the current item to `listWithoutDuplicates`.

5. Print the list after removing duplicates:
   - Output: "List after removing duplicates: " + `listWithoutDuplicates`

6. Create an empty Stack called `stack`.

7. Iterate through each item in `listWithoutDuplicates`:
   - Push the current item onto `stack`.

8. Create an empty ArrayList called `reversedList`.

9. While `stack` is not empty:
   - Pop the top item from `stack` and add it to `reversedList`.

10. Print the final reversed list:
    - Output: "Reversed List: " + `reversedList`

