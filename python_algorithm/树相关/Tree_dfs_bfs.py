#coding:utf-8 

class Node():
	def __init__(self, item=None, left=None, right=None):
		self.item = item
		self.left = left
		self.right = right


d = Node("D")
e = Node("E")
b = Node("B", d, e)
f = Node("F")
g = Node("G")
c = Node("C", f, g)
a = Node("A", b, c)

result = []

def dfs(root):  
	'''
	1）、找根节点

	2）、找根节点的左边

	3）、找根节点的右边
	'''
	if root.item:
		result.append(root.item)
	if root.left:
		dfs(root.left)
	if root.right:
		dfs(root.right)
	print(result)
	print('->'.join(result))
	return '->'.join(result)

#dfs(a)

result = []
def bfs(root):
	if not result:
		result.append(root.item)
	if root.left:
		result.append(root.left.item)
	if root.right:
		result.append(root.right.item),
	if root.left:
		bfs(root.left)
	if root.right:
		bfs(root.right)
	print(result)
	print('->'.join(result))
	return '->'.join(result)
		
print(bfs(a))