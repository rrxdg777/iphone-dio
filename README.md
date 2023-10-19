
## iPhone: Um Dispositivo Multifuncional

O iPhone é um dispositivo revolucionário que incorpora várias funcionalidades, incluindo um reprodutor musical, um telefone e um navegador de internet.

### Funcionalidades Gerais

O iPhone oferece uma ampla gama de funcionalidades gerais, tais como:

- Tocar música
- Pausar música
- Selecionar música
- Fazer ligações telefônicas
- Atender chamadas
- Iniciar conversa por voz
- Exibir páginas da web
- Adicionar novas abas no navegador
- Atualizar páginas da web

### Componentes do iPhone

Para organizar essas funcionalidades, o iPhone pode ser dividido em três componentes principais:

| Componente    | Classe                |
|---------------|-----------------------|
| **iPhone**    |                       |
| - reprodutor  | ReprodutorMusical     |
| - telefone    | AparelhoTelefonico    |
| - navegador   | NavegadorInternet     |

### Funcionalidades Detalhadas

Aqui estão as funcionalidades detalhadas de cada componente:

#### Reprodutor Musical - Classe: ReprodutorMusical

- Tocar música
- Pausar música
- Selecionar música

#### Telefone - Classe: AparelhoTelefonico

- Fazer ligações telefônicas
- Atender chamadas
- Iniciar conversa por voz

#### Navegador de Internet - Classe: NavegadorInternet

- Exibir páginas da web
- Adicionar novas abas no navegador
- Atualizar páginas da web

### Diagrama de Classe

Aqui está o diagrama de classe do iPhone e suas funcionalidades gerais:

#### iPhone

| Componente       | Classe               |
|------------------|----------------------|
| **iPhone**       |                      |
| - reprodutor     | ReprodutorMusical    |
| - telefone       | AparelhoTelefonico   |
| - navegador      | NavegadorInternet    |

#### Funcionalidades Gerais

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + tocarMusica(): void                  | Toca música                             |
| + pausarMusica(): void                 | Pausa a reprodução de música            |
| + selecionarMusica(musica: String): void | Seleciona uma música                   |
| + ligar(numero: String): void          | Faz uma ligação telefônica              |
| + atender(): void                      | Atende uma chamada telefônica           |
| + iniciarConversaVoz(): void           | Inicia uma conversa por voz             |
| + exibirPagina(url: String): void      | Exibe uma página da web                 |
| + adicionarNovaAba(): void             | Adiciona uma nova aba no navegador      |
| + atualizarPagina(): void              | Atualiza a página da web                |

#### ReprodutorMusical

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + tocar(): void                        | Inicia a reprodução de música           |
| + pausar(): void                       | Pausa a reprodução de música            |
| + selecionarMusica(musica: String): void | Seleciona uma música                   |

#### AparelhoTelefonico

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + ligar(numero: String): void          | Faz uma ligação telefônica              |
| + atender(): void                      | Atende uma chamada telefônica           |
| + iniciarConversaVoz(): void           | Inicia uma conversa por voz             |

#### NavegadorInternet

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + exibirPagina(url: String): void      | Exibe uma página da web                 |
| + adicionarNovaAba(): void             | Adiciona uma nova aba no navegador      |
| + atualizarPagina(): void              | Atualiza a página da web                |

