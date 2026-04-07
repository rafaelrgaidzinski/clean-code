def teste(n):
    if n % 2 == 0:
        return "par"
    else:
        return "ímpar"

print(tipo_numero(7))

# Propósito:
# Verificar se um número é par ou ímpar.
#
# Como funciona:
# 1. Recebe um número n.
# 2. Se n % 2 == 0 → par.
# 3. Caso contrário → ímpar.
#
# Observação:
# Há erro: a função se chama 'teste',
# mas foi chamada como 'tipo_numero'.