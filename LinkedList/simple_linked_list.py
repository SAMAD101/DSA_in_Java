# Abdul Samad Ansari CS03A
# 2200290120002
# Simple linked list program


import ctypes


class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next


class LinkedList:
    def __init__(self, *nodes):
        if nodes:
            self.head = Node(None, nodes[0])
            self.tail = Node(None, None)
            for i in range(0, len(nodes)-1):
                nodes[i].next = nodes[i+1]
            nodes[-1].next = self.tail

    def insert(self, node, pos):
        # pos is the id of the node after which the new node is to be inserted
        prev_node = ctypes.cast(pos, ctypes.py_object).value
        node.next = prev_node.next
        prev_node.next = node


lnkd_lst = LinkedList(Node(1), Node(2), Node(3))
print(lnkd_lst.head.next.data, lnkd_lst.head.next.next.data,
      lnkd_lst.head.next.next.next.data)
