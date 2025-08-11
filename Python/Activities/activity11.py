fruit_shop = {
    "pomegranate": 10,
    "grape": 15,
    "orange": 8,
    "mango": 15
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")
