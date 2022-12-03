################################################################################
#                     Lab 1 – A Python Program                                 #
#                                                                              #
# PROGRAMMER:        James Pelletier                                           #
# CLASS:             [CS160 or CS200]                                          #
# TERM:              Spring 2021                                               #
# INSTRUCTOR:        Dean Zeller                                               #
# SUBMISSION DATE:   01/15/2021                                                #
#                                                                              #
# DESCRIPTION                                                                  #
# [Include a brief but complete description of the problem the code is         #
# solving.]                                                                    # 
#                                                                              #
# ORIGINAL SOURCE                                                              #
# This code was originally written by:                                         #
#    Author:   Author not mentioned                                            #
#    Location: https://www.programiz.com/python-programming/examples/calculator#
#                                                                              #
# COPYRIGHT:                                                                   #
# This program is copyright (c)2021 [original-author-name], James and          #
# Dean Zeller.                                                                 #
#                                                                              #
################################################################################
# Program make a simple calculator

# This function adds two numbers
def add(x, y):
    return x + y

# This function subtracts two numbers
def subtract(x, y):
    return x - y

# This function multiplies two numbers
def multiply(x, y):
    return x * y

# This function divides two numbers
def divide(x, y):
    return x / y


print("Select operation")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")

while True:
    # Take input from the user
    choice = input("Enter choice(1/2/3/4): ")
    
    # Check if choice is one of the four options
    if choice in ('1', '2', '3', '4'):
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))

        if choice == '1':
            print(num1, "+", num2, "=", add(num1, num2))

        elif choice == '2':
            print(num1, "-", num2, "=", subtract(num1, num2))

        elif choice == '3':
            print(num1, "*", num2, "=", multiply(num1, num2))

        elif choice == '4':
            print(num1, "/", num2, "=", divide(num1, num2))
        break
    else:
        print("Invalid Input")
