class Queue:
    def __init__(self):
        self._items = []
        
    def is_empty(self):
        return not bool(self._items)
    
    def enqueue(self, item):
        self._items.insert(0, item)
        
    def dequeue(self):
        return self._items.pop()
    
    def size(self):
        return len(self._items)
    

q = Queue()

print(q.is_empty())

q.enqueue(1)
q.enqueue('two')

print(q.dequeue())
print(q.dequeue())
