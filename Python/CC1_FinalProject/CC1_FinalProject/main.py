# Please check my full code in this github repository: https://github.com/Alanjiang712/UC_SchoolWork/tree/main
# I don't know how to submit a full folder in canvas

from classes import Product
from productsList import productsList

def add_product():
    productName = input('Please enter the name of the new product: ')
    productPrice = input('Please enter the price of the new product: ')
    productQuantity = input('Please enter the quantity of the new product: ')

    newProduct = Product(productName, productPrice, productQuantity)

    productsList.append(newProduct)

    print("New product successfully added")

def delete_product():
    productName = input('Please enter the name of the product to delete: ')

    # Find the product in the list based on its name
    for product in productsList:
        if product.productName == productName:
            productsList.remove(product)
            print("Product successfully deleted")
            break
    else:
        print("Product not found")

def update_product():
    productName = input('Please enter the name of the product to update: ')

    # Find the product in the list based on its name
    for product in productsList:
        if product.productName == productName:
            newPrice = input('Please enter the new price: ')
            newQuantity = input('Please enter the new quantity: ')
            product.productPrice = newPrice
            product.productQuantity = newQuantity
            print("Product successfully updated")
            break
    else:
        print("Product not found")

try:
    print('Welcome to the online store management system')

    while True:
        # Display main menu and options
        mainMenuSelection = input('Enter "1" to Manage Products\nEnter "2" to Create Order\nEnter "3" to Generate Sales Reports\nEnter "4" to Display Top-Selling Products\nEnter "5" to Exit\nPlease enter your choice: ')

        if mainMenuSelection == "1":
            print('Products list:')
            for product in productsList:
                print("Name:", product.productName)
                print("Price:", product.productPrice)
                print("Quantity:", product.productQuantity)

            manageProductSelection = input('Manage Products:\nEnter "1" to add product\nEnter "2" to delete product\nEnter "3" to update product\nPlease enter your choice: ')

            if manageProductSelection == "1":
                add_product()
            elif manageProductSelection == "2":
                delete_product()
            elif manageProductSelection == "3":
                update_product()
            else:
                print('Invalid choice. Please try again')
        elif mainMenuSelection == "2":
            print('Create Order')
        elif mainMenuSelection == "3":
            print('Generate Sales Reports')
        elif mainMenuSelection == "4":
            print('Display Top-Selling Products')
        elif mainMenuSelection == "5":
            print('Exiting...')
            break
        else:
            print('Invalid choice. Please try again')

except Exception as e:
    print('Something went wrong:', str(e))
