# width = 0

# n = int(input())
# h = int(input())

# for i in range(0, n):
#     num = int(input())
    
#     if num > h:
#         width += 2
        
#     else:
#         width += 1

# print(width)

width = 0
n, f = map(int, input().split())
heights = list(map(int, input().split()))

for height in heights:
    if height > f:
        width += 2
    else:
        width += 1

print(width)




