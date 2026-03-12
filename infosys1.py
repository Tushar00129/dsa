# n=str(input())
# d=str(input())
# ans = []

# for i in range (len(n)):
#     if n[i]==d:
#         t=n[0:i] + n[(i+1):]
#         ans.append(int(t))
#         print(str(max(ans)))


# max array
n= 7
arr = [0]*(n+1)
for i in range(1,(n//2)+1):
    arr[i*2]=arr[i]
    arr[(i*2)+1]=arr[i]+arr[i+1]
    print(arr)
    print(max(arr))
    
