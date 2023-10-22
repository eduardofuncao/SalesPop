> [!abstract]  Grupo
> - Artur Lopes Fiorindo 553481 
> - Eduardo Felipe Nunes Função 553362 
> - Jhoe Yoshio Kochi Hashimoto 553831  

### Pesquisa de mercado 
Buscando atender aos requisitos do estado da arte para os requisitos de **acessibilidade para websites modernos**, podemos citar duas fontes motivadoras para a busca: o atendimento legal e a melhoria da experiência do usuário para pessoas com necessidades diferenciadas de navegação. 

Em relação ao atendimento legal, podemos citar o **eMAG**[^1], que é desenvolvido pelo governo federal do Brasil. Trata-se do Modelo de Acessibilidade em Governo Eletrônico, um conjunto de diretrizes para nortear o desenvolvimento e adaptação de conteúdos digitais dentro do Brasil, fazendo com que a padronização digital seja feita de forma *padronizada, em coerência com as necessidades do público do país e em conformidade com os padrões internacionais de acessibilidade*.

Um desses padrões é o **WCAG (Web Content Accessibility Guidelines)**[^2],  que é uma versão que inspeira o eMAG, mas tem escopo de aplicação internacional. Ambos os documentos realização suas definições baseados em **quatro princípios norteadores**, procurando garantir que um website seja: 
1. Perceptível; 
2. Operável; 
3. Compreensível; 
4. e Robusto.

Pode-se também citar algumas aplicações e websites modelos desenvolvidos por entidades privadas que representam boas práticas às adequações de acessibilidade no mundo digital. Uma delas são os overlays de acessibilidade, como é o caso do **UserWay**[^3], que representa um menu de acessibilidade que pode ser incluído em outros sites para atender às necessidades de seus usuários. Algumas das funcionalidades que ele pode implementar são: mudança da paleta de cores para usuários daltônicos, alteração do espaçamento do texto e do tamanho de outros componentes para facilitar a navegabilidade para usuários dislexos ou com problemas de visão, leitores de tela para usuários deficientes visuais, entre outros.

Apesar de ser extremamente útil como forma de adaptar um site já criado aos padrões internacionais de acessibilidade, esses tipos de overlays devem ser utilizados com certo resguardo. No documento **Overlay Fact Sheet**[^4]  (documento do qual são signatários diversos profissionais especializados em acessibilidade), uma série de problemas dessas aplicações são elencadas. Principalmente, eles tornam-se desnecessários e não encaixam com o stack tecnológico atual para navegação na web: muitas vezes, funcionalidades implementadas por esses overlays já estão disponíveis por padrão de forma sistêmica, ou podem já estar sendo implementadas por um software adicional do usuário com necessidade de acessibilidade.

É o caso dos leitores de tela. Pessoas com deficiência visual já utilizam softwares como o **NVDA**[^5] ou o **TalkBack**[^6] para utilizar PC's e aparelhos celulares em seu cotidiano. Quando essa mesma aplicação é implementada de forma particular para um determinado website, essas duas tecnologias podem entrar **em conflito**. No exemplo citado, os dois leitores de tela podem ser acionados simultaneamente, impedindo que o usuário deficiente visual interprete corretamente o conteúdo do site.

No geral, outros bons sites exemplares para averiguação de boas práticas de web acessível são os governamentais.
o **site do Governo brasileiro**[^7], como exemplo, possui a funcionalidade skip to content implementada particularmente bem. Essa funcionalidade dá ao usuário que navega pelo teclado a opção de pular diretamente para o conteúdo principal do texto utilizando somente a tecla `tab` e `Enter`, evitando uma navegação truncada, na medida em que os elementos persistente de site (como a navbar), não precisariam ser navegados em cada atualização de página. É possível testar essa funcionalidade [neste link para o site do governo](https://www.gov.br/pt-br). Além disso, o site também possui uma página específica para descrever e instruir o usuário a respeito de todas as funcionalidades relacionadas com acessibilidade para a navegação.

Um último exemplo de site bem desenvolvido para acessibilidade é o site da **Apple**[^8]. Sem tecnologias extravagantes e que impactem seu design, os desenvolvedores da empresa apostam em criar sites bem estruturados e simplificados, garantindo que o próprio usuário com necessidade de acessibilidade tenha flexibilidade de como navegar por suas páginas.


[^1]:  [eMAG - Modelo de Acessibilidade em Governo Eletrônico (governoeletronico.gov.br)](https://emag.governoeletronico.gov.br/)

[^2]: [Web Content Accessibility Guidelines (WCAG) 2.1 (w3.org)](https://www.w3.org/TR/WCAG21/#:~:text=Web%20Content%20Accessibility%20Guidelines%20(WCAG)%202.1%20covers%20a%20wide%20range,making%20Web%20content%20more%20accessible.) 

[^3]: [UserWay | The Leading AI-Powered Web Accessibility Solution](https://userway.org/)

[^4]: [Overlay Fact Sheet](https://overlayfactsheet.com/)

[^5]: [NV Access](https://www.nvaccess.org/)

[^6]: [Google TalkBack](https://support.google.com/accessibility/android/answer/6283677?hl=en)

[^7]:  [GOV.BR (www.gov.br)](https://www.gov.br/pt-br)

[^8]: [Apple](https://www.apple.com/)  

&emsp;
### Escopo de Projeto
Pensando em melhorar a experiência do usuário com **questões de acessibilidade** enquanto interage com o site da Sales Force, a solução proposta procura transformar o fluxo de consentimento dos cookies em uma oportunidade valiosa: a aplicação irá coletar informações importantes sobre as necessidades de acessibilidade do usuário no mesmo formulário/modal de aceite dos cookies e, com base nesses dados, personalizar sua experiência baseado nessas necessidades. A princípio, como forma de **desenvolver um MVP de forma ágil**, as necessidades de pessoas daltônicas serão implementadas de forma introdutória. 
Baseado nisso, as cores e disposição do texto e elementos da tela serão modificados para melhor atender os visitantes. Essas informações também podem ser usadas futuramente (dependendo da preferência do usuário) para alimentar a base de dados da empresa a fim de que a Sales Force possa entender melhor o **perfil de acessibilidade** da pessoa que visite seu portal. 

As **funcionalidades principais** que serão implementadas são:
1. Modificação do modal de aceite de cookies para coletar informações das necessidades de acessibilidade do usuário, modificando a disposição e estilo do site a partir disso;
2. Criação de diferentes perfis de acessibilidade para modificações dos site (inicialmente, somente serão implementados perfis para usuários daltônicos). Para o daltonismo por exemplo, a paleta de cores do site será modificada dependendo se o usuário é daltônico ou não e do tipo de daltonismo;
3. Boa estruturação do site, garantindo que ele possa ser lido por visitantes utilizando leitores de tela e outras ferramentas próprias de acessibilidade (fucnionalidade skip to content, organização dos níveis de headings, etc);
4. Armazenamento de informações do usuário em formulário de contato, incluindo dados relacionados à acessibilidade, garantindo que o atendente salesforce possa oferecer uma experiência mais personalizada para seu cliente.