inputData=int(input())
def factorial(inputData):
    if inputData==0:
        return 1
    else:
        return factorial(inputData-1)*inputData
    
print(factorial(inputData))
