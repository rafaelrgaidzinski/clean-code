def rodar(lista):
    r = 0
    for i in range(len(lista)):
        if lista[i] % 2 == 0:
            r += lista[i]
        else:
            r -= lista[i]
    return r / len(lista)

# Propósito:
# Calcular uma média onde números pares são somados e ímpares são subtraídos.
#
# Como funciona:
# 1. Inicializa r = 0.
# 2. Percorre a lista usando índice.
# 3. Se o número for par, soma em r.
# 4. Se for ímpar, subtrai de r.
# 5. Divide o resultado pelo tamanho da lista.
# 6. Retorna o valor final.