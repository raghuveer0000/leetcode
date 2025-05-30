class MyQueue:

    def __init__(self):
        self.in_stack = []   # Stack for enqueue (push)
        self.out_stack = []  # Stack for dequeue (pop/peek)

    def push(self, x: int) -> None:
        # Always push to the in_stack
        self.in_stack.append(x)

    def pop(self) -> int:
        # Ensure out_stack has the current front
        self.move_in_to_out()
        return self.out_stack.pop()

    def peek(self) -> int:
        # Ensure out_stack has the current front
        self.move_in_to_out()
        return self.out_stack[-1]

    def empty(self) -> bool:
        # Queue is empty only when both stacks are empty
        return not self.in_stack and not self.out_stack

    def move_in_to_out(self):
        # Transfer only when out_stack is empty
        if not self.out_stack:
            while self.in_stack:
                self.out_stack.append(self.in_stack.pop())
