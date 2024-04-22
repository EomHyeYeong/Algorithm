string = input()
explosion = input()
exlen = len(explosion)
exlist = list(explosion)

stack = list()

for i in string:
    stack.append(i)

    if len(stack) < exlen:
        continue

    if stack[len(stack)-exlen:]==exlist:
        del stack[len(stack)-exlen:]

stackStr = ''.join(stack)
if len(stackStr)==0:
    print('FRULA')
else:
    print(stackStr)