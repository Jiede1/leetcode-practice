class Node():
	def __init__(self,elem=-1,lchild=None, rchild=None):
		self.elem = elem
		self.lchild = lchild
		self.rchild = rchild
	
class Tree():
	def __init__(self):
		self.root = Node()
		self.myQueue = []
		self.result = []
	def add(self, elem):
		node = Node(elem)
		if self.root.elem == -1:  # 如果树是空的，则对根节点赋值
			self.root = node
			self.myQueue.append(self.root)
		else:
			treeNode = self.myQueue[0]	# 此结点的子树还没有齐。
			if treeNode.lchild == None:
				treeNode.lchild = node
				self.myQueue.append(treeNode.lchild)
			else:
				treeNode.rchild = node
				self.myQueue.append(treeNode.rchild)
				self.myQueue.pop(0)	 # 如果该结点存在右子树，将此结点丢弃。

	def front_digui(self, root):
		"""利用递归实现树的先序遍历"""
		if root.lchild or root.rchild:
			self.result.append(root.elem)
			print(self.result)
		if root.lchild:
			self.front_digui(root.lchild)
		if root.rchild:
			self.front_digui(root.rchild)
		if not root.lchild and not root.rchild:
			self.result.append(root.elem) 
		#print(self.result)
			

if __name__ == '__main__':
	"""主函数"""
	elems = range(10)			#生成十个数据作为树节点
	tree = Tree()		   #新建一个树对象
	for elem in elems:					
		tree.add(elem)			 #逐个添加树的节点
	
	tree.front_digui(tree.root)
	print(tree.result)
	
#https://blog.csdn.net/lzq20115395/article/details/79547692