def f(n):
    x = 1
    for i in range(n):
        x *= 2
    return x

# Propósito:
# Calcular 2 elevado a n (2^n).
#
# Como funciona:
# 1. Começa com x = 1.
# 2. Repete n vezes.
# 3. A cada repetição multiplica x por 2.
# 4. Retorna o valor final.
# Exemplo: n=3 → 1→2→4→8.