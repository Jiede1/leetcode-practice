#coding=utf-8
__author__ = 'Jiede1'
a = [8,4,5,7,1,3,6,2,9]

def mergeSort(sequence):
	if len(sequence) ==1:
		return sequence
	mid = int(len(sequence)/2)
	sequence_left = mergeSort(sequence[:mid])
	sequence_right = mergeSort(sequence[mid:])
	return sortArray(sequence_left,sequence_right)
def sortArray(left,right):
	i, j = 0, 0
	result = []
	while i < len(left) and j < len(right):  # �Ƚϴ�������������У������������н�������
		if left[i] <= right[j]:
			result.append(left[i])
			i += 1
		else:
			result.append(right[j])
			j += 1
	result.extend(left[i:])         # ���ź���������кϲ�
	result.extend(right[j:])
	return result

lst = mergeSort(a)
print(lst)