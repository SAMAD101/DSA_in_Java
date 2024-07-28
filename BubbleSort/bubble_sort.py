def bsort(arr: list[int]) -> int:
    end = len(arr)
    while end > 0:
        for i in range(1, end):
            if arr[i-1] > arr[i]:
                arr[i-1], arr[i] = arr[i], arr[i-1]
        end -= 1
    return arr


arr = [64, 34, 25, 12, 22, 11, 90]
print(bsort(arr))  # [11, 12, 22, 25, 34, 64, 90]
