num = input("Give sequence of numbers:")
sum = 0
for i in range(len(num)):
    if i%2 == 0 and i<(len(num)-1):
        a = int(num[i])*int(num[i+1])
        sum+=a
    if len(num)%2 !=0 and i==(len(num)-1):
       sum += int(num[-1])
print("This is the sum of the sequence:", sum)
