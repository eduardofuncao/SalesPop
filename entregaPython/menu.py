'''
    @Author: Artur, Eduardo Função e Jhoe
    @Date: 10/12/2023
    @Credit: ...
    @Links: ...

Menu de funcionalidades para o site da SalesForce
Funcionalidades implementadas:
- Popup de aceite para cookies
- Formulário 
- Paletas de Cores adaptativas.
- Formulário com tipos de Daltonismo e suas respectivas paletas de cor.
-Informações do formúlario
'''

Cor_principal = "Azul claro"
Cor_Secundarias = "Azul escuro"
Acessibilidade = None
d = []
tipos_daltonismo = ["", "Protanopia", "Deuteranopia", "Tritanopia"]
f6 = str
nomes = []
sobrenomes = []
emails = []
qntd_formulario = 0


stop = False
while not stop:
    print('''
    Menu de funcionalidades:
    1. Formulário para contato
    2. Popup para aceite de cookies
    3. Exibir Paleta de cores
    4. Formulário de acessibilidade
    5. Informações do formulário
    6. Sair do programa
''')
    # seleção do usuário
    sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    while sel not in [1, 2, 3, 4, 5, 6]:
                print("Erro! Por favor, digite um número presente na lista.")
                sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    
    if sel == 1:
        # Código para a opção 1
        nomes.append(input("Digite o seu Nome: "))
        sobrenomes.append(input("Digite o seu Sobrenome: "))
        emails.append(input("Email corporativo: "))
        cargo = input("Qual o seu Cargo: ")
        tele = input("Seu telefone: ")
        Empresa = input("Sua empresa: ")

        print("Cadastro feito com sucesso!\nObrigado pela preferência em breve um agente SalesForce entrará em contato!")

        qntd_formulario += 1

    elif sel == 2:
        # Código para a opção 2
        pop = input("Aceita a utilização de cookies? Aceitar(S) Recusar(N): ")
        while pop.upper() not in ["S", "N"]:
            pop = input("Erro, digite S para sim, ou N para não: ")

    elif sel == 3:
        # Código para a opção 3
        print(f"funcionalidade 3: \n{Cor_principal} \n{Cor_Secundarias}")

    elif sel == 4:
        # Código para a opção 4
        f6 = input("funcionalidade 4, você tem algum tipo de Daltonismo? (S/N): ")
        while f6.upper() not in ["S", "N"]:
            f6 = input("Erro, digite S para sim ou N para não: ")
            
        if f6.upper() == "S":
            d_input = int(input("Digite 1 para Protanopia, 2 para Deuteranopia, 3 para Tritanopia: "))
            while d_input not in [1, 2, 3]:
                print("Erro! Por favor, digite um número correspondente ao seu tipo de daltonismo.")
                d_input = int(input("Digite 1 para Protanopia, 2 para Deuteranopia, 3 para Tritanopia: "))
            d.append(d_input)

            if d_input == 1:
                Cor_principal = "Azul Celeste"
                Cor_Secundarias = "Azul Profundo"
                print("Cores atualizadas para Protanopia.\nCor primária: Azul Celeste ##576BAF\nCor secundária: Azul Profundo #163B7B")
            elif d_input == 2:
                Cor_principal = "Azul Denim"
                Cor_Secundarias = "Azul Noite Estrelada"
                print("Cores atualizadas para Deuteranopia.\nCor primária: Azul Denim #436EB5\nCor secundária: Azul Noite Estrelada #193F69")
            elif d_input == 3:
                Cor_principal = "Azul-petróleo"
                Cor_Secundarias = "Verde Floresta"
                print("Cores atualizadas para Tritanopia.\nCor primária: Azul-petróleo #357981\nCor secundária: Verde Floresta #1B4447")
       
    elif sel == 5:
        # Código para a opção 5
        print("Informações do formulário")
        for i in range(qntd_formulario):
            tipo_daltonismo = tipos_daltonismo[d[i]]
            print(f"Nome: {nomes[i]} | Sobrenome: {sobrenomes[i]} | E-mail: {emails[i]} | Tipo de Daltonismo: {tipo_daltonismo}")

    elif sel == 6:
        print("Saindo do programa...")
        stop = True

# Esta mensagem será exibida quando o usuário escolher sair
print("Fim do programa!")


