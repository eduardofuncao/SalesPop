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

stop = False
while not stop:
    print('''
    Menu de funcionalidades:
    1. Landing Page
    2. Formulário para contato
    3. Popup para aceite de cookies
    
''')
    # seleção do usuário
    sel = int(input("Digite o código da funcionalidade para acessar as suas funções: "))
    if sel == 1:
        print("funcionalidade 1")
    elif sel == 2:
        print("funcionalidade 2")
    elif sel == 3:
        print("funcionalidade 3")

    # checa se usuário quer continuar
    sel = input("Você deseja testar uma outra funcionalidade do programa? [S]im ou [N]ão: ")
    if sel.upper() == "N":
        stop = True

    
