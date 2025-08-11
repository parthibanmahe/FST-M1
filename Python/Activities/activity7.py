# numList = [10, 90, 50, 20, 30, 40, 70, 60, 80]
numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
# Calculate the sum of all the numbers in the list
sum = 0
for num in numList:
    sum += num  # // sum=sum+num

# Print the final sum
print("The sum of the numbers in the list is:", sum)


