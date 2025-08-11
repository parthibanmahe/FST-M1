import pandas as pd

# Writing data to CSV file (Activity 17)
# Create the dataset
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

 # Convert the dataset into a DataFrame
df = pd.DataFrame(data)
# Write the DataFrame to a CSV File
df.to_csv("sample.csv, index=False")
