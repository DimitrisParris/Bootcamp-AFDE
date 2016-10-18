number=input('Give 8-bit number:')
num=str(number)
if len(num)!=8:
    print('Not an 8-digit number. False. Check again.')
else:
   neo=num[:7]
   print(neo)
   sum=0
   for i in neo :
      if int(i)==1:
         sum+=1
   if sum%2==0 :
      print('sum even')
   else :
      print('sum odd')
   if (int(num[-1])%2)==(sum%2):
      print('Parity OK')
   else:
      print('Parity not OK')
