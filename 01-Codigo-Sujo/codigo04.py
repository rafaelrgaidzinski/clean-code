def calc(x, y, z):
    if z == 1:
        return x + y
    elif z == 2:
        return x - y
    elif z == 3:
        return x * y
    elif z == 4:
        return x / y

a = 10
b = 5
c = 3
print(calc(a, b, c))

# Propósito:
# Realizar uma operação matemática baseada no valor de z.
#
# Como funciona:
# 1. Recebe x, y e z.
# 2. Se z=1 → soma.
# 3. Se z=2 → subtração.
# 4. Se z=3 → multiplicação.
# 5. Se z=4 → divisão.
# 6. No exemplo: z=3 → 10*5 = 50.