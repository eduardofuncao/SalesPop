'''
    @Author: Artur, Eduardo Função e Jhoe
    @Date: 10/12/2023
    @Credit: ...
    @Links: ...

Menu de funcionalidades para o site da SalesForce
Funcionalidades implementadas:
- Popup de aceite para cookies
- Formulário 
- etc.
'''
Cor_principal = ("vermelho")
Cor_Secundarias = ("verde")
Acessibilidade = None
d = int
f6 = str
nome = str

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
        print("funcionalidade 1")
    elif sel == 2:
        print("funcionalidade 2")

    elif sel == 3:
        print(f"funcionalidade 3: \n{Cor_principal} \n{Cor_Secundarias}")

    elif sel == 4:
        f6 = input("funcionalidade 4, você tem algum tipo de Daltonismo? (S/N): ")

        if f6.upper() == "S":
            d = int(input("Digite 1 para Protanopia, 2 para  Deuteranopia, 3 para Tritanopia."))
            if d == 1:
                Cor_principal = "#58550B"
                Cor_Secundarias = "#EACA00"

                print("Cores atualizadas para Protanopia.\n Cor primaria: #58550B \n Cor secundaria: #EACA00")
            elif d == 2:
                Cor_principal = "#AF9620"
                Cor_Secundarias = "#CAB200"
                print("Cores atualizadas para Deuteranopia. \n Cor primaria: #AF9620 \n Cor secundaria: #CAB200")
            elif d == 3:
                Cor_principal = "#FF005A"
                Cor_Secundarias = "#00EAFF"
                print("Core atualizadas para Tritaopia. \n Cor primaria: #FF005A \n Cor secundaria: #00EAFF")
        


        
    
    
    
    

    # checa se usuário quer continuar
    if f6.upper == "N":
        sel = input("Você deseja testar uma outra funcionalidade do programa? [S]im ou [N]ão: ")
        if sel.upper == "N":
            stop = True

    
