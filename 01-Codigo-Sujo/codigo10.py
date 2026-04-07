def criar_usuario(nome, idade, cidade, estado, telefone, email,
    empresa, local_empresa, cargo, cidade_empresa, estado_empresa):
    return f"{nome}, {idade} anos, mora em {cidade}/{estado}." \
        + f"Contato: {telefone}, {email}. Trabalha na {empresa} como {cargo}, " \
        + f"localizada em {cidade_empresa}/{estado_empresa}."

print(criar_usuario(
    "João", 25, "São Paulo", "SP", "99999-9999",
    "joao@email.com", "ECorp", "São Paulo",
    "Desenvolvedor", "São Paulo", "SP"
))

# Propósito:
# Criar uma descrição completa de um usuário.
#
# Como funciona:
# 1. Recebe várias informações pessoais e profissionais.
# 2. Usa f-strings para montar um texto formatado.
# 3. Junta todos os dados em uma única string.
# 4. Retorna e imprime a descrição do usuário.