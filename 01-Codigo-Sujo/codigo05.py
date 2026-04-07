def verifica(idade):
    if idade >= 0 and idade < 12:
        return "Criança"
    elif idade >= 12 and idade < 18:
        return "Adolescente"
    elif idade >= 18 and idade < 60:
        return "Adulto"
    elif idade >= 60:
        return "Idoso"
    else:
        return "Idade inválida"

print(verifica_idade(25))

# Propósito:
# Classificar uma pessoa por faixa etária.
#
# Como funciona:
# 1. Recebe a idade.
# 2. Verifica em qual faixa ela se encaixa:
#    0–11 → Criança
#    12–17 → Adolescente
#    18–59 → Adulto
#    60+ → Idoso
# 3. Se idade for negativa → inválida.
#
# Observação:
# Há erro no código: a função se chama 'verifica',
# mas foi chamada como 'verifica_idade'.