####################################################################################
#                                 JavaLab1 9 -                                     #
#                                                                                  #
#     PROGRAMMER: Argelis McIntire                                                 #
#     DATE:       08/27/2021                                                       #
#     SEMESTER:   Fall 2021                                                        #
#     INSTRUCTOR: Dean Zeller                                                      #
#                                                                                  #
#     DESCRIPTION:                                                                 #
#     The following is a simple python program to find the mean of a data set      #
#     which is entered into the computer                                           #
#                                                                                  #
#      .                                                                           #
#     COPYRIGHT                                                                    #
#     The following is copyright (c) 2021  Argelis McIntire and Dean Zeller        #
#                                                                                  #
####################################################################################

dataset = []
numdataset = 0
datasetSum = 0.0
datsetMean = 0.0

####################################################################################
#     Method: datasetentry                                                         #
#     Features:                                                                    #
#         entering data for data set                                               #
#                                                                                  #
#     Parameters:                                                                  #               
#                                                                                  #
#                                                                                  #
#                                                                                  #
#     Output:                                                                      #
#        study information                                                         # 
####################################################################################
   

def datasetentry(theNum):
    # enter data set
    num=0
    temp=0.0
    tempdataset=[]
    num=theNum+1 
    for i in range(1,num):
       temp= float(input("Please enter data item "+str(i)+". ==> "))
       tempdataset.append(temp)
    #print("tempdataset = ",tempdataset) 
    return tempdataset
 
    


 ###################################################################################
#     Method: calcSum(theList)                                                     #
#     Features:                                                                    #
#         sum theList                                                              # 
#     Parameters:                                                                  #               
#        theList                                                                   #
#                                                                                  #
#                                                                                  #
#     return Lsum to datasetSum:                                                   #
#        datasetSum                                                                # 
####################################################################################     

def calcSum(theList):
   Lsum=0.0
   for x in theList:
      Lsum = Lsum + x
   return Lsum


 ###################################################################################
#     Method: calcMean(theList)                                                    #
#     Features:                                                                    #
#         Find Mean of dataset                                                     # 
#     Parameters:                                                                  #               
#                                                                                  #
#                                                                                  #
#                                                                                  #
#     Output:                                                                      #
#       tempMean to  datasetMean                                                   # 
####################################################################################     

def calcMean(theList,theNum):
   tempSum = 0.0
   tempMean = 0.0
   tempSum=calcSum(theList)
   tempMean = tempSum/theNum
   #    print("tempMean= ",tempMean)
   return tempMean
numdataset = int(input("Please enter number in data set ==> ")) 
dataset = datasetentry(numdataset)
print("dataset = ",dataset)
datasetMean = calcMean(dataset,numdataset)
print("Mean = ",datasetMean)









