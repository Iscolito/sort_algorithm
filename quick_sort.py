# -*- coding = utf-8 -*-
# @Time : 2022/8/30 14:22
# @Author : Iscolito
# @File : quick_sort.py
# @Software : PyCharm
class Quick_sort:
    def quick_sort(self, array):
        def sort(arr, start, end):
            if start > end:
                return
            i, j = start, end
            base = arr[start]
            while i < j:
                while i < j and arr[j] >= base:
                    j -= 1
                while i < j and arr[i] <= base:
                    i += 1
                arr[i], arr[j] = arr[j], arr[i]
            arr[i], arr[start] = arr[start], arr[i]
            sort(arr, start, j-1)
            sort(arr, j+1, end)
        sort(array, 0, len(array)-1)
        return array


a = Quick_sort()
b = a.quick_sort([5, 7, 9, 3, 5, 8])
print(b)
