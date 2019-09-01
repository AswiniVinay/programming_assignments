import random
fopen = open("100000000.txt","w")
for i in range(100000000):
    n=random.randrange(0,200000)
    fopen.write(str(n)+"\n")
