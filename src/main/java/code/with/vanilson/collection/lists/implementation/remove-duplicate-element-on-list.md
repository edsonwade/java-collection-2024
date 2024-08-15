# Removing Duplicates from a List of Integers

## 1. Understand the Problem

You have a list of integers, and some values appear more than once.  
The goal is to remove these duplicates, so each value appears only once.

## 2. Analyze the Structure of the Problem

- **Input**: A list of integers that may contain duplicates.
- **Output**: A list of integers with all duplicates removed.

## 3. Explore Possible Approaches

There are several ways to solve this, and each has its own advantages and trade-offs. Here's how you can think about it:

### a. Using a New List (Iterative Method)

- **Logic**:
    - Create a new list (or array).
    - Iterate through the original list.
    - For each element, check if it's already in the new list.
    - If it's not in the new list, add it.
- **Reasoning**:
    - This approach is straightforward and easy to understand.
    - It uses an extra list to keep track of unique elements.

### b. Using a Set (Hashing Method)

- **Logic**:
    - A Set is a data structure that automatically removes duplicates because it only allows unique elements.
    - You can convert the list into a set and then back into a list.
- **Reasoning**:
    - This is efficient and requires fewer lines of code.
    - Sets are optimized for checking membership (whether an element is in the set) and for storing unique items.

### c. Sorting and Comparing Adjacent Elements

- **Logic**:
    - Sort the list first.
    - Then, iterate through the sorted list, comparing each element with the next one.
    - If two adjacent elements are the same, skip one of them.
- **Reasoning**:
    - This method leverages sorting to bring duplicates next to each other.
    - Sorting can be time-consuming, but this approach is still effective.

## 4. Choosing the Right Approach

- **Memory Consideration**:
    - Using a set or a new list requires additional memory, which might be a concern with very large datasets.
- **Time Complexity**:
    - Sorting has a time complexity of O(n log n), while using a set or a new list for checking duplicates typically involves O(n) time.
- **Ease of Implementation**:
    - Using a set or a new list is usually simpler and more intuitive.

## 5. Plan the Logic

Let’s assume you're choosing the first method (iterative with a new list):

1. Create an empty list called `uniqueNumbers`.
2. Loop through each element in the original list.
3. For each element, check if it is already in `uniqueNumbers`.
4. If it is not, add it to `uniqueNumbers`.
5. After the loop, `uniqueNumbers` will contain all unique elements.

## 6. Evaluate the Plan

- **Edge Cases**:
    - What if the list is empty? The result should be an empty list.
    - What if all elements are the same? The result should be a list with one element.
- **Performance**:
    - This method is easy to understand but may be slower with huge lists due to repeated membership checks.

## 7. Implement and Test

- Implement the chosen logic in code.
- Test with different inputs to ensure it works as expected (including edge cases).

## 8. Reflect and Improve

After implementing, think about:
- Could the solution be more efficient?
- Are there any optimizations or different approaches that might work better in specific scenarios?

## 9. Practice
