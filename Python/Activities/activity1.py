# Take the user name and age as input
name = input("Enter you name: ")    
# age = input("Enter your age: ")

age = int(input("Enter your age: "))

# Calculate the year in which the user wil turn 100
year_when_100 = 2025 + (100 - age)

# Print the result
print(name + " will turn 100 in the year " + str(year_when_100))
print(name + " will turn 100 in the yaer {}".format(year_when_100))
