> [!abstract]  Grupo
> - Artur Lopes Fiorindo 553481 
> - Eduardo Felipe Nunes Função 553362 
> - Jhoe Yoshio Kochi Hashimoto 553831  

Propondo uma solução para melhoria das necessidades de acessibilidade para o site da **Sales Force Brasil**, a seguinte implementação será proposta:
### Objetivo 
Pensando em melhorar a experiência do usuário com **questões de acessibilidade** enquanto interage com o site da Sales Force, a solução proposta procura transformar o fluxo de consentimento dos cookies em uma oportunidade valiosa: a aplicação irá coletar informações importantes sobre as necessidades de acessibilidade do usuário no mesmo formulário/modal de aceite dos cookies e, com base nesses dados, personalizar sua experiência baseado nessas necessidades. A princípio, como forma de **desenvolver um MVP de forma ágil**, as necessidades de pessoas daltônicas e dislexas serão implementadas de forma introdutória. 
Baseado nisso, as cores e disposição do texto e elementos da tela serão modificados para melhor atender nossos visitantes. Essas informações também podem ser usadas futuramente (dependendo da preferência do usuário) para alimentar a base de dados da empresa a fim de que a Sales Force possa entender melhor o **perfil de acessibilidade** da pessoa que visite seu portal. 

### Dados coletados 
Em relação aos dados coletados pela solução, o site irá armazenar algumas informações gerais a respeito do usuário, mas também dados específicos a respeito do das deficiências e necessidades de acessibilidade do visitante. Isso inclui: 
1. *Tipo de deficiência descrita pelo usuário* (inicialmente, serão implementadas tratativas para o daltonismo como teste do sistema); 
2. *Preferências de acessibilidade*, como variáveis binárias para modificar o site com base em uma paleta de cores específica para o daltonismo, o sublinhar de links, tamanho e estilo de fonte, etc.; 
3. O site conterá um *formulário de contato* para que a empresa colete dados a respeito do usuário e possa contatá-lo posteriormente oferecendo seu produto. Algumas das informações coletadas nesse formulário são: nome, cargo e empresa onde trabalha, e-mail e telefone para contato; 
4. De acordo com o aceite ou não de cada tipo de *cookies*, o site também pode armazenar informações relevantes sobre o acesso do usuário para utilização posterior análise estatística e marketing direcionado: tempo de visita e páginas navegadas, cliques feitos, informações de localização, etc.

# DESCREVER FUNCIONAMENTO DO CHAT E DO RELACIONAMENTO COM ATENDENTE
Removi relação atendente formuláro de contato

dados e atributos necessários para persistência
mencionar regras de negocio apuradas e relacionadas as entidades
finalizar dicionario
