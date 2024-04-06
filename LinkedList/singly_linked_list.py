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

    def insert_node(self, node, pos):
        # pos is the id of the node after which the new node is to be inserted
        prev_node = ctypes.cast(pos, ctypes.py_object).value
        node.next = prev_node.next
        prev_node.next = node
        
    def delete_node(self, pos):
        # pos is the id of the node that is to be deleted
        target = ctypes.cast(pos, ctypes.py_object).value
        node = self.head
        while node.next != target:
            node = node.next
        node.next = target.next
        
    def traverse(self):
        node = self.head.next
        while node != self.tail:
            print(node.data, end=' ')
            node = node.next
        print()
        

lnkd_lst = LinkedList(Node(1), Node(2), Node(3))

lnkd_lst.traverse()

lnkd_lst.insert_node(Node(4), id(lnkd_lst.head.next.next))

lnkd_lst.traverse()

lnkd_lst.delete_node(id(lnkd_lst.head.next.next))

lnkd_lst.traverse()
