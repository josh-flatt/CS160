##########################################################
#               Lab 1 - A Python Program                 #
# Programmer:   Timothy Falin  fali3935@bears.unco.edu   #
# Class:   CS160                                         #
# Term:   Fall 2021                                      #
# Instructor: Dean Zeller                                #
# Submission Date:   8/27/21                             #
#                                                        #
# Description: Checks if an given number is prime, and   #
# if not, prints all factors of the given number         #
#                                                        #
# Original Source:                                       #
# This code was originally written by                    #
#    Author: Unknown                                     #
#    Location: Programiz.com                             #
#                                                        #
# Copyright:                                             #
# This program is copyright ©2021 Parewa Labs Pvt. Ltd., #
# Tim Falin, and Dean Zeller.                            #
##########################################################

# To take input from the user
num = int(input("Enter a number: "))
x = 0
lowest = 1

# prime numbers are greater than 1
if num > 1:
   # check for factors
    for i in range(2,num):
        if (num % i) == 0 and i < (num//lowest):
           print(i,"times",num//i,"is",num)
           x = x+1
           if x == 1:
               lowest = i
        if (num % i) == 0 and i == (num//lowest):
           print(i,"times",num//i,"is",num)
           x = x+1
           print(num,"is not a prime number. It has", x, "factors besides 1 and itself.")
           break
    else:
        print(num,"is a prime number")
       
# if input number is less than
# or equal to 1, it is not prime
else:
   print(num,"is not a prime number")