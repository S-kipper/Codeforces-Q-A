"""n = int(input())

summ = 0

for i in range(1, n+1):
    summ += (-1) ** i * i
    
print(summ)     """

"""Now we need to know that in Even numbers the number of even numbers and odd numbers is the same while in odd they is exactly 1 odd number extra"""


n = int(input())

if n%2 == 0:
    print(n//2)

else:
    print(-(n+1)//2)