n = eval(input())
times = 0

while n!=1 :
    if n % 2 == 1 :
        n = n*3+1
    n = n/2
    times = times + 1

print(times)