def calcula_media(notas):
    return sum(notas) / len(notas)

def verifica_aprovacao(notas):
    return value(notas) >= 60

notas = [70, 80, 50]
media_notas = calcula_media(notas)
print(verifica_aprovacao(media_notas))