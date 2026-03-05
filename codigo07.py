def convert_temp_celsius_to_fahrenheit(temp):
    return (temp * 9/5) + 32

def convert_temp_fahrenheit_to_celsius(temp):
    return (temp - 32) * 5/9

celsiusTemp = 25
fahrenheitTemp = 77

print(convert_temp_celsius_to_fahrenheit(celsiusTemp))
print(convert_temp_fahrenheit_to_celsius(fahrenheitTemp))