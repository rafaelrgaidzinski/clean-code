def find_largest_odd_number(numbers):
    largest = None
    for number in numbers:
        if number % 2 == 0 and (largest is None or number > largest):
            largest = number
    return largest

print(find_largest_odd_number([3, 10, 7, 8, 15]))