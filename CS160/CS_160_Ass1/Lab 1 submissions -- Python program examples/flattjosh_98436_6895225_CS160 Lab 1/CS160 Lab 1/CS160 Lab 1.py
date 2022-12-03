#!/usr/bin/env python
# coding: utf-8

# In[ ]:


################################################################################
# Lab 1 – A Python Program                                                     #
#                                                                              #
# PROGRAMMER:        Joshua Flatt   flat7792@bears.unco.edu                    #
# CLASS:             CS160                                                     #
# TERM:              Fall 2021                                                 #
# INSTRUCTOR:        Dean Zeller                                               #
# SUBMISSION DATE:   9/3/2021                                                 #
#                                                                              #
# DESCRIPTION                                                                  #
# The program is a random number generator that makes the user                 #
# guess a number between 1 and 10. The user gets 3 chances to figure out       #
# what the randomized number was.                                               #
#                                                                              #
# ORIGINAL SOURCE                                                              #
# This code was originally written by:                                         #
#    Author:   Joshua Flatt                                                    #
#    Location: https://trinket.io/python/e065acb568                            #
#                                                                              #
# COPYRIGHT:                                                                   #
# This program is copyright (c)2021 Joshua Flatt and Dean Zeller.              #
#                                                                              #
################################################################################

import random
import math

answer = random.randint(0, 11)
guesses_left = 3
guesses_used = 0
print("Guess a number between 1 and 10.")

while guesses_used < guesses_left :
  guesses_used += 1
  guess = int(input("Your guess:"))
  x = guesses_left - guesses_used

  
  if guess == answer:
    print("You guessed correctly!")
    break
  elif guess > 10:
    print("Out of range.")
    guesses_used -= 1
    print("Guesses left:" , x + 1)
  elif guess < 1:
    print("Out of range.")
    guesses_used -= 1
    print("Guesses left:" , x + 1)
  elif guess < answer:
    print("Too small!")
    print("Guesses left:" , x)
  elif guess > answer:
    print("Too high!")
    print("Guesses left:" , x)
  else:
    print("Out of range.")
    guesses_used -= 1
    print("Guesses left:" , x + 1)

print("Game over. The correct number was" , answer , ".")

