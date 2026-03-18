class BankAccount:
    def __init__(self, name, balance):
        self.name = name
        self.balance = initial_balance

    def deposit(self, value_of_deposit):
        self.balance += value_of_deposit

    def withdraw(self, value_of_withdraw):
        if value_of_withdraw <= self.balance:
            self.balance -= value_of_withdraw
        else:
            print("Not enough funds")

    def check_balance(self):
        return self.balance

    def check_account(self):
        return f"Account: {self.name}, Funds: {self.initial_balance}"

def return_total_balance(clients):
    return sum(client.balance for client in clients)

def return_max_balance(clients):
    return max(client, key=lambda client: client.balance)

# Example usage
first_client = BankAccount("Alice", 500)
second_client = BankAccount("Bob", 1200)
third_client = BankAccount("Charlie", 700)

first_client.deposit(200)
second_client.withdraw(300)

print(first_client.check_balance())
print(second_client.check_account())

accounts = [first_client, second_client, third_client]
print(return_total_balance([first_client, second_client, third_client]))
print(return_max_balance(accounts).name)