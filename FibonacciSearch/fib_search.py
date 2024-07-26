def fib(n):
    if n <= 1:
        return n
    return fib(n-1) + fib(n-2)


def fib_search(sorted_array: list[int], target: int) -> int:
    """
    Perform Fibonacci search on a sorted array.

    Args:
        sorted_array (list[int]): A sorted list of integers in ascending order
        target (int): The integer to be searched in the sorted_array

    Returns:
        int: The index of the target in the sorted_array. If the target is not found, return -1
    """
    
    if not sorted_array:
        return -1
    
    n = 0
    while fib(n) < len(sorted_array):
        n += 1
    
    offset = -1
    while fib(n) > 1:
        i = min(offset + fib(n-2), len(sorted_array) - 1)
        
        if sorted_array[i] == target:
            return i
        elif sorted_array[i] < target:
            n = n - 1
            offset = i
        else:
            n = n - 2
    
    if fib(n-1) and sorted_array[offset + 1] == target:
        return offset + 1
    
    return -1


# Test the function
if __name__ == "__main__":
    array = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100]
    target = 85
    result = fib_search(array, target)
    print(f"Index of {target}: {result}")  # Output: Index of 85: 8
    
    target = 84
    result = fib_search(array, target)
    print(f"Index of {target}: {result}")  # Output: Index of 84: -1