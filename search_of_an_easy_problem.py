num = int(input())

count = 0


n = list(map(int, input().split()))
    
for i in n:
    if i == 1:
        count += 1
        
if count != 0:
    print("HARD")
    
else:
    print("EASY")
    