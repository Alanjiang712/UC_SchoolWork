# https://github.com/Alanjiang712/UC_SchoolWork/tree/main/Python/CC1_FinalProject

from classes import Product
from datetime import datetime, timedelta

productsList = []

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

def generate_sales_report():
    reportType = input('Enter "1" for daily sales report\nEnter "2" for weekly sales report\nEnter "3" for monthly sales report\nPlease enter your choice: ')

    if reportType == "1":
        # Generate daily sales report
        print("Generating daily sales report...")
        report_date = datetime.now().date()
        total_sales = 0
        for product in productsList:
            total_sales += float(product.productPrice) * int(product.productQuantity)
        print(f"Daily Sales Report - {report_date}:")
        print(f"Total Sales: {total_sales}")

    elif reportType == "2":
        # Generate weekly sales report
        print("Generating weekly sales report...")
        start_date = datetime.now().date() - timedelta(days=7)
        end_date = datetime.now().date()
        total_sales = 0
        for product in productsList:
            total_sales += float(product.productPrice) * int(product.productQuantity)
        print(f"Weekly Sales Report - {start_date} to {end_date}:")
        print(f"Total Sales: {total_sales}")

    elif reportType == "3":
        # Generate monthly sales report
        print("Generating monthly sales report...")
        today = datetime.now().date()
        start_date = datetime(today.year, today.month, 1).date()
        end_date = start_date + timedelta(days=30)
        total_sales = 0
        for product in productsList:
            total_sales += float(product.productPrice) * int(product.productQuantity)
        print(f"Monthly Sales Report - {start_date} to {end_date}:")
        print(f"Total Sales: {total_sales}")

    else:
        print('Invalid choice. Please try again')

def create_order():
    order = []
    while True:
        productName = input('Enter the name of the product to add to the order (or "done" to finish): ')
        if productName == 'done':
            break
        
        product = next((p for p in productsList if p.productName == productName), None)
        if product:
            quantity = int(input('Enter the quantity: '))
            if quantity <= int(product.productQuantity):
                order.append((product, quantity))
                product.productQuantity = str(int(product.productQuantity) - quantity)
                print('Product added to order successfully')
            else:
                print('Insufficient quantity. Please enter a valid quantity.')
        else:
            print('Product not found. Please enter a valid product name.')
    
    print('Order Summary:')
    total_cost = 0
    for product, quantity in order:
        cost = float(product.productPrice) * quantity
        total_cost += cost
        print(f'Product: {product.productName} - Quantity: {quantity} - Cost: {cost}')
    print(f'Total Order Cost: {total_cost}')

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
            create_order()

        elif mainMenuSelection == "3":
            generate_sales_report()

        elif mainMenuSelection == "4":
            print('Display Top-Selling Products')

        elif mainMenuSelection == "5":
            print('Exiting...')
            break

        else:
            print('Invalid choice. Please try again')

except Exception as e:
    print('Something went wrong:', str(e))
