import ctypes


class Node:
    def __init__(self, data, prev=None, next=None):
        self.data = data
        self.prev = prev
        self.next = next


class LinkedList:
    def __init__(self, *nodes):
        if nodes:
            self.head = Node(None, None, nodes[0])
            for i in range(0, len(nodes)-1):
                nodes[i].next = nodes[i+1]
                nodes[i+1].prev = nodes[i]

    def insert_node(self, node, pos):
        # pos is the id of the node after which the new node is to be inserted
        prev_node = ctypes.cast(pos, ctypes.py_object).value
        node.next = prev_node.next
        prev_node.next = node

    def delete_node(self, pos):
        # pos is the id of the node that is to be deleted
        pass


lnkd_lst = LinkedList(Node(1), Node(2), Node(3))
print(lnkd_lst.head.next.data, lnkd_lst.head.next.next.data,
      lnkd_lst.head.next.next.next.data)
print(lnkd_lst.head.next.next.next.data, lnkd_lst.head.next.next.next.prev.data,
      lnkd_lst.head.next.next.next.prev.prev.data)
