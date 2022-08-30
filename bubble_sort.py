# -*- coding = utf-8 -*-
# @Time : 2022/8/30 14:39
# @Author : Iscolito
# @File : bubble_sort.py
# @Software : PyCharm
class Bubble_sort:
    def bubble_sort(self, array):
        for i in range(len(array)):
            for j in range(0, len(array)-1-i):
                if array[j] > array[j+1]:
                    array[j], array[j+1] = array[j+1], array[j]
        return array


a = Bubble_sort()
b = a.bubble_sort([5, 7, 9, 3, 5, 8])
print(b)
