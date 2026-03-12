def anagram(str):
    n=len(str)
    if n%2!=0:
        return -1
    str1=str[:n//2]
    str2=str[n//2:]
    count=[0]*26
    for i in range(n//2):
        count[ord(str1[i])-ord('a')]+=1
        count[ord(str2[i])-ord('b')]-=1
    for c in count:
        if c!=0:
            return -1
    return 0