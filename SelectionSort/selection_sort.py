def ssort(arr: list[int]) -> list[int]:
    start = 0
    while start < len(arr):
        min_idx = start
        for i in range(start+1, len(arr)):
            if arr[i] < arr[min_idx]:
                min_idx = i
        arr[start], arr[min_idx] = arr[min_idx], arr[start]
        start += 1
    return arr


arr = [64, 34, 25, 12, 22, 11, 90]
print(ssort(arr))  # [11, 12, 22, 25, 34, 64, 90]
