# Reading data from CSV file (Activity 18)
input_data = pd.read_csv("sample.csv")

# Print the values only in the Usernames column
print("\n======== Usernames Column =======")
print(input_data["usernames"])

# Print the username and password of the second row
print("\n=========Second Row Data =======")
print(input_data["usernames"][1]. input_data["Passwords"][1])

# Sort the Usernames column data in ascending order and print data
print("\n====== Sorted Usernames Coulmn ======")
print(input_data.sort_values(by="Usernames", ascending=True))

#print("====== Sorted Passwords Columns ======")
print(input_data.sort_values(by="Passwords", ascending=False))

