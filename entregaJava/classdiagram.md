```mermaid

classDiagram
    direction TB
    class Usuario {
        -id: String
        -nome: String
        -email: String
        -telefone: String
        -cargo: String
        -empresa: String
        ------------------------------------------------
        +atualizaPerfil()
        +removePerfil()
        +fazPesquisa()
        +enviaMensagem()

    }

    class Atendente { 
        -id: String
        -nome: String
        -dataNascimento: String
        -telefone: String
        -email: String
        +enviaMensagem()
    }

    class FormularioContato {
        -formID: String
        -campos: String[]
        +recebeInfo()
        +submit()
    }

    class PreferenciasAcessibilidade {
        -id: String
        -tipoDaltonismo: Boolean
        -altoContraste: Boolean
        -linksSublinhados: Boolean
        -modoDislexia: Boolean
        +recebeInfo()
        +submit()
    }

    class Chat {
        -id: String
        -modo: String
        -disponibilidade: String
        -dataInicio: Data
        -historico: String[]
        -ativo: Boolean
        +display()
        +fluxobot()
        +liveChat()
    }

    class Pagina {
        -id
        -url
        -titulo
        -conteudo
        -estilo: 
        -preferencias: Boolean[]
        -linguagem: String
        +display()
        +modificaPaleta()
        +aumentaEspacamento()
        +linksSublinhados()
        +guardaHistorico()
    }

    class Cookies {
        -id: String
        -nome
        -dominio
        -dataExpira
        -preferencias
        -estatistica
        -marketing
        +recebeInfo()
        +submit()
        ---------------------------------
    }

    Atendente -- Usuario
    FormularioContato -- Atendente
    Chat -- Atendente

    Usuario -- FormularioContato
    Usuario -- Cookies
    Usuario -- PreferenciasAcessibilidade
    Usuario -- Chat   
    Usuario -- Pagina

    Cookies -- Pagina
    PreferenciasAcessibilidade -- Pagina

```