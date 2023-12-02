# SalesPop v0.5
Aplicação de acessibilidade para o portal da SalesForce.


## Finalidade
Pensando em melhorar a experiência do usuário com **questões de acessibilidade** enquanto interage com o site da Sales Force, a solução proposta procura transformar o fluxo de consentimento dos cookies em uma oportunidade valiosa: a aplicação irá coletar informações importantes sobre as necessidades de acessibilidade do usuário no mesmo formulário/modal de aceite dos cookies e, com base nesses dados, personalizar sua experiência baseado nessas necessidades.
Baseado nisso, as cores e disposição do texto e elementos da tela serão modificados para melhor atender os visitantes. Essas informações também podem ser usadas futuramente (dependendo da preferência do usuário) para alimentar a base de dados da empresa a fim de que a Sales Force possa entender melhor o **perfil de acessibilidade** da pessoa que visite seu portal. 


## Funcionalidades
As **funcionalidades principais** que serão implementadas são:
1. Modificação do modal de aceite de cookies para coletar informações das necessidades de acessibilidade do usuário, modificando a disposição e estilo do site a partir disso;
2. Criação de diferentes perfis de acessibilidade para modificações dos site (inicialmente, somente serão implementados perfis para usuários daltônicos). Para o daltonismo por exemplo, a paleta de cores do site será modificada dependendo se o usuário é daltônico ou não;
3. Boa estruturação do site, garantindo que ele possa ser lido por visitantes utilizando leitores de tela e outras ferramentas próprias de acessibilidade (fucnionalidade skip to content, organização dos níveis de headings, etc);
4. Armazenamento de informações do usuário em formulário de contato, incluindo dados relacionados à acessibilidade, garantindo que o atendente salesforce possa oferecer uma experiência mais personalizada para seu cliente.
5. Chat para contato com o atendente da Salesforce ou interação com o chatbot.
6. Campo de pesquisa para buscas em todo o site.

## Como usar

### Teste dos Métodos
Essa é uma versão de testes das principais funcionalidades para a aplicação desenvolvida para o site da salesforce.
Para sua utilização, executar o programa **methodsTest.java** em "\entregaJava\SalesPop\src\funcionalidades\methodsTest.java". Ele será constrolado exclusivamente pelo console e o usuário deve seguir as instruções para realizar os testes.
No código são geradas e populadas instâncias de cada uma das classes, e no programa principal methodsTest seus métodos são testados de acordo com o input do usuário. As funcionalidades implementadas explicitamente dentro do código nessa versão são: 
- Conscentimento ou não dos cookies do site `usuario.cookie.recebeInfo() e usuario.cookie.show();`;
- Formulário de acessibilidade em sequência ao aceite dos cookies `usuario.preferenciasAcessibilidade.recebeInfo() e usuario.preferenciasAcessibilidade.updatePagina()`;
- Campo de pesquisa `usuario.fazPesquisa()`;
- Integração do live chat para conversa com atendente `usuario.enviaMensagem(), atendente.enviaMensagem() e chat.display()`

### Rotina de Cadastro de Clientes
Para testar a funcionalidade de cadastro e manejo de usuários do sistema, é possível utilizar o programa **cadastro.java**, que pode ser encontrado em entregaJava\SalesPop\src\funcionalidades\cadastro.java.
Nesse programa, podem-se acessar as seguintes funcionalidades:

1. Cadastro de novo Usuário;
2. Remover Usuário cadastrado;
3. Exibir todos os Usuários cadastrados;

O pograma permita que sejam cadastrados/removidos quantos usuários sejam sua preferência, sendo que o programa pode ser encerrado a qualquer momento.
Todos os dados dos usuários cadastrados são armazenados em ArrayLists de objetos da classe Usuario.

#### Exemplo de utilização da rotina:
A seguir é demonstrado um fluxo padrão para adição, remoção e exibição de usuários dentro do console Java:

```
Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
1
Criação de novo usuário: 
Nome do usuário: 
Eduardo
Email do usuário: 
edu@ardo.com
Telefone do usuário: 
1199998888
Cargo do usuário: 
Estudante
Empresa do usuário: 
Fiap

Usuário cadastrado!
id: 1
nome: Eduardo
email: edu@ardo.com
telefone: 1199998888
cargo: Estudante
empresa: Fiap

Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
1
Criação de novo usuário: 
Nome do usuário: 
Jhoe
Email do usuário: 
jh@oe.com
Telefone do usuário: 
119292983838
Cargo do usuário: 
Estudante
Empresa do usuário: 
Fiap

Usuário cadastrado!
id: 2
nome: Jhoe
email: jh@oe.com
telefone: 119292983838
cargo: Estudante
empresa: Fiap

Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
1
Criação de novo usuário: 
Nome do usuário: 
Artur
Email do usuário: 
ar@tur.com
Telefone do usuário: 
1144883399
Cargo do usuário: 
Perigoso
Empresa do usuário: 
Fiap

Usuário cadastrado!
id: 3
nome: Artur
email: ar@tur.com
telefone: 1144883399
cargo: Perigoso
empresa: Fiap

Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
2
ID: 1 - Nome: Eduardo
ID: 2 - Nome: Jhoe
ID: 3 - Nome: Artur
Gostaria de obter informções detalhadas de algum desses usuários? [S ou N]S
De qual usuário? [escolha pelo ID]2
id: 2
nome: Jhoe
email: jh@oe.com
telefone: 119292983838
cargo: Estudante
empresa: Fiap

Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
3
ID: 1 - Nome: Eduardo
ID: 2 - Nome: Jhoe
ID: 3 - Nome: Artur
Escolha um usuário para remover: 1

Cliente removido!
Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
2
ID: 2 - Nome: Jhoe
ID: 3 - Nome: Artur
Gostaria de obter informções detalhadas de algum desses usuários? [S ou N]N

Menu de Cadastro do usuários:
1 - Crie um usuário novo
2 - Exiba os usuários cadastrados
3 - Remova um usário
4 - Encerrar programa

Digite o número do item que você deseja executar: 
4
```




### Diagrama de Classes
![diagramaClasses](/entregaJava/diagramaClasses.png)

## Créditos
Desenvolvido por 
> - Artur Lopes Fiorindo 
> - Eduardo Felipe Nunes Função 
> - Jhoe Yoshio Kochi Hashimoto


## Licensa
SalesPop é licensiado com  uma [MIT License](/license.md)