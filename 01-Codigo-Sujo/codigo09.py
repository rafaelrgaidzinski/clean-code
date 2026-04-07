numeros = [3, 5, 2, 8, 1, 4]
soma_pares = 0

for numero in numeros:
    if numero % 2 == 0:
        soma_pares += numero

print(soma_pares)

# Propósito:
# Somar apenas os números pares de uma lista.
#
# Como funciona:
# 1. Percorre cada número da lista.
# 2. Verifica se é par (divisível por 2).
# 3. Se for, soma ao acumulador.
# 4. Resultado final: 2 + 8 + 4 = 14.