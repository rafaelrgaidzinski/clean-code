def calcular_salario(horas_trabalhadas):
    return horas_trabalhadas * 50 + (horas_trabalhadas * 50 * 0.1)

print(calcular_salario(40))

# Propósito:
# Calcular salário com bônus de 10%.
#
# Como funciona:
# 1. Calcula salário base: horas * 50.
# 2. Calcula 10% desse valor como bônus.
# 3. Soma base + bônus.
# 4. Exemplo: 40h → 2000 + 200 = 2200.