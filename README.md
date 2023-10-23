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
Essa é uma versão de testes das principais funcionalidades para a aplicação desenvolvida para o site da salesforce.
Para sua utilização, executar o programa methodsTest.java em "\entregaJava\SalesPop\src\funcionalidades\methodsTest.java". Ele será constrolado exclusivamente pelo console e o usuário deve seguir as instruções para realizar os testes.
No código são geradas e populadas instâncias de cada uma das classes, e no programa principal methodsTest seus métodos são testados de acordo com o input do usuário. As funcionalidades implementadas explicitamente dentro do código nessa versão são: 
- Conscentimento ou não dos cookies do site `usuario.cookie.recebeInfo() e usuario.cookie.show();`;
- Formulário de acessibilidade em sequência ao aceite dos cookies `usuario.preferenciasAcessibilidade.recebeInfo() e usuario.preferenciasAcessibilidade.updatePagina()`;
- Campo de pesquisa `usuario.fazPesquisa()`;
- Integração do live chat para conversa com atendente `usuario.enviaMensagem(), atendente.enviaMensagem() e chat.display()`

## Créditos
Desenvolvido por 
> - Artur Lopes Fiorindo 
> - Eduardo Felipe Nunes Função 
> - Jhoe Yoshio Kochi Hashimoto


## Licensa
SalesPop é licensiado com  uma [MIT License](/license.md)