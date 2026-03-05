def encontrar_maior_numero(q):
    m = q[0]
    for i in q:
        if i > m:
            m = i
    return m

maior_numero = encontrar_maior_numero([3, 7, 2, 9, 4])
print("Maior número: ", maior_numero)