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
'''
Cor_principal = ("vermelho")
Cor_Secundarias = ("verde")
Acessibilidade = None
d = int
f6 = str
nome = str
pop = str


stop = False
while not stop:
    print('''
    Menu de funcionalidades:
    1. Formulário para contato
    2. Popup para aceite de cookies
    3. Exibir Paleta de cores
    4. Formulário de acessibilidade
    
''')
    # seleção do usuário
    sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    if sel == 1:
        print("funcionalidade 1, Formulario, preencha os campos a seguir.")
        nome = input("Digite o seu Nome: ")
        sobrenome = input("Digite o seu Sobrenome: ")
        cargo = input("Qual o seu Cargo: ")
        email = input("Email corporativo: ")
        tele = int(input("Seu telefone: "))
        Empresa = input("Sua empresa: ")
        TamEmpresa = int(input("Tamanho da Empresa(Num de funcionários): "))
        print("Cadastro feito com sucesso!\nObrigado pela preferência em breve um agente SalesForce entrará em contato!")



    elif sel == 2:
        print("funcionalidade 2, Nós usamos cookies e outras tecnologias semelhantes para melhorar a sua experiência em nossos serviços. Ao utilizar nossos serviços, você está ciente dessa funcionalidade. ")
        pop = input("Aceita a utilização de cookies? Aceitar(S) Recusar(N): ")
        while((pop.upper() != "S") and (pop.upper() != "N")):
            pop = input("Erro, digite S para sim, ou N para não: ")
    
    
    elif sel == 3:
        print(f"funcionalidade 3: \n{Cor_principal} \n{Cor_Secundarias}")

    elif sel == 4:
        f6 = input("funcionalidade 4, você tem algum tipo de Daltonismo? (S/N): ")
        while((f6.upper() != "S") and (f6.upper() != "N")):
            f6 = input("Erro, digite S para sim ou N para não: ")

        if f6.upper() == "S":
            d = int(input("Digite 1 para Protanopia, 2 para  Deuteranopia, 3 para Tritanopia: "))
            while((d < 1) or (d > 3)):
                print("Erro! Por favor digite um numero correspondente ao seu tipo de daltonismo.")
                d = int(input("Digite 1 para Protanopia, 2 para  Deuteranopia, 3 para Tritanopia."))
                
            if d == 1:
                Cor_principal = "verde-oliva escuro "
                Cor_Secundarias = "amarelo vibrante"

                print("Cores atualizadas para Protanopia.\n Cor primaria: verde-oliva escuro #58550B \n Cor secundaria: amarelo vibrante #EACA00")
            elif d == 2:
                Cor_principal = "amarelo-ouro"
                Cor_Secundarias = "amarelo escuro"
                print("Cores atualizadas para Deuteranopia. \n Cor primaria: amarelo-ouro #AF9620 \n Cor secundaria: amarelo escuro #CAB200")
            elif d == 3:
                Cor_principal = "rosa brilhante"
                Cor_Secundarias = "ciano brilhante"
                print("Core atualizadas para Tritaopia. \n Cor primaria: rosa brilhante #FF005A \n Cor secundaria: ciano brilhante #00EAFF")
       


        
    
    
    
    

    # checa se usuário quer continuar
    if pop.upper == "S":
        if f6.upper == "N":
            sel = input("Você deseja testar uma outra funcionalidade do programa? [S]im ou [N]ão: ")
            if sel.upper == "N":
                stop = True

    
